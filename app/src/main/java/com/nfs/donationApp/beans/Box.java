package com.nfs.donationApp.beans;

import java.time.LocalDate;
import java.util.ArrayList;

public class Box {
    private String title;
    private String description;
    private String image;
    private int percentage;
    private LocalDate dateEnd;
    private ArrayList<Palier> paliers;

    public Box(String title, String description, String image, int percentage, LocalDate dateEnd, ArrayList<Palier> paliers) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.percentage = percentage;
        this.dateEnd = dateEnd;
        this.paliers = paliers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public ArrayList<Palier> getPaliers() {
        return paliers;
    }

    public void setPaliers(ArrayList<Palier> paliers) {
        this.paliers = paliers;
    }
}
