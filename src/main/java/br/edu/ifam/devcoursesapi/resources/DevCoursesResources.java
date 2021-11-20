package br.edu.ifam.devcoursesapi.resources;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class DevCoursesResources {
    @GetMapping
    public String GETResponse(){
        return "Coleção de Cursos na Área de Desenvolvimento de Software - get";
    }
    @PostMapping
    public String POSTResponse(){
        return "Coleção de Cursos na Área de Desenvolvimento de Software - post";
    }
    @DeleteMapping
    public String DELETEResponse(){
        return "Coleção de Cursos na Área de Desenvolvimento de Software - delete";
    }

    @PutMapping
    public String PUTResponse(){
        return "Coleção de Cursos na Área de Desenvolvimento de Software - put";
    }



}
