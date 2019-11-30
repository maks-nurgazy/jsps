package com.telusko.demo;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String test(){
        return "test.jsp";
    }

    @PostMapping(value = "alien",consumes = {"applicaton/json"})
    public Alien addAlien(@RequestBody Alien alien){
        repo.save(alien);
        return alien;
    }

    @GetMapping(path = "/aliens")
    public List<Alien> getAliens(){
        return repo.findAll();
    }
    @RequestMapping("/alien/{maks}")
    public Optional<Alien> getAlien(@PathVariable("maks") int maks){
        return repo.findById(maks);
    }


}
