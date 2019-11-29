package com.todo;

import com.todo.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todolist;

    public void initialize(){
        TodoItem item1 = new TodoItem("Buy a card", "buy a birthday card for john", LocalDate.of(2019, Month.DECEMBER, 25));
        TodoItem item2 = new TodoItem("Buy chips", "buy a chips to take on a trip", LocalDate.of(2020, Month.MARCH, 25));

        todolist = new ArrayList<TodoItem>();
        todolist.add(item1);
        todolist.add(item2);
    }
}
