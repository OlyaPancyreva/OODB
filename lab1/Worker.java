import java.util.List;
import java.util.Scanner;

//  реализация сотрудников
public class Worker extends Person {
    Scanner in = new Scanner(System.in);
    List<Person> listOfWorker;

    Worker(String name, String number, char gender, double salary) {
        super(name, number, gender, salary);
    }

    //    нанять нового сотрудника
    public void addWorker() {
        System.out.print("Введите имя нового сотрудника: ");
        String name = in.next();
        System.out.print("Номер телефона: ");
        String number = in.next();
        System.out.print("Введите пол: ");
        char gender = in.next().charAt(0);
        System.out.print("Зарплата: ");
        double salary = in.nextDouble();
        listOfWorker.add(new Person(name, number, gender, salary));
    }

    //    уволить сотрудника
    public void dismiss() {
        System.out.println("Введите имя сотрудника, которого вы хотите уволить:");
        String name = in.next();
        for (Person list : listOfWorker) {
            if (list.getName().equals(name)) {
                listOfWorker.remove(name);
            }
        }
    }

    //    вывод на экран всех сотрудников
    public void printWorker() {
        System.out.println(listOfWorker);
    }
}
