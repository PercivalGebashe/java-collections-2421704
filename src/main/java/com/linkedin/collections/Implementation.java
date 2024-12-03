package com.linkedin.collections;

public class Implementation implements Contract  {


    @Override
    public void term1() {
        System.out.println("Imp:Term1");
    }

    @Override
    public void term2() {
        System.out.println("Imp:Term2");
    }

    @Override
    public void extendedTerm() {
        System.out.println("Imp:ExtendedTerm");
    }
}
