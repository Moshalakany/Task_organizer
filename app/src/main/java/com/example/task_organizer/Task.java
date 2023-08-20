package com.example.task_organizer;
import java.time.LocalDate;

public class Task
{
        private int idCounter=0;
        private int taskId;
        private String title;
        private String description;
        private LocalDate dueDate;
        private Priority priority;
        private Status status;

        // Constructor
        public Task(int taskId, String title, String description, LocalDate dueDate, Priority priority, Status status) {
            this.taskId = taskId;
            this.title = title;
            this.description = description;
            this.dueDate = dueDate;
            this.priority = priority;
            this.status = status;
        }

        // Getter and Setter methods for each attribute

        public int getTaskId() {
            return taskId;
        }

        public void setTaskId(int taskId) {
            this.taskId = ++idCounter;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public LocalDate getDueDate() {
            return dueDate;
        }

        public void setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
        }

        public Priority getPriority() {
            return priority;
        }

        public void setPriority(Priority priority) {
            this.priority = priority;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public String printTask()
        {
            return "Task ID: " + taskId + "\nTitle: " + title + "\nDescription: " + description + "\nDue Date: " + dueDate + "\nPriority: " + priority + "\nStatus: " + status;
        }
    }

    // Enumeration for Priority
    enum Priority {
        HIGH, MEDIUM, LOW
    }

    // Enumeration for Status
    enum Status {
        COMPLETED, PENDING
    }


