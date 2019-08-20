package com.thoughtworks.pathashala67.model;

import com.thoughtworks.pathashala67.exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    private List<Movie> movies;
    private CheckedOutLibraryItem<Movie> checkedOutLibraryItem = new CheckedOutLibraryItem<>();

    public Movies( ArrayList<Movie> movies ) {
        this.movies = movies;
    }

    String displayMovieListDetails() {
        StringBuilder movieDetails = new StringBuilder();
        String titleTemplate = "|%-5s| %-30s| %-10s| %-20s| %-15s|%n";
        movieDetails.append( "********************Movies List********************\n" );
        movieDetails.append( String.format( titleTemplate, "Id", "Name", "Year", "Director", "Rating" ) );
        int index = 1;
        for (Movie movie : movies) {
            movieDetails.append( movie.printDetails( index - 1 ) );
            index++;
        }
        return movieDetails.toString();
    }


    public String checkout( String movieName ) throws MovieNotAvailableException {
        Movie movie = searchForMovie( movieName );
        checkedOutLibraryItem.add( movie );
        movies.remove( movie );
        return ("Thank you! Enjoy the Movie");
    }


    private Movie searchForMovie( String movieName ) throws MovieNotAvailableException {
        for (Movie movie : movies) {
            if (movie.equals( new Movie( movieName ) )) {
                return movie;
            }
        }
        throw new MovieNotAvailableException( "Sorry, that movie is not available" );
    }

    public String returnMovie( String movieName ) throws InvalidMovieException {
        Movie movie = new Movie( movieName );
        try {
            movie = checkedOutLibraryItem.search( movie );
        } catch (InvalidException exception) {
            throw new InvalidMovieException( "That is not a valid movie to return." );
        }
        movies.add( movie );
        checkedOutLibraryItem.remove( movie );
        return ("Thank you for returning the movie");
    }
}
