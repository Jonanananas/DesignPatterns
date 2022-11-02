package com.adapter;

class SkillFly implements ISkill {
    public void useSkill() {
        System.out.println("used Fly!");
    }

    public String getSkillName() {
        return "Fly";
    }
}