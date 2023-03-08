package it.develhope.Primi.passi.First.API1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping(value="/name")
    public String getName(){
        return "Francesco";
    }
    StringBuilder str=new StringBuilder(getName());
    StringBuilder strReverse=str.reverse();

    @PostMapping(value="/name")
    public String postName(){
        return strReverse.toString() ;
    }
}
