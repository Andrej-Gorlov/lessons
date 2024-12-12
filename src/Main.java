import Implementations.BaseService;
import Task1.FindMinNumber;
import Task2.DescriptionNumber;
import Task3.MultiplicationTable;
import Task4.Progression;
import Task5.LeapYear;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in).useLocale(Locale.ENGLISH);
        BaseService service = new BaseService();

        System.out.println("\n Вывод наименьшего числа");
        service.setTask(new FindMinNumber(scn));
        service.start();

        System.out.println("\n Описание введенного числа");
        service.setTask(new DescriptionNumber(scn));
        service.start();

        System.out.println("\n Таблица умножения");
        service.setTask(new MultiplicationTable());
        service.start();

        System.out.println("\n Вывод арифметической или геометрической прогрессии");
        service.setTask(new Progression(scn));
        service.start();

        System.out.println("\n Определение високосного года");
        service.setTask(new LeapYear(scn));
        service.start();

        scn.close();
    }
}