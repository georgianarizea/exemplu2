package com.spring.service;

import java.util.List;

import com.spring.model.Goal;
import com.spring.model.GoalReport;

public interface GoalService {
	
	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();

	

}
