package com.company;

public class Hero{
    /*● Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность. Написать 2 разных
     конструктора для создания объекта. В одном конструкторе задаются все поля, в другом только здоровье и урон.
     Добавить в класс Hero геттеры для всех полей.*/
    private int health;
    private int damage;
    private String superAbility;

    public Hero(int health, int damage, String superAbility) { // ссылка на текущий объект
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;

    }

}



