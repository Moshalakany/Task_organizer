package com.example.task_organizer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public  class   SLFile

{
    static List<User> users=new ArrayList<>();
    public static void saveUserToFile(User user) {
        try (FileWriter fileWriter = new FileWriter("users.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(user.getUserName() + "," + user.getPassword());
            bufferedWriter.newLine();

            System.out.println("User data saved to users.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readUsersFromFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length == 2) {
                    User user = new User(userData[0], userData[1]);
                    users.add(user);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


