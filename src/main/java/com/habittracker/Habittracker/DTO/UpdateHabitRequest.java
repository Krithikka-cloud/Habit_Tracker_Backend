package com.habittracker.Habittracker.DTO;

public class UpdateHabitRequest {

    private String habitName;
    private String category;
    private String frequency;

    public UpdateHabitRequest() {
    }

    public UpdateHabitRequest(String habitName, String category, String frequency) {
        this.habitName = habitName;
        this.category = category;
        this.frequency = frequency;
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
}
