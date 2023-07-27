package com.keremcengiz0.otakuworld.controller;

import com.keremcengiz0.otakuworld.dto.AnimeDto;
import com.keremcengiz0.otakuworld.services.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anime")
public class AnimeController {

    private AnimeService animeService;

    @Autowired
    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping("/{animeId}")
    public AnimeDto getAnimeById(@PathVariable("animeId") Long id) throws Exception {

        try {
            AnimeDto animeDto = this.animeService.getAnimeDetailsById(id).block();
            return animeDto;
        } catch (Exception e) {
            throw new Exception("Error: An unexpected error occurred!");
        }
    }


}
