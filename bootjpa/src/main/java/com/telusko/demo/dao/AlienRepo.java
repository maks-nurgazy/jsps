package com.telusko.demo.dao;

import com.telusko.demo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien,Integer>
{
    List<Alien> findBytech(String tech);
}
