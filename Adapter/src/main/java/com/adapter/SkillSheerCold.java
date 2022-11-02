package com.adapter;

class SkillSheerCold implements ISkill {
    public void useSkill() {
        System.out.println("used Sheer Cold!");
    }

    public String getSkillName() {
        return "Sheer Cold";
    }
}