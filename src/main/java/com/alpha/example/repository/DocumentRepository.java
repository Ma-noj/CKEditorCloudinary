package com.alpha.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.example.entity.Documents;

public interface DocumentRepository extends JpaRepository<Documents, Integer> {

}
