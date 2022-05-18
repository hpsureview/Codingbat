package com.example.vazifa_2.Repository;

import com.example.vazifa_2.entity.Answer;
import com.example.vazifa_2.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepos extends JpaRepository<Category,Integer> {
}
