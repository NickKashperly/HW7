package ru.geekbrains.lesson7.observer;

import java.util.Random;
import static ru.geekbrains.lesson7.observer.Description.*;
public class Professional implements Observer{

    private static Random random = new Random();

    private String name;


    private Description description;

    private double minSalary;

    public Professional(String name) {
        this.name = name;
        description = DEVELOPER;
        minSalary = random.nextDouble(120000, 130000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (minSalary <= salary & this.description==Description.DEVELOPER){
            System.out.printf("Профессионал %s (%.0f) >>> Мне нужна эта работа! (%s - %.0f)\n",
                    name, minSalary, nameCompany, salary);

        }
        else{
            System.out.printf("Профессионал %s (%.0f) >>> Я найду работу получше! (%s - %.0f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }



    public void vacancy(String nameCompany, double salary) {
        if (minSalary <= salary & description==Description.DEVELOPER){
            System.out.printf("Профессионал %s (%.0f) >>> Мне нужна эта работа! (%s - %.0f)\n",
                    name, minSalary, nameCompany, salary);

        }
        else{
            System.out.printf("Профессионал %s (%.0f) >>> Я найду работу получше! (%s - %.0f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }
}
