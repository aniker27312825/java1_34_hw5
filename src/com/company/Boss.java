package com.company;

public class Boss{

    /* Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты. Добавить в класс геттеры и
        сеттеры для всех полей.*/
    private int health;
    private int damage;
    private String typeOfDefence;


    public  int getHealth(){
        return health;
    }

    public int getDamage(){
        return damage;
    }

    public String getTypeOfDefence(){
        return typeOfDefence;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setTypeOfDefence(String typeOfDefence){
        this.typeOfDefence = typeOfDefence;
    }

}


