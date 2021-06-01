package com.simplify.usersapi.controllers;


import com.simplify.usersapi.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class AlunoController {

    @Autowired
    public AlunoRepository repository;


    @GetMapping("/all")
    public ResponseEntity getAll(){
       List aluno = repository.findAll();
        return ResponseEntity.ok(aluno);
    }

    @GetMapping("/tudo")
    public ResponseEntity getAlli(){
      //  List aluno = repository.findAll();
        return ResponseEntity.ok(repository.findAll());
    }
    //@GetMapping("/1")
   // public ResponseEntity getListaObj() {
   //     return ResponseEntity.ok(repository.findAll());
  ///  }
//    @GetMapping("/2")
 //   public ResponseEntity getTudo(){
 //       List aluno = repository.findAll();
  //      return ResponseEntity.ok(aluno);
 //   }
    
}