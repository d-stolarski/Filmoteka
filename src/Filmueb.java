import com.sun.org.apache.xpath.internal.SourceTree;

        import java.util.Scanner;

public class Filmueb {
    public static final int ADD_FILM = 1;
    public static final int ADD_TVSERIES = 2;
    public static final int ADD_ACTOR = 3;
    public static final int SHOW_INFO = 4;
    public static final int EXIT = 5;

    public static void main(String[] args) {

        System.out.println("Aplikacja Filmueb ver. 0.3");

        Scanner scan = new Scanner(System.in);

        ConsoleDataReader cr = new ConsoleDataReader();

        Movie[] movies = new Movie[1];
        TvSeries[] tvSeries = new TvSeries[1];
        Actor[] actors = new Actor[1];

        int choice = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        do {
            System.out.println("\nWYBIERZ OPCJĘ:");
            System.out.println("1 - dodaj film");
            System.out.println("2 - dodaj serial");
            System.out.println("3 - dodaj aktora");
            System.out.println("4 - wyświetl wszystkie informacje");
            System.out.println("5 - zakończ program");
            choice = scan.nextInt();
            switch (choice) {
                case ADD_FILM:
                    System.out.println("DODAWANIE FILMU:");
                    movies[i] = cr.createMovie();
                    i++;
                    break;
                case ADD_TVSERIES:
                    System.out.println("DODAWANIE SERIALU:");
                    tvSeries[j] = cr.createTvSeries();
                    j++;
                    break;
                case ADD_ACTOR:
                    System.out.println("DODAWANIE AKTORA:");
                    actors[k] = cr.createActor();
                    k++;
                    break;
                case SHOW_INFO:
                    if (movies[0] != null) {
                        System.out.println("DOSTĘPNE W BAZIE:");
                        System.out.println("\nFILMY:");
                        for (Movie movie : movies) {
                            movie.showInfo();
                        }
                    }
                    if (tvSeries[0] != null) {
                        System.out.println("\nSERIALE:");
                        for (TvSeries tvSerie : tvSeries) {
                            tvSerie.showInfo();
                        }
                    }
                    if (actors[0] != null) {
                        System.out.println("\nAKTORZY:");
                        for (Actor actor : actors) {
                            actor.showInfo();
                        }
                    } else {
                        System.out.println("Brak danych do wyświetlenia.");
                    }
                    break;
                case EXIT:
                    System.out.println("Koniec programu! Do zobaczenia!");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
            }
        } while (choice != EXIT);

    }
}



