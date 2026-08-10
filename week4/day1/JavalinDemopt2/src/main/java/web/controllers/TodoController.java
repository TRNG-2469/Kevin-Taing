package web.controllers;

import com.rev.web.model.Todo;
import com.rev.web.service.TodoService;
import io.javalin.http.Context;

public class TodoController {
    private static TodoService todoService;

    public TodoController() {
        todoService = new TodoService();
    }

    public static void getAllTodos(Context ctx) {
        ctx.json(todoService.getAllTodos());
    }

    public static void getTodoById(Context ctx) {
        ctx.json(todoService.getTodoById(Integer.parseInt(ctx.pathParam("id"))));
    }

    public static void createTodo(Context ctx) {
        ctx.status(201).json(todoService.createTodo(ctx.bodyAsClass(Todo.class)));
    }

    public static void updateTodoById(Context ctx) {
        ctx.json(todoService.updateTodoById(ctx.bodyAsClass(Todo.class)));
    }

    public static void deleteTodoById(Context ctx) {
        todoService.deleteTodoById(Integer.parseInt(ctx.pathParam("id")));
        ctx.status(204).result("Todo deleted successfully.");
    }
}
