package Implementations;

import Interface.Task;

public class BaseService {

    private Task _task;

    public void setTask(Task task){
        _task = task;
    }

    public void start(){
        _task.runTask();
    }
}
