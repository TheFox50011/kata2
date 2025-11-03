package software.ulpgc.kata2;

import software.ulpgc.kata2.io.MovieLoader;
import software.ulpgc.kata2.io.RemoteMovieLoader;
import software.ulpgc.kata2.model.Movie;

import java.util.List;

public class Main {
    public static void main(String[] args){
        MovieLoader movieLoader = new RemoteMovieLoader();
        List<Movie> movies = movieLoader.loadAll();
        for(Movie movie: movies){
            System.out.println(movie);
        }

    }
}
