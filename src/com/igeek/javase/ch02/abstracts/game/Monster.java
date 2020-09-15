package com.igeek.javase.ch02.abstracts.game;

//怪兽
public class Monster extends Role{

    public Monster() {
    }

    public Monster(String name, String level, int blood, int power, int defence, String kind) {
        super(name, level, blood, power, defence, kind);
    }

    //怪兽拥有基本攻击方法 attack(Hero h)
    @Override
    public void attack(Role h){
        //英雄的失血量 = 怪兽的攻击力 - 英雄的防御力
        int blood = this.getPower() - h.getDefence();

        if(blood>0){
            //产生有效攻击，设置英雄的血量
            h.setBlood(h.getBlood() - blood);
            System.out.println("此回合英雄失血量是："+blood+",英雄剩余血量："+h.getBlood());
        }else{
            //产生无效攻击
            System.out.println("此回合无效攻击！");
        }
    }

}
