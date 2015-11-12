package com.spring.service;

import java.util.List;

import com.spring.model.Activity;
import com.spring.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

	

}
