package com.example.vazifa_2.Repository;

import com.example.vazifa_2.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AnswerRepos extends JpaRepository<Answer,Integer> {
    Optional<Answer> findById(Class<Object> aClass);

    List<Answer> findAllByFirmaId(Integer id);
}
