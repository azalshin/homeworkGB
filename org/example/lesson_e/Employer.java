package org.example.lesson_e;

public class Employer {
    String FIO;
    String workPosition;
    String telephone;
    String email;
    double salary;
    int age;



    Employer (String FIO, int age, String workPosition, String telephone, String email, double salary)
    {
        this.FIO = FIO;
        this.workPosition = workPosition;
        this.telephone = telephone;
        this.email = email;
        this.salary = salary;
        this.age = age;

    }

    String name()
    {
        return FIO;
    }
    int Age()
    {
        return this.age;
    }

    double Salary()
    {
        return this.salary;
    }

    void aboutMe ()
    {
        System.out.printf("Information about me: \n" +
                "FIO: %s \n" +
                "Age: %s \n" +
                "Work Position: %s \n" +
                "Telephone: %s \n" +
                "Email: %s \n" +
                "Salary: %s \n", FIO, age, workPosition, telephone, email, salary);
    }
}
