import java.util.ArrayList;

import hu.szit.Convert;

public class TodoApp {
    public TodoApp() {
        TodoService todoService = new TodoService();
        String todoTitles = todoService.getTodoTitles();

        ArrayList<Todo> todoList = Convert.toListObject(todoTitles, Todo.class);
        for (Todo todo : todoList) {
            System.out.println(todo.title);
        }
    }
}