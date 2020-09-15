package com.igeek.javase.ch02.relation.use;

public class Bus {

    private String label;
    private int num;

    public Bus() {
    }

    public Bus(String label, int num) {
        this.label = label;
        this.num = num;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
