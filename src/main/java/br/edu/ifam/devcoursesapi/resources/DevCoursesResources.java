package br.edu.ifam.devcoursesapi.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevCoursesResources {
    @RequestMapping(value= "/devcourses", method = RequestMethod.GET)
    public String toList(){
        return "Coleção de Cursos na Área de Desenvolvimento de Software";
    }

}
