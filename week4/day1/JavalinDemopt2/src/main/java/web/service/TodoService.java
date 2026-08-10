package web.service;

import com.rev.web.model.Todo;
import com.rev.web.repository.TodoDAO;
import io.javalin.http.NotFoundResponse;
import java.util.List;


public class TodoService {
    private static final TodoDAO todoDAO = new TodoDAO();

    public static List<Todo> getAllTodos() {
        return todoDAO.getAllTodos();
    }

    public static Todo getTodoById(int id) {
        Todo todo = todoDAO.getTodoById(id);
        if (todo != null) {
            return todo;
        } else {
            throw new NotFoundResponse("Todo with id " + id + " not found.");
        }
    }

    public static Todo createTodo(Todo todo) {
        return todoDAO.createTodo(todo);
    }

    public static Todo updateTodoById(Todo todo) {
        if(getTodoById(todo.getId()) != null) {
            return todoDAO.updateTodoById(todo);
        } else {
            throw new NotFoundResponse("Todo with id " + todo.getId() + " not found.");
        }
    }

    public static void deleteTodoById(int id) {
        if(getTodoById(id) != null) {
            todoDAO.deleteTodoById(id);
        } else {
            throw new NotFoundResponse("Todo with id " + id + " not found.");
        }
    }
}
