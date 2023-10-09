package com.example.javatutorial;

public class CodeModel {
    String name;
    String description;

    String output;

    public CodeModel(String name, String description, String output) {
        this.name = name;
        this.description = description;
        this.output = output;
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

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
