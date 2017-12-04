public class Filmueb {

    public static void main(String[] args) {

        System.out.println("Aplikacja Filmueb ver. 0.1\n");

        Movie movie1 = new Movie("Titanic", "James Cameron", 1997, "classic", "Film o katastrofie statku", 5.5);
        TvSeries series1 = new TvSeries("Alternatywy 4", 1, 11, "Telewizja Polska", "komediowy", "serial o nowym osiedlu" +
                "warszawskim", 9.0 );
        Actor actor1 = new Actor("Janusz", "Gajos", "Polska");

        System.out.printf("Tytuł filmu: %s, reżyser: %s, rok produkcji: %d, gatunek: %s, opis: %s, ocena: %.1f\n",
                movie1.getName(), movie1.getDirector(), movie1.getProductionYear(), movie1.getGenre(), movie1.getDescription(),
                movie1.getRate());

        System.out.printf("Tytuł serialu: %s, ilość sezonów: %s, ilość odcinków: %s, producent: %s, gatunek: %s" +
                        ", opis: %s, ocena: %.1f\n", series1.getName(), series1.getSeasonsAmount(), series1.getEpisodesAmount(),
                series1.getProducent(), series1.getGenre(), series1.getDescription(), series1.getRate());

        System.out.printf("Aktor - Imię: %s, nazwisko: %s, kraj pochodzenia: %s", actor1.getFirstName(), actor1.getLastName(),
                actor1.getCountry());
    }
}
