package com.company;

public class Main {

    public static void main(String[] args) {
        /* В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
         Затем распечатать всю информацию о боссе.
        ДЗ на сообразительность:
        ● Добавить метод в классе Main который называется createHeroes, в теле метода необходимо создать 3х героев
         с помощью класса Hero, используя при этом разные варианты конструкторов (либо первый либо второй).
         Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return, как возвращаемый
        результат метода createHeroes.
        ● Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.*/


        Boss houston = new Boss();
        houston.setHealth(700);
        houston.setDamage(50);
        houston.setTypeOfDefence("Power");

        System.out.println("Boss health = " + houston.getHealth() + ", damage = " + houston.getDamage()
                + ", Type of defence = " + houston.getTypeOfDefence());

        int count = 0;
        for (Hero hero : createHeroes()){
            count++;
            System.out.println("Hero "+count + " health "+ hero.getHealth() + ", damage = " + hero.getDamage()+
                    " superAbility "+ hero.getSuperAbility());


        }


    }
    public  static Hero[] createHeroes(){
        Hero archer = new Hero(200,60,"Arbalet");
        Hero strongMan = new Hero (500, 40);
        Hero magician = new Hero (600, 70, "magic");

        return new Hero[]{archer,strongMan,magician};
    }
}

