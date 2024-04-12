package com.alpha.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.example.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
