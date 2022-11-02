package com.adapter;

class SkillIceBeam implements ISkill {
    public void useSkill() {
        System.out.println("used Ice Beam!");
    }

    public String getSkillName() {
        return "Ice Beam";
    }
}