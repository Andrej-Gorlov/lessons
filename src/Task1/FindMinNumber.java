package Task1;

import Interface.Task;
import java.util.Scanner;

public class FindMinNumber implements Task {

    //region Variable
    private double num1; // первое число
    private double num2; // ворое число
    private double min; // минимальное число
    private final Scanner _scn;
    //endregion

    public FindMinNumber(Scanner scn){
        _scn = scn;
    }

    /// Запрос данных у пользователя
    private void display(){
        System.out.println("Введите первое число: ");
        this.num1 = _scn.nextDouble();

        System.out.println("Введите второе число: ");
        this.num2 = _scn.nextDouble();
    }

    /// Поиск минимального числа
    private void searchMinNum(){
        this.min = Math.min(this.num1, this.num2);
    }

    @Override
    public void runTask() {
        display();
        searchMinNum();
        System.out.println("Минимальное число: " + this.min);
    }
}
