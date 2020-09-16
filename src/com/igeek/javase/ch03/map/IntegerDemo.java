package com.igeek.javase.ch03.map;

public class IntegerDemo /*implements Comparable<IntegerDemo>*/{

    private Integer i;

    public IntegerDemo() {
    }

    public IntegerDemo(Integer i) {
        this.i = i;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "IntegerDemo{" +
                "i=" + i +
                '}';
    }

    /*@Override
    public int compareTo(IntegerDemo o) {
        return this.i.compareTo(o.i);
    }*/
}
