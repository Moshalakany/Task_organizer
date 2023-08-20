package com.example.task_organizer;
import java.util.ArrayList;
import java.util.List;
public class TaskList
{

     private int  taskCounter=0;
    private List<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    // Add a task to the list
    public void addTask(Task task) {
        tasks.add(task);
        taskCounter++;
    }

    // Remove a task from the list
    public void removeTask(Task task) {
        tasks.remove(task);
        taskCounter--;
    }

    // Get all tasks in the list
    public List<Task> getAllTasks() {
        return tasks;
    }

    public int getTaskCounter() {
        return taskCounter;
    }

    public void setTaskCounter(int taskCounter) {
        this.taskCounter = taskCounter;
    }

    // Get a task by its task ID
    public Task getTaskById(int taskId) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                return task;
            }
        }
        return null; // Task with the specified ID not found
    }
    public Task getTaskByName(String taskName) {
        for (Task task : tasks) {
            if (task.getTitle().equals(taskName)) {
                return task;
            }
        }
        return null; // Task with the specified ID not found
    }
}
