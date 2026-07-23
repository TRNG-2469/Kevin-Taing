package com.cohort.tasks;

import java.util.*;

public class TaskManager {
    List<Task> allTasks = new ArrayList<>();
    Set<String> uniqueTitles = new HashSet<>();
    Map<String, Task> taskLookup = new HashMap<>();

    public boolean addTask(Task task) {
        if(uniqueTitles.contains(task.getTitle())) {
            System.out.println("Duplicate task blocked!");
            return false;
        }
        allTasks.add(task);
        uniqueTitles.add(task.getTitle());
        taskLookup.put(task.getTaskId(), task);
        return true;
    }

    public Task getTaskById(String id) {
        return taskLookup.get(id);
    }

    public void printRoster() {
        for(Task t: allTasks) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Task t1 = new Task("T1", "Write Primitives Lab", false);
        Task t2 = new Task("T2", "Configure GitIgnore", false);
        Task t3 = new Task("T3", "Write Primitives Lab", false);

        TaskManager tm = new TaskManager();
        System.out.println(tm.addTask(t1));
        System.out.println(tm.addTask(t2));
        System.out.println(tm.addTask(t3));
        tm.printRoster();
        System.out.println(tm.getTaskById("T2"));
    }
}
