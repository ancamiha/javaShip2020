package com.revomatico.play.javaship2020;

import java.util.Date;

public class Movie implements Comparable<Movie> {
  private String title;
  private Date releaseDate;

  public Movie() {
  }

  public Movie(String title, Date releaseDate) {
    this.title = title;
    this.releaseDate = releaseDate;
  }

  @Override
  public int compareTo(Movie movie) {
    if (this.releaseDate.equals(movie.releaseDate)) {
      return this.title.compareTo(movie.title);
    }
    return this.releaseDate.compareTo(movie.releaseDate);
  }

  @Override
  public String toString() {
    return "title = '" + title + '\'' +
        ", releaseDate = " + (releaseDate.getYear() + 1900);
  }

  public String getTitle() {
    return title;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  //  @Override
  //  public int compareTo(Movie o) {
  //    if (getDate() == null || o.getDate() == null) {
  //      return 0;
  //    }
  //    return getDate().compareTo(o.getDate());
  //  }
}
