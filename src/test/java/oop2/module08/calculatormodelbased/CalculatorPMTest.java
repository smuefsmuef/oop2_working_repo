package oop2.module08.calculatormodelbased;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * @author Dieter Holz
 */
class CalculatorPMTest {
	private CalculatorPM sut;

	@BeforeEach
	void setup() {
		sut = new CalculatorPM();
	}

	@Test
	void testInitialState() {
		assertEquals(0.0, sut.getValue());
		assertNull(sut.getLastOperator());
	}

	@Test
	void testTyping() {
		//given

		//when
		sut.processNewInput('1');
		sut.processNewInput('0');
		sut.processNewInput('9');

		//then
		assertEquals(109.0, sut.getValue());
	}

	@Test
	void testAddDot(){
		//given
		sut.processNewInput('1');
		sut.processNewInput('2');

		//when
		sut.addDot();
		sut.processNewInput('3');
		sut.processNewInput('4');

		//then
		assertEquals(12.34, sut.getValue());
	}

	@Test
	void testNegate(){
		//given
		sut.addToUserFacingString('1');
		sut.addToUserFacingString('2');
		sut.addDot();
		sut.addToUserFacingString('3');
		sut.addToUserFacingString('4');

		//when
		sut.negate();

		//then
		assertEquals(-12.34, sut.getValue());
	}

	@Test
	void addFirstOperation(){
		//given
		sut.addToUserFacingString('1');

		//when
		sut.setOperator(CalculatorPM.Operator.PLUS);

		//then
		assertEquals(1.0, sut.getValue());
		assertSame(CalculatorPM.Operator.PLUS, sut.getLastOperator());
	}

	@Test
	void addSecondOperand(){
		//given
		sut.addToUserFacingString('1');
		sut.setOperator(CalculatorPM.Operator.PLUS);

		//when
		sut.addToUserFacingString('2');

		//then
		assertEquals(1.0, sut.getFirstOperand());
		assertEquals(2.0, sut.getValue());
	}

	@Test
	void testEqual(){
		//given
		sut.addToUserFacingString('1');
		sut.setOperator(CalculatorPM.Operator.PLUS);
		sut.addToUserFacingString('2');

		//when
		sut.equal();

		//then
		assertNull(sut.getLastOperator());
		assertEquals(3.0, sut.getFirstOperand());
		assertEquals(3.0, sut.getValue());
	}

	@Test
	void testProceedCalculationAfterEqual(){
		//given
		sut.addToUserFacingString('1');
		sut.setOperator(CalculatorPM.Operator.PLUS);
		sut.addToUserFacingString('2');
		sut.equal();

		//when
		sut.setOperator(CalculatorPM.Operator.MULTIPLY);
		sut.addToUserFacingString('3');
		sut.setOperator(CalculatorPM.Operator.MINUS);

		//then
		assertEquals(9.0, sut.getFirstOperand());
		assertSame(CalculatorPM.Operator.MINUS, sut.getLastOperator());
		assertEquals(9.0, sut.getValue());
	}

	@Test
	void testCalculationSequence(){
		//given
		sut.addToUserFacingString('1');
		sut.setOperator(CalculatorPM.Operator.PLUS);
		sut.addToUserFacingString('2');
		sut.setOperator(CalculatorPM.Operator.MULTIPLY); // 3
		sut.addToUserFacingString('3');
		sut.negate();
		sut.setOperator(CalculatorPM.Operator.MINUS); // -9
		sut.addToUserFacingString('3');
		sut.setOperator(CalculatorPM.Operator.DIVIDE); // -12
		sut.addToUserFacingString('5');


		//when
		sut.equal();

		//then
		assertEquals(-2.4, sut.getFirstOperand());
		assertEquals(-2.4, sut.getValue());
	}

	@Test
	void testClear(){
		//given
		sut.addToUserFacingString('1');
		sut.setOperator(CalculatorPM.Operator.PLUS);
		sut.addToUserFacingString('2');
		sut.equal();

		//when
		sut.clear();
		sut.addToUserFacingString('3');
		sut.setOperator(CalculatorPM.Operator.PLUS);
		sut.addToUserFacingString('4');
		sut.equal();

		//then
		assertEquals(7.0, sut.getFirstOperand());
		assertEquals(7.0, sut.getValue());
	}

	@Test
	void testClearIntermediate(){
		//given
		sut.addToUserFacingString('1');
		sut.setOperator(CalculatorPM.Operator.PLUS);
		sut.addToUserFacingString('2');

		//when
		sut.clear();
		sut.addToUserFacingString('3');
		sut.setOperator(CalculatorPM.Operator.PLUS);
		sut.addToUserFacingString('4');
		sut.equal();

		//then
		assertEquals(7.0, sut.getFirstOperand());
		assertEquals(7.0, sut.getValue());
	}

}