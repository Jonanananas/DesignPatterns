package com.adapter;

public class App {
    public static void main(String[] args) {
        IPokemon articuno = new Articuno();

        System.out.println("An Articuno is born!");

        articuno.learnSkill(new SkillMindReader());
        articuno.learnSkill(new SkillIceBeam());
        articuno.learnSkill(new SkillFly());
        articuno.learnSkill(new SkillSheerCold());

        articuno.useSkill(1);
        articuno.useSkill(2);
        articuno.useSkill(3);
        articuno.useSkill(4);
    }
}
