package com.company;

public class Main {


    public static void main(String[] args) {

        Hero Magic = new Magic();
        HavingSuperAbility[] HavingSuperAbilitys = {Magic, new Medic(), new Warrior()};

        for (int i = 0; i < HavingSuperAbilitys.length; i++) {
            HavingSuperAbilitys[i].applySuperAbility(" ");

        }
    }
}


