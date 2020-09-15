package com.igeek.javase.ch02.abstracts.game;

//英雄
public class Hero extends Role {

    //装备Equip（只能装3个装备，初始没有装备） 一对多关联关系
    private Equip[] equips = new Equip[3];
    //装备的数量
    private int index = 0;

    public Hero() {
    }

    public Hero(String name, String level, int blood, int power, int defence, String kind) {
        super(name, level, blood, power, defence, kind);
    }

    public Equip[] getEquips() {
        return equips;
    }

    public void setEquips(Equip[] equips) {
        this.equips = equips;
    }

    // 游戏角色拥有基本攻击方法（拥有一定几率打出暴击）attack(Monster m)  依赖关系
    @Override
    public void attack(Role m){
        //拥有一定几率打出暴击  随机数
        int random = (int)(Math.random()*10+1);
        //暴击率
        int block = 0;
        if(random>3){
            block = random*2;
        }

        //怪兽失血量 = 英雄攻击力 + 暴击率 - 怪兽的防御力
        int blood = this.getPower() + block - m.getDefence();
        if(blood>0){
            //设置怪兽的失血量
            m.setBlood(m.getBlood() - blood);
            System.out.println("此回合怪兽失血量是："+blood+",怪兽剩余血量："+m.getBlood());
        }else{
            //本轮攻击无效
            System.out.println("此回合无效攻击！");
        }
    }


    // 添加装备的方法addEquip(Equip e)
    public void addEquip(Equip e){
        if(index>=equips.length){
            System.out.println("装备已满");
            return;
        }
        //添加装备
        equips[index++] = e;
        //给英雄加攻击力
        this.setPower(e.getPower()+this.getPower());
        //给英雄加防御力
        this.setDefence(e.getDefence()+this.getDefence());
    }


    // 获取英雄信息的方法show()
    public void show(){
        System.out.println("============英雄信息===========");
        super.show();

        System.out.println("===============装备信息=================");
        for (int i=0;i<index;i++){
            equips[i].show();
            System.out.println("-------------------");
        }
    }
}
