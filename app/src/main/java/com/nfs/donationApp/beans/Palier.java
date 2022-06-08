package com.nfs.donationApp.beans;

import java.time.LocalDate;

public class Palier {
    private String name;
    private String description;
    private Float price;
    private LocalDate shipping;

    public Palier(String name, String description, Float price, LocalDate shipping) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.shipping = shipping;
    }


    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public LocalDate getshipping() {
        return shipping;
    }

    public void setshipping(LocalDate shipping) {
        this.shipping = shipping;
    }

    @Override
    public String toString() {
        return "Palier{" + "name=" + name + ", description=" + description + ", price=" + price + ", shipping=" + shipping + '}';
    }
}
