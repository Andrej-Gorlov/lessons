package Task4;

import Interface.Task;
import java.util.Scanner;

public class Progression implements Task {
    //region Variable
    private int num;
    private int type;
    private int startValue;
    private final Scanner _scn;
    //endregion

    public Progression(Scanner scn){
        _scn = scn;
    }

    /// Запрос данных у пользователя
    private void display(){
        System.out.println("Введите количество чисел (N): ");
        this.num =  _scn.nextInt();

        System.out.println("Выберите тип прогрессии (1 - арифметическая, 2 - геометрическая ): ");
        this.type =  _scn.nextInt();

        System.out.println("Введите начальное значение: ");
        this.startValue = _scn.nextInt();
    }

    /// Арифметическоя прогрессия
    private void arithmetic(){
        System.out.println("Введите шаг: ");
        int step = _scn.nextInt();
        System.out.println("Арифметическая прогрессия: ");
        for (int i = 0; i < this.num; i++) {
            System.out.println(this.startValue + i * step + " ");
        }
    }

    /// Геометрической прогрессия
    private void  geometric(){
        System.out.println("Введите множитель: ");
        int multi = _scn.nextInt();
        System.out.println("Геометрическая прогрессия: ");
        for (int i = 0; i < this.num; i++) {
            System.out.println(this.startValue  * Math.pow(multi,i) + " ");
        }
    }

    @Override
    public void runTask() {
        display();

        switch (this.type ){
            case 1:
                arithmetic();
                break;
            case 2:
                geometric();
                break;
            default:
                System.out.println("Неверный тип прогрессии. Пожалуйста, выберите 1 или 2.");
        }
    }
}
