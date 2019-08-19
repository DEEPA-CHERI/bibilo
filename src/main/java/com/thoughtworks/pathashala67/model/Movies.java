package com.thoughtworks.pathashala67.model;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    private List<Movie> movies;

    public Movies( ArrayList<Movie> movies ) {
        this.movies = movies;
    }

    public String displayMovieListDetails() {
        StringBuilder movieDetails = new StringBuilder();
        String titleTemplate = "|%-5s| %-30s| %-10s| %-20s| %-15s|%n";
       movieDetails.append("********************Movies List********************\n" );
      movieDetails.append(String.format(titleTemplate, "Id", "Name", "Year", "Director","Rating" ));
        int index = 1;
        for (Movie movie: movies) {
            movieDetails.append( movie.printDetails( index - 1 ) );
            index++;
        }
        return movieDetails.toString();
    }


}
