package com.example.fitxplore.dao;

import com.example.fitxplore.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client , String> {
}
