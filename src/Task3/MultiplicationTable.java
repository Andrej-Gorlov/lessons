package Task3;

import Interface.Task;

public class MultiplicationTable implements Task {
    @Override
    public void runTask() {
        for(int i = 1; i <= 10; i++){
            for (int j = 1; j < 10; j++) {
                System.out.print( i + " x " + j + " = " + i * j + "  |  ");
            }
            System.out.println();
        }
    }
}
