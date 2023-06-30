package ru.geekbrains.lesson7.observer;

import static ru.geekbrains.lesson7.observer.Description.*;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

//        Student student1 = new Student("A");
//        Object student2 = new Student("B");
//        Observer student3 = new Student("C");

        Vacancy vacancy1 = new Vacancy("Yandex", DEVELOPER, 160000);
        Vacancy vacancy2 = new Vacancy("Google", TESTER, 130000);
        Vacancy vacancy3 = new Vacancy("Mail", ACCOUNTANT, 70000);
        Vacancy vacancy4 = new Vacancy("Sber", CLEANER, 30000);




        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 150000, jobAgency);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");
        Professional kashin = new Professional("Kashin");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(kashin);

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }



    }

}
