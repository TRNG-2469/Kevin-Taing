package web;

import com.rev.web.controllers.TodoController;
import com.rev.web.exceptions.ErrorResponse;
import io.javalin.Javalin;

public class TodoApp {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/api/todos", TodoController::getAllTodos);
        app.get("/api/todos/{id}", TodoController::getTodoById);
        app.post("/api/todos", TodoController::createTodo);
        app.put("/api/todos/{id}", TodoController::updateTodoById);
        app.delete("/api/todos/{id}", TodoController::deleteTodoById);

        app.exception(IllegalArgumentException.class, (e, ctx) -> {
            ctx.status(400);
            ctx.json(new ErrorResponse("An unexpected error occured."));
        });

        app.exception(Exception.class, (e, ctx) -> {
            ctx.status(500);
            ctx.json(new ErrorResponse("An unexpected error occured."));
        });
    }
}
