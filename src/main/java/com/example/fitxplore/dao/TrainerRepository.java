package com.example.fitxplore.dao;

import com.example.fitxplore.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, String>{
        }