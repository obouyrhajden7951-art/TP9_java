package com.example.tp9;

public class User {
    private String username;
    private int age;

    public User(String username, int age) throws InvalidUserException {
        if (username == null || username.trim().isEmpty()) {
            throw new InvalidUserException("Le nom d'utilisateur ne peut pas être vide.");
        }
        if (age < 0 || age > 120) {
            throw new InvalidUserException("L'âge doit être compris entre 0 et 120 ans.");
        }
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}
