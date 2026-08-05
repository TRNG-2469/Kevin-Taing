package com.rev.web.repository;

import com.rev.web.model.Todo;
import com.rev.web.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TodoDAO {
    public static List<Todo> getAllTodos() {
        String sql = "SELECT * FROM todos";
        try(Connection conn = ConnectionFactory.getInstance().getConnection()){
            PreparedStatement prep = conn.prepareStatement(sql);
            try (ResultSet result = prep.executeQuery()){
                List<Todo> todos = new ArrayList<>();
                while(result.next()){
                    int id = result.getInt(1);
                    String title = result.getString(2);
                    boolean completed = result.getBoolean(3);

                    Todo todo = new Todo(id, title, completed);
                    todos.add(todo);
                }
                return todos;
            }
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public static Todo getTodoById(int id) {
        String sql = "SELECT * FROM todos";
        try(Connection conn = ConnectionFactory.getInstance().getConnection()) {
            PreparedStatement prep = conn.prepareStatement(sql);
            try (ResultSet result = prep.executeQuery()){
                List<Todo> todos = new ArrayList<>();
                if(result.next()){
                    return new Todo(id, result.getString(2), result.getBoolean(3));
                }
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Todo createTodo(Todo todo) {
        String sql = "INSERT INTO todos (title, completed) VALUES (?, ?)";
        try(Connection conn = ConnectionFactory.getInstance().getConnection()){
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setString(1, todo.getTitle());
            prep.setBoolean(2, todo.isCompleted());

            prep.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return todo;
    }

    public static Todo updateTodoById(Todo todo) {
        String sql = "UPDATE todos SET title = ?, completed = ? WHERE id = ?";
        try(Connection conn = ConnectionFactory.getInstance().getConnection()){
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setString(1, todo.getTitle());
            prep.setBoolean(2, todo.isCompleted());
            prep.setInt(3, todo.getId());

            prep.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return todo;
    }

    public static void deleteTodoById(int id) {
        String sql = "DELETE FROM todos WHERE id = ?";
        try(Connection conn = ConnectionFactory.getInstance().getConnection()){
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setInt(1, id);

            prep.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
