import java.util.Scanner;

public class ApplicationController {
    public static final int ADD_FILM = 1;
    public static final int ADD_TVSERIES = 2;
    public static final int ADD_ACTOR = 3;
    public static final int SHOW_INFO = 4;
    public static final int EXIT = 5;

    Scanner scan = new Scanner(System.in);
    ApplicationDatabase applicationDatabase = new ApplicationDatabase();

    public void mainLoop() {
        int choice = 0;
        do {
            printMainMenu();
            choice = scan.nextInt();
            switch (choice) {
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
        } while (choice != EXIT);
    }

    private void printMainMenu() {
        System.out.println("\nWYBIERZ OPCJĘ:");
        System.out.println("1 - dodaj film");
        System.out.println("2 - dodaj serial");
        System.out.println("3 - dodaj aktora");
        System.out.println("4 - wyświetl wszystkie informacje");
        System.out.println("5 - zakończ program");
    }
}
