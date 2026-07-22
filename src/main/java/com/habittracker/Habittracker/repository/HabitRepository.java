package com.habittracker.Habittracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.habittracker.Habittracker.entity.Habit;
import com.habittracker.Habittracker.entity.User;

@Repository
public interface HabitRepository extends JpaRepository<Habit, Long> {
	
	List<Habit> findByUser(User user);
	
}

