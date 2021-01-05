package com.example.cartoon;

import java.io.Serializable;

public class Cartoon implements Serializable {

    private String name;
    private double rating;
    private int season;
    private int episodes;
    private int year;
    private int image;


    public Cartoon(String name, double rating, int season, int episodes, int year, int image) {
        this.name = name;
        this.rating = rating;
        this.season = season;
        this.episodes = episodes;
        this.year = year;
        this.image = image;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {

        if (rating <=10 )
        this.rating = rating;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
