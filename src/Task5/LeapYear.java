package Task5;

import Interface.Task;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear implements Task {

    private final Scanner _scn;

    public LeapYear(Scanner scn){
        _scn = scn;
    }

    @Override
    public void runTask() {
        try {
            System.out.println("Введите год: ");
            int year = _scn.nextInt();

            if(isLeepYear(year)){
                System.out.println(year + " является високосным годом.");
            }else {
                System.out.println(year +  "не является високосным годом.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите корректное целое число для года.");
            _scn.next(); // Очистка неверного ввода
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    /// Определение високосного года
    private boolean isLeepYear(int year){
        return (year % 150 == 0 || year % 4 ==0);
    }
}
