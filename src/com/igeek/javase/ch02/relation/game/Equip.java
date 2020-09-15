package com.igeek.javase.ch02.relation.game;

public class Equip {

    //装备拥有名称name，级别level，颜色color，类别kind，攻击力power，防御力defence
    private String name;
    private String level;
    private String color;
    private String kind;
    private int power;
    private int defence;

    public Equip() {
    }

    public Equip(String name, String level, String color, String kind, int power, int defence) {
        this.name = name;
        this.level = level;
        this.color = color;
        this.kind = kind;
        this.power = power;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    //显示装备信息的方法
    public void show(){
        //装备拥有名称name，级别level，颜色color，类别kind，攻击力power，防御力defence
        System.out.println("装备名称："+name);
        System.out.println("装备级别："+level);
        System.out.println("装备颜色："+color);
        System.out.println("装备类别："+kind);
        System.out.println("装备攻击力："+power);
        System.out.println("装备防御力："+defence);
    }
}
