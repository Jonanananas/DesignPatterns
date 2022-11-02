package com.adapter;

import java.util.ArrayList;
import java.util.List;

class Articuno implements IPokemon {
    List<ISkill> skills = new ArrayList<ISkill>();

    public void learnSkill(ISkill skill) {
        skills.add(skill);
        System.out
                .println("As it's move number " + (skills.size()) + " Articuno learned " + skill.getSkillName() + "!");
    }

    public void useSkill(int skillNumber) {
        System.out
                .print("Articuno ");
        skills.get(skillNumber - 1).useSkill();
    }
}