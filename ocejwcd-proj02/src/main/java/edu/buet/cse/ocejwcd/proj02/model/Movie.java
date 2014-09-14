package edu.buet.cse.ocejwcd.proj02.model;

import java.util.Objects;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author shamim
 */
public class Movie {
  public enum Category {ACTION, DRAMA, SCIFI}
  
  private final String title;
  private final Category category;
  
  public Movie(String title, Category category) {
    this.title = Objects.requireNonNull(title);
    this.category = Objects.requireNonNull(category);
  }
  
   public String getTitle() {
    return title;
  }

  public Category getCategory() {
    return category;
  }
  
  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(ToStringStyle.MULTI_LINE_STYLE);
    builder.append("title", title)
           .append("category", category);
    return builder.toString();
  }
}
