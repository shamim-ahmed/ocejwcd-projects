package edu.buet.cse.ocejwcd.proj02.util;

import edu.buet.cse.ocejwcd.proj02.model.Movie;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author shamim
 */
public class MovieProvider {

  private static final Movie[] movies = new Movie[]{new Movie("Aliens", Movie.Genre.SCIFI),
    new Movie("Notting Hill", Movie.Genre.DRAMA),
    new Movie("Kick Ass", Movie.Genre.ACTION)};

  public static List<Movie> getMovies() {
    return Arrays.asList(movies);
  }

  private MovieProvider() {
  }
}
