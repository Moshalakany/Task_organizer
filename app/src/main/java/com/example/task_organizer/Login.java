package com.example.task_organizer;

public class Login {


    public boolean authenticate(String username, String password) {
        for (User user : SLFile.users)
        {
            if (user.getUserName().equals(username) && user.getPassword().equals(password))
            {
                return  true;
            }
        }
        return false;
    }

}

