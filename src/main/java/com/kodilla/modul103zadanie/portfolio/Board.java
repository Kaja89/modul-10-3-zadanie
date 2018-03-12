package com.kodilla.modul103zadanie.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public void addToToDoList(TaskList tasks) {
        toDoList = tasks;
    }

    public void addToInProgressList(TaskList tasks) {
        inProgressList = tasks;
    }

    public void addToDoneList(TaskList tasks) {
        doneList = tasks;
    }


    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }


}
