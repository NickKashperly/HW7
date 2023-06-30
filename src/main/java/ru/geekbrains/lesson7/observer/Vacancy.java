package ru.geekbrains.lesson7.observer;

import java.util.Objects;
import java.util.Random;

public class Vacancy {
    private static Random random = new Random();
    private String nameCompany;
    private Description description;

    private double maxSalary;

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = Description.valueOf(description);
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Vacancy() {
    }

    public Vacancy(String nameCompany, Description description, double maxSalary) {
        this.nameCompany = nameCompany;
        this.description = description;
        this.maxSalary = maxSalary;
    }

    public void vacancy(String nameCompany, Description description, double maxSalary){


    }




}

