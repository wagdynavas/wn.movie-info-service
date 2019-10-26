package com.wagdynavas.wnmovieinfoservice.resources;

import com.wagdynavas.wnmovieinfoservice.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Value("${api.key}")
    private String apiKey;

    @Value("${movie.db.api.base-url}")
    private String movieDbApi;

    @Autowired
    private WebClient.Builder webBuilder;

    @GetMapping("/info/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        Movie movie = webBuilder.build()
                .get()
                .uri(movieDbApi + movieId + "?api_key=" + apiKey)
                .retrieve()
                .bodyToMono(Movie.class)
                .block();
        return movie;
    }

}
