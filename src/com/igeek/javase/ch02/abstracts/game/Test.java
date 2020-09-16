package com.igeek.javase.ch02.abstracts.game;

public class Test {

    public static void main(String[] args) {

        Equip e1 = new Equip("倚天剑","8","银色","宝剑",120,50);
        Equip e2 = new Equip("屠龙刀","8","金色","宝刀",100,90);
        Equip e3 = new Equip("短刀","3","银色","小刀",60,60);

        Role hero = new Hero("剑圣","8",600,100,80,"兽类");
        Monster monster = new Monster("哥斯拉","8",600,160,80,"怪兽");

        //添加装备
        //hero.addEquip(e1);
        //hero.addEquip(e2);
        //hero.addEquip(e3);

        //判断前者hero的运行期类型是否是后者Hero
        if(hero instanceof Hero){
            ((Hero)hero).addEquip(e3);
        }

        hero.show();
        monster.show();

        //回合制攻击
        int count = 0;
        while(true){
            count++;
            System.out.println("============当前第"+count+"回合=============");

            //英雄先发起攻击
            hero.attack(monster);
            //判断怪兽是否死亡
            if(!monster.isDead()){
                System.exit(0);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //怪兽发起攻击
            monster.attack(hero);
            if(!hero.isDead()){
                System.exit(0);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
