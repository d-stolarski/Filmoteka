package com.example.logic;

import com.example.data.ApplicationDatabase;
import com.example.data.Option;

import java.util.Scanner;

public class ApplicationController {

    Scanner scan = new Scanner(System.in);
    ApplicationDatabase applicationDatabase = new ApplicationDatabase();
    Option option;

    public void mainLoop() {
        do {
            printMainMenu();
            option = userChoice(scan.nextInt());
            switch (option) {
                case ADD_FILM:
                    applicationDatabase.addMovie();
                    break;
                case ADD_TVSERIES:
                    applicationDatabase.addTvSeries();
                    break;
                case ADD_ACTOR:
                    applicationDatabase.addActors();
                    break;
                case SHOW_INFO:
                    applicationDatabase.showInfo();
                    break;
                case EXIT:
                    System.out.println("Koniec programu! Do zobaczenia!");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
            }
        } while (option != Option.EXIT);
        scan.close();
    }

    private void printMainMenu() {
        System.out.println("\nWYBIERZ OPCJĘ:");
        System.out.println("1 - dodaj film");
        System.out.println("2 - dodaj serial");
        System.out.println("3 - dodaj aktora");
        System.out.println("4 - wyświetl wszystkie informacje");
        System.out.println("5 - zakończ program");
    }

    private Option userChoice(int choice) {
        if (choice == 1) {
            return Option.ADD_FILM;
        } else if (choice == 2) {
            return Option.ADD_TVSERIES;
        } else if (choice == 3) {
            return Option.ADD_ACTOR;
        } else if (choice == 4) {
            return Option.SHOW_INFO;
        } else if (choice == 5) {
            return Option.EXIT;
        } else {
            return Option.UNSIGNED;
        }
    }
}
