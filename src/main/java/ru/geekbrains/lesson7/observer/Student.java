package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Student(String name) {
        this.name = name;
        minSalary = random.nextDouble(2000, 3000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (minSalary <= salary){
            System.out.printf("Студент %s (%.0f) >>> Мне нужна эта работа! (%s - %.0f)\n",
                    name, minSalary, nameCompany, salary);
            minSalary = salary;
        }
        else{
            System.out.printf("Студент %s (%.0f) >>> Я найду работу получше! (%s - %.0f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }
}
