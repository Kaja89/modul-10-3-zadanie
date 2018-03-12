package com.kodilla.modul103zadanie.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAddToDo() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.modul103zadanie");
        BoardConfig boardConfig = context.getBean(BoardConfig.class);

        //When
        TaskList toDoTask = boardConfig.createTaskList();
        toDoTask.addToList("Learn more about spring");

        Board board = boardConfig.createBoard();
        board.addToToDoList(toDoTask);

        String result = board.getToDoList().getTasks().get(0);

        //Then
        Assert.assertEquals("Learn more about spring", result);
    }

    @Test
    public void testTaskAddInProgress() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.modul103zadanie");
        BoardConfig boardConfig = (BoardConfig) context.getBean("boardConfig");

        //When
        TaskList inProgressTask = boardConfig.createTaskList();
        inProgressTask.addToList("Write tests");

        Board board = boardConfig.createBoard();
        board.addToInProgressList(inProgressTask);

        String result = board.getInProgressList().getTasks().get(0);

        //Then
        Assert.assertEquals("Write tests", result);
    }

    @Test
    public void testTaskAddDone() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.modul103zadanie");
        BoardConfig boardConfig = context.getBean(BoardConfig.class);

        //When
        TaskList doneTask = boardConfig.createTaskList();
        doneTask.addToList("Write calculator");

        Board board = boardConfig.createBoard();
        board.addToDoneList(doneTask);

        String result = board.getDoneList().getTasks().get(0);

        //Then
        Assert.assertEquals("Write calculator", result);
    }
}
