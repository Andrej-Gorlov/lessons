package Task5;

import Interface.Task;
import java.util.Scanner;

public class LeapYear implements Task {

    private final Scanner _scn;

    public LeapYear(Scanner scn){
        _scn = scn;
    }

    @Override
    public void runTask() {
        System.out.println("Введите год: ");
        int year = _scn.nextInt();

        if(isLeepYear(year)){
            System.out.println(year + " является високосным годом.");
        }else {
            System.out.println(year +  "не является високосным годом.");
        }
    }

    /// Определение високосного года
    private boolean isLeepYear(int year){
        return (year % 150 == 0 || year % 4 ==0);
    }
}
