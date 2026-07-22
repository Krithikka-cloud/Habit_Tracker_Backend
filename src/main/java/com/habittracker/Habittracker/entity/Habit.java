package com.habittracker.Habittracker.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "habits")
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String habitName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String frequency;

    @Column(nullable = false)
    private boolean completed;

    @Column(nullable = false)
    private String icon;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private int streak = 0;

    private LocalDate lastCompletedDate;

    public Habit() {
    }

    public Habit(Long id,
                 String habitName,
                 String category,
                 String frequency,
                 boolean completed,
                 String icon,
                 String color,
                 int streak,
                 LocalDate lastCompletedDate) {

        this.id = id;
        this.habitName = habitName;
        this.category = category;
        this.frequency = frequency;
        this.completed = completed;
        this.icon = icon;
        this.color = color;
        this.streak = streak;
        this.lastCompletedDate = lastCompletedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
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

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public LocalDate getLastCompletedDate() {
        return lastCompletedDate;
    }

    public void setLastCompletedDate(LocalDate lastCompletedDate) {
        this.lastCompletedDate = lastCompletedDate;
    }
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}