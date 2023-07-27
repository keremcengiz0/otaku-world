package com.keremcengiz0.otakuworld.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Information {
    private List<Studio> studios;
    private String aired;
    private String source;
    private String status;
    private List<Producer> producers;
    private List<Genre> genres;
    private String genre;
    private List<Premiered> premiered;
    private List<Licensor> licensors;
    private String theme;
    private String broadcast;
    private List<Demographic> demographic;
    private String episodes;
    private String rating;
    private String duration;
    private List<Theme> themes;
    private List<Type> type;
}
