package oop.constructors;

import java.util.Date;

public class Atom {
    String name;
    int atomicNumber;
    double atomicMass;
    Date date;

    public Atom(String name , int atomicNumber , double atomicMass , Date date) {
        this.name = name;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
        this.date = date;
    }

    public Atom(String name, int atomicNumber, double atomicMass){
        this.name = name;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;

    }
    public Atom(String name){
        this.name = name;

    }
}
