package com.keremcengiz0.otakuworld.dto;

import com.keremcengiz0.otakuworld.entities.AlternativeTitles;
import com.keremcengiz0.otakuworld.entities.Characters;
import com.keremcengiz0.otakuworld.entities.Information;
import com.keremcengiz0.otakuworld.entities.Statistics;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AnimeDto {
    private String picture_url;
    private AlternativeTitles alternative_titles;
    private Information information;
    private Statistics statistics;
    private String title_en;
    private List<Characters> characters;
    private String synopsis;
    private String title_ov;
}
