package com.kodilla.modul103zadanie.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList(){
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addToList(String task){
        tasks.add(task);
        System.out.println("New task: " + task +" added to list");
    }
}
