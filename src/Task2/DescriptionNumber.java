package Task2;

import Interface.Task;
import java.util.Scanner;

public class DescriptionNumber implements Task {
    //region Variable
    private int num;
    private String sing;
    private String parity;
    private final Scanner _scn;
    //endregion
    public DescriptionNumber(Scanner scn) {
        _scn = scn;
    }

    /// Определение знака числа
    private void definitionSign(){
        switch (Integer.signum(this.num)){
            case -1:
                this.sing = "отрицательное";
                break;
            case 0:
                this.sing = "ноль";
                break;
            case 1:
                this.sing = "положительное";
                break;
            default:
                sing = "неизвестное";
        }
    }

    /// Определение четности числа
    private void definitionParity(){
        switch (this.num % 2 ){
            case 0:
                this.parity = "четное";
                break;
            case 1:
            case -1:
                this.parity = "нечетное";
                break;
            default:
                parity = "неизвестное";
        }
    }

    @Override
    public void runTask() {
        System.out.println("Введите число: ");
        this.num = _scn.nextInt();
        definitionSign();
        definitionParity();
        System.out.printf("Число " + this.num + " является " + this.sing + " и " + this.parity);
    }
}