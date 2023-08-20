package com.example.task_organizer;

import java.util.ArrayList;
import java.util.List;

public class CategoryList
{
    public List<Category> categories;

    public CategoryList() {
        categories = new ArrayList<>();
    }
    public void addCategory(Category category) {
        categories.add(category);
    }

    // Remove a category from the list
    public void removeTask(Category category) {
        categories.remove(category);
    }

    // Get all Categories in the list
    public List<Category> getAllCategories() {
        return categories;
    }

    public Category getCategoryByName(String catName) {
        for (Category category : categories) {
            if (category.getCategoryName().equals(catName)) {
                return category;
            }
        }
        return null; // Category with the specified Name not found
    }
}
