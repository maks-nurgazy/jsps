package com.telusko.demo;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String test(){
        return "test.jsp";
    }

    @RequestMapping(value = "/addAlien",method = {RequestMethod.POST})
    public String addAlien(Alien alien){
        repo.save(alien);
        return "test.jsp";
    }

    @RequestMapping(path = "/aliens")
    @ResponseBody
    public List<Alien> getAliens(){
        return repo.findAll();
    }
    @RequestMapping("/alien/{maks}")
    @ResponseBody
    public Optional<Alien> getAlien(@PathVariable("maks") int maks){
        return repo.findById(maks);
    }


}
