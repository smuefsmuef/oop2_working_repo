package oop2.module08.colormixer_solution;

import javafx.scene.paint.Color;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dieter Holz
 */
class ColorMixerPMTest {

	@Test
	void testColor() {
		//given
		ColorMixerPM colorMixer = new ColorMixerPM();

		//when
		colorMixer.setRed(255);
		colorMixer.setGreen(0);
		colorMixer.setBlue(0);

		//then
		assertEquals(Color.rgb(255, 0, 0), colorMixer.getColor());

		//when
        colorMixer.setBlue(255);

        //then
        assertEquals(Color.rgb(255, 0, 255), colorMixer.getColor());
	}

}