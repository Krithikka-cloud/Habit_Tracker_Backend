package com.habittracker.Habittracker.service;

import com.habittracker.Habittracker.DTO.AddHabitRequest;
import com.habittracker.Habittracker.DTO.UpdateHabitRequest;
import com.habittracker.Habittracker.entity.Habit;

import java.util.List;

public interface HabitService {

    String addHabit(AddHabitRequest request, String email);

    List<Habit> getAllHabits(String email);

    String updateHabit(Long id, UpdateHabitRequest request);

    String deleteHabit(Long id);

    String completeHabit(Long id);
}