package com.example.data;

import com.example.data.Actor;
import com.example.data.Movie;
import com.example.data.TvSeries;
import com.example.logic.ConsoleDataReader;

import java.util.Scanner;

public class ApplicationDatabase {
    private static final int MAX_MOVIES_VALUE = 10;
    private static final int MAX_TVSERIES_VALUE = 10;
    private static final int MAX_ACTORS_VALUE = 10;

    private Movie[] movies = new Movie[MAX_MOVIES_VALUE];
    private TvSeries[] tvSeries = new TvSeries[MAX_TVSERIES_VALUE];
    private Actor[] actors = new Actor[MAX_ACTORS_VALUE];

    private int regMovie = 0;
    private int regTvSeries = 0;
    private int regActor = 0;

    ConsoleDataReader consoleDataReader = new ConsoleDataReader();

    public void addMovie() {
        Movie movie = consoleDataReader.createMovie();
        if (regMovie < MAX_MOVIES_VALUE) {
            movies[regMovie] = movie;
            regMovie++;
        } else {
            showNoSpaceError();
        }
    }

    public void addTvSeries() {
        TvSeries tvSerie = consoleDataReader.createTvSeries();
        if (regTvSeries < MAX_TVSERIES_VALUE) {
            tvSeries[regTvSeries] = tvSerie;
            regTvSeries++;
        } else {
            showNoSpaceError();
        }
    }

    public void addActors() {
        Actor actor = consoleDataReader.createActor();
        if (regActor < MAX_ACTORS_VALUE) {
            actors[regActor] = actor;
            regActor++;
        } else {
            showNoSpaceError();
        }
    }

    public Movie[] getMovie() {
        return movies;
    }

    public TvSeries[] getTvSeries() {
        return tvSeries;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void showInfo() {
        if (movies[0] != null) {
            System.out.println("DOSTĘPNE W BAZIE:");
            System.out.println("\nFILMY:");
            for (Movie mov : movies) {
                if (mov == null) {
                    continue;
                } else {
                    mov.showMovieInfo();
                }
            }
        }
        if (tvSeries[0] != null) {
            System.out.println("\nSERIALE:");
            for (TvSeries tv : tvSeries) {
                if (tv == null) {
                    continue;
                } else {
                    tv.showTvSeriesInfo();
                }
            }
        }
        if (actors[0] != null) {
            System.out.println("\nAKTORZY:");
            for (Actor actor : actors) {
                if (actor == null) {
                    continue;
                } else {
                    actor.showActorInfo();
                }
            }
        } else {
            System.out.println("Brak danych!");
        }
    }

    private void showError() {
        System.out.println("Błąd! Nie udało się utworzyć obiektu!");
    }

    private void showNoSpaceError() {
        System.out.println("Brak miejsca w tablicy.");
    }
}
