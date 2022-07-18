package cursPrincipiiOOP;

import cursPrincipiiOOP.Playable;

public abstract class PlayerCharacter implements Playable {
    private String name;
    private int age;
    private int currentLevel;

    PlayerCharacter(String name, int age, int currentLevel) {
        this.name = name;
        this.age = age;
        this.currentLevel = currentLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run() {
        System.out.println("Player is running");
    }

    public void speak() {
        System.out.println("My name is " + this.name + " and I have " + this.age + " years");
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public abstract void attack();


}
