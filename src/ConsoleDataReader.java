import java.util.Scanner;

public class ConsoleDataReader {

    Scanner scan = new Scanner(System.in);

    public Movie createMovie() {
        Movie movie = new Movie();

        System.out.println("Podaj tytuł filmu:");
        movie.setName(scan.nextLine());
        System.out.println("Podaj imię i nazwisko reżysera:");
        movie.setDirector(scan.nextLine());
        System.out.println("Podaj rok produkcji filmu:");
        int prodYear = scan.nextInt();
        if (prodYear > 0) {
            movie.setProductionYear(prodYear);
        } else {
            System.out.println("Błąd! Nie udało się utworzyć obiektu!");
            return null;
        }
        scan.nextLine();
        System.out.println("Podaj gatunek filmu:");
        movie.setGenre(scan.nextLine());
        System.out.println("Podaj opis filmu:");
        movie.setDescription(scan.nextLine());
        System.out.println("Podaj ocenę filmu:");
        double grade = scan.nextDouble();
        scan.nextLine();
        if (grade > 0 && grade <= 10.0) {
            movie.setRate(grade);
        } else {
            showError();
            return null;
        }
        return movie;
    }

    public TvSeries createTvSeries() {
        TvSeries tvSeries = new TvSeries();

        System.out.println("Podaj tytuł serialu:");
        tvSeries.setName(scan.nextLine());
        System.out.println("Podaj liczbę sezonów:");
        int seasons = scan.nextInt();
        if (seasons > 0) {
            tvSeries.setSeasonsAmount(seasons);
        } else {
            showError();
            return null;
        }
        System.out.println("Podaj liczbę odcinków:");
        int episodes = scan.nextInt();
        scan.nextLine();
        if (episodes > 0) {
            tvSeries.setEpisodesAmount(episodes);
        } else {
            showError();
            return null;
        }
        System.out.println("Podaj producenta serialu:");
        tvSeries.setProducent(scan.nextLine());
        System.out.println("Podaj gatunek:");
        tvSeries.setGenre(scan.nextLine());
        System.out.println("Podaj opis:");
        tvSeries.setDescription(scan.nextLine());
        System.out.println("Podaj ocenę:");
        tvSeries.setRate(scan.nextDouble());
        scan.nextLine();

        return tvSeries;
    }

    public Actor createActor() {
        Actor actor = new Actor();

        System.out.println("Podaj imię aktora:");
        actor.setFirstName(scan.nextLine());
        System.out.println("Podaj nazwisko aktora:");
        actor.setLastName(scan.nextLine());
        System.out.println("Podaj kraj pochodzenia:");
        actor.setCountry(scan.nextLine());

        return actor;
    }

    public void showError() {
        System.out.println("Błąd! Nie udało się utworzyć obiektu!");
    }
}
