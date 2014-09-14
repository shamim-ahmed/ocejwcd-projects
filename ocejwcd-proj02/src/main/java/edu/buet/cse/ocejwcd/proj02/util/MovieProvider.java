package edu.buet.cse.ocejwcd.proj02.util;

import edu.buet.cse.ocejwcd.proj02.model.Movie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author shamim
 */
public class MovieProvider {

  private static final List<Movie> movies = Arrays.asList(new Movie("Aliens", Movie.Category.SCIFI),
          new Movie("Notting Hill", Movie.Category.DRAMA),
          new Movie("Kick Ass", Movie.Category.ACTION));
  
  
  public static List<Movie> getMovies() {
    return new ArrayList<>(movies);
  }

  private MovieProvider() {

  }
}
