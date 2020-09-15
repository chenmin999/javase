package com.igeek.javase.ch02.relation.has;

public class Phone {

    private String label;
    private String color;

    public Phone() {
    }

    public Phone(String label, String color) {
        this.label = label;
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showPhone(){
        System.out.println("品牌："+label);
        System.out.println("颜色："+color);
    }

}
