package com.example.javatutorial;

public class TopicModel {
    String name;
    String description;

    public TopicModel(String name , String des){
        this.name=name;
        this.description=des;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

