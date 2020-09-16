package com.igeek.javase.ch02.relation.game;

public class Hero {

    //游戏角色拥有昵称name，等级level，血量blood，攻击力power，防御力defence，种族kind
    private String name;
    private String level;
    private int blood;
    private int power;
    private int defence;
    private String kind;

    //装备Equip（只能装3个装备，初始没有装备） 一对多关联关系
    private Equip[] equips = new Equip[3];
    //装备的数量
    private int index = 0;

    public Hero() {
    }

    public Hero(String name, String level, int blood, int power, int defence, String kind) {
        this.name = name;
        this.level = level;
        this.blood = blood;
        this.power = power;
        this.defence = defence;
        this.kind = kind;
    }

    public Hero(String name, String level, int blood, int power, int defence, String kind, Equip[] equips) {
        this.name = name;
        this.level = level;
        this.blood = blood;
        this.power = power;
        this.defence = defence;
        this.kind = kind;
        this.equips = equips;
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

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Equip[] getEquips() {
        return equips;
    }

    public void setEquips(Equip[] equips) {
        this.equips = equips;
    }

    // 游戏角色拥有基本攻击方法（拥有一定几率打出暴击）attack(Monster m)  依赖关系
    public void attack(Monster m){
        //拥有一定几率打出暴击  随机数
        int random = (int)(Math.random()*10+1);
        //暴击率
        int block = 0;
        if(random>3){
            block = random*2;
        }

        //怪兽失血量 = 英雄攻击力 + 暴击率 - 怪兽的防御力
        int blood = this.power + block - m.getDefence();
        if(blood>0){
            //设置怪兽的失血量
            m.setBlood(m.getBlood() - blood);
            System.out.println("此回合怪兽失血量是："+blood+",怪兽剩余血量："+m.getBlood());
        }else{
            //本轮攻击无效
            System.out.println("此回合无效攻击！");
        }
    }

    // 死亡判定方法isDead()
    public boolean isDead(){
        if(this.blood<=0){
            //game over
            return false;
        }
        return true;
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
        this.power+=e.getPower();
        //给英雄加防御力
        this.defence+=e.getDefence();
    }


    // 获取英雄信息的方法show()
    public void show(){
        //英雄拥有名称name，等级level，血量blood，攻击力power，防御力defence，种族kind
        System.out.println("英雄名称："+name);
        System.out.println("英雄级别："+level);
        System.out.println("英雄血量："+blood);
        System.out.println("英雄攻击力："+power);
        System.out.println("英雄防御力："+defence);
        System.out.println("英雄类别："+kind);

        System.out.println("===============装备信息=================");
        for (int i=0;i<index;i++){
            equips[i].show();
            System.out.println("-------------------");
        }
    }
}
