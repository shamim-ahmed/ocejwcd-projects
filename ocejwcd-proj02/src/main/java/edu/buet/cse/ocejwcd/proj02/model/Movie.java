package edu.buet.cse.ocejwcd.proj02.model;

import java.util.Objects;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author shamim
 */
public class Movie {
  public enum Genre {ACTION, DRAMA, SCIFI}
  
  private final String title;
  private final Genre genre;
  
  public Movie(String title, Genre genre) {
    this.title = Objects.requireNonNull(title);
    this.genre = Objects.requireNonNull(genre);
  }
  
   public String getTitle() {
    return title;
  }

  public Genre getGenre() {
    return genre;
  }
  
  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(ToStringStyle.MULTI_LINE_STYLE);
    builder.append("title", title)
           .append("genre", genre);
    return builder.toString();
  }
}
