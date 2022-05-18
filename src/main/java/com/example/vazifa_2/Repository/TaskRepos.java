package com.example.vazifa_2.Repository;

import com.example.vazifa_2.entity.Answer;
import com.example.vazifa_2.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepos extends JpaRepository<Task,Integer> {
}
