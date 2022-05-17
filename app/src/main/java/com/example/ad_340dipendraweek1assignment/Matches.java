package com.example.ad_340dipendraweek1assignment;

public class Matches {
    private String name;
    private String description;
    private boolean liked;

    public Matches(String name, String description, boolean like){
        this.name = name;
        this.description = description;
        this.liked = liked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isLike() {
        return liked;
    }

    public void setLike(boolean like) {
        this.liked = liked;
    }
}
