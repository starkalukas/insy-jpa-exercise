package at.htl.workloads.movie;

import at.htl.model.movie.MovieDTO;

import java.util.List;

public interface MovieService {
    Movie getMovieById(Long id);

    boolean addMovie(MovieDTO newMovie);

    List<Movie> getMovieList();
}