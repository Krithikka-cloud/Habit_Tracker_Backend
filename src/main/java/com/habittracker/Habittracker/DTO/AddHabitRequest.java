package com.habittracker.Habittracker.DTO;

public class AddHabitRequest {

    private String habitName;
    private String category;
    private String frequency;
    private String icon;
    private String color;

    public AddHabitRequest() {
    }

    public AddHabitRequest(String habitName, String category, String frequency, String icon, String color) {
        this.habitName = habitName;
        this.category = category;
        this.frequency = frequency;
        this.icon = icon;
        this.color = color;
    }

    public String getHabitName() {
        return habitName;
    }

    public void setHabitName(String habitName) {
        this.habitName = habitName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}