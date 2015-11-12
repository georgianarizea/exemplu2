package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Goal;
import com.spring.model.GoalReport;
import com.spring.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
		
	@Transactional
	public Goal save(Goal goal) {
		
		return goalRepository.save(goal);
	}

	public List<Goal> findAllGoals() {
		
	return goalRepository.findAll();
		
	}

	public List<GoalReport> findAllGoalReports() {
		// TODO Auto-generated method stub
		return goalRepository.findAllGoalReports();
	}
	
}
