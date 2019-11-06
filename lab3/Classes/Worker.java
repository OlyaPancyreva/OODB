package Classes;

import java.util.Comparator;

//  реализация сотрудников
public class Worker {

    private String name;
    private String number;
    private char gender;
    private double salary;

    public Worker() {

    }

    public Worker(String name, String number, char gender, double salary) {
        this.name = name;
        this.number = number;
        this.gender = gender;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public static Comparator<Worker> SORT_BY_PHONE = new Comparator<Worker>() {
        @Override
        public int compare(Worker one, Worker other) {
            return one.number.compareTo(other.number);
        }
    };

    public static Comparator<Worker> SORT_BY_NAME = new Comparator<Worker>() {
        @Override
        public int compare(Worker one, Worker other) {
            return one.name.compareTo(other.name);
        }
    };


}
