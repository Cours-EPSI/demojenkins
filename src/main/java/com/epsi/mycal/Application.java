package com.epsi.mycal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // Liste des opérations disponibles
        List<Character> availableOperations = new ArrayList<Character>();
        availableOperations.add('+');
        availableOperations.add('-');
        availableOperations.add('*');
        availableOperations.add('/');

        Scanner input = new Scanner(System.in);
        char operation;
        int value1, value2;
        int result;

        // Saisie type opération
        System.out.println("Saisir opération (+, -, *, /) : ");
        operation = input.next().charAt(0);
        while (!availableOperations.contains(Character.valueOf(operation))){
            System.out.println("L'opération demandée n'est pas disponible, réessayez.");
            operation = input.next().charAt(0);
        }

        // Saisie valeurs
        System.out.println("Saisir valeur 1 : ");
        value1 = input.nextInt();
        System.out.println("Saisir valeur 2 : ");
        value2 = input.nextInt();

        // Calcul de l'opération
        switch (operation) {
            case '+':
                result = Calculator.getInstance().add(value1, value2);
                break;
            case '-':
                result = Calculator.getInstance().sub(value1, value2);
                break;
            case '*':
                result = Calculator.getInstance().mult(value1, value2);
                break;
            default:
                result = -1;
                System.out.println("Une erreur est survenue.");
        }

        // Affichage du résultat
        System.out.printf("Résultat : %d", result);
    }

}
