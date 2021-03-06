package oop2.module03.abcd;

import org.junit.jupiter.api.Test;

class BoxTest {

    @Test
    public void testGenerics(){

        Box<A> aBox = new Box<>();
        Box<B> bBox = new Box<>();
        Box<C> cBox = new Box<>();
        Box<D> dBox = new Box<>();

        // u6
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        D d1 = new D();

        aBox.setValue(a1);
        aBox.setValue(b1);
        aBox.setValue(c1);
        aBox.setValue(d1);

        // bBox.setValue(a1); // req. type B, provided A
        bBox.setValue(b1);
        // bBox.setValue(c1); // req. type B, provided C
        bBox.setValue(d1);
        // cBox.setValue(a1); // req. type C, provided A
        // cBox.setValue(b1); // req. type C, provided B
        cBox.setValue(c1);
        // cBox.setValue(d1); // req. type C, provided D

        // dBox.setValue(a1); // req. type D, provided A
        // dBox.setValue(b1); // req. type D, provided B
        // dBox.setValue(c1); // req. type D, provided C
        dBox.setValue(d1);

        // U8
        a1 = bBox.getValue();
        b1 = bBox.getValue();
        // c1 = bBox.getValue(); // fail, weil nur gleichewerigesKlasse oder superklasse
        //  d1 = bBox.getValue();

        // U9
        aBox= aBox;
        dBox= dBox;
        // aBox = bBox; // rewuired Box<D<,provided required Box<C
        // dBox= cBox; // rewuired Box<D<,provided required Box<C


    }

}