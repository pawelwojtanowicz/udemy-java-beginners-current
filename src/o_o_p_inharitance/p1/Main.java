package o_o_p_inharitance.p1;

import o_o_p_inharitance.p3.B;

public class Main {
    public static void main(String[] args) {

        B b = new B();

        b.v5 = 12; // variable from B are visible here --> this is before writing "extends" in B class

        b.v1 = 54; // now (after writing "extends A" in B class we can see also variables from A class

    }


}