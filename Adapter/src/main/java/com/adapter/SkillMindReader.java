package com.adapter;

class SkillMindReader implements ISkill {
    public void useSkill() {
        System.out.println("used Mind Reader!");
    }

    public String getSkillName() {
        return "Mind Reader";
    }
}