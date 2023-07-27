package com.keremcengiz0.otakuworld.services;

import com.keremcengiz0.otakuworld.dto.AnimeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class AnimeService {
    @Value("${API_KEY}")
    private String API_KEY;
    @Value("${API_URL}")
    private String API_URL;
    @Value("${API_HOST}")
    private String API_HOST;

    private final WebClient webClient;

    @Autowired
    public AnimeService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(API_URL).build();
    }

    public Mono<AnimeDto> getAnimeDetailsById(Long id) {
        WebClient webClientForAnime = WebClient.builder().baseUrl(API_URL + "/anime").build();

        Mono<AnimeDto> animeDtoMono = webClientForAnime.get()
                .uri("/{animeId}", id)
                .header("X-RapidAPI-Host", API_HOST)
                .header("X-RapidAPI-Key", API_KEY)
                .retrieve()
                .bodyToMono(AnimeDto.class)
                .onErrorResume(ex -> Mono.empty());

        return animeDtoMono;
    }
}
