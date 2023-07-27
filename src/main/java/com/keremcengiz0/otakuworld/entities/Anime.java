package com.keremcengiz0.otakuworld.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Anime {
    private String picture_url;
    private AlternativeTitles alternative_titles;
    private Information information;
    private Statistics statistics;
    private String title_en;
    private List<Characters> characters;
    private String synopsis;
    private String title_ov;
}
