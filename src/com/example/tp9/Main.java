package com.example.tp9;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DÉBUT DU PROGRAMME TP9 ===");

        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));

        try {
            System.out.println("10 / 2 = " + calc.divide(10, 2));
            System.out.println("10 / 0 = " + calc.divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.err.println("Erreur de calcul : " + e.getMessage());
            LoggerUtil.logError(e.getMessage());
        }

        try {
            User user = new User("", 150);
        } catch (InvalidUserException e) {
            System.err.println("Échec de création utilisateur : " + e.getMessage());
            LoggerUtil.logError(e.getMessage());
        }

        new FileReaderUtil().readFileModern("inexistant.txt");

        System.out.println("=== FIN DU PROGRAMME TP9 ===");
    }
}