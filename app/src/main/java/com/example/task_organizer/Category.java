package com.example.task_organizer;

public class Category
{
    private int idCounter=0;
    private String categoryName;
    private String categoryDescription;
    private int categoryId;
    private int taskCounter;
    private TaskList newCategory =new TaskList();

    public Category(String categoryName)
    {
        this.categoryName = categoryName;
    }

    public String getCategoryName()
    {
        return categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = ++idCounter;
    }

    public int getTaskCounter() {
        return newCategory.getTaskCounter();
    }

    public void setTaskCounter(int taskCounter) {
        this.taskCounter = taskCounter;
    }

    public TaskList getNewCategory() {
        return newCategory;
    }

    public void setNewCategory(TaskList newCategory) {
        this.newCategory = newCategory;
    }
}
