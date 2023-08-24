package com.example.task_organizer;

public class Register
{
    private boolean isUserRegistered(String username) {
        for (User user : SLFile.users) {
            if (user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }
    public  void addUser(String username, String password) {
        if (!isUserRegistered(username)) {
            User newUser = new User(username, password);
            SLFile.users.add(newUser);
            SLFile.saveUserToFile(newUser);
            System.out.println("Account created successfully");
        } else {
            System.out.println("User with username " + username + " is already registered.");
        }
    }
}
