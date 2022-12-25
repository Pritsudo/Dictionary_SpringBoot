package com.example.Dictionary.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dictionary.models.Dictionary;

@Repository
public interface DictionaryRepository extends JpaRepository<Dictionary , Integer> {
    
}
