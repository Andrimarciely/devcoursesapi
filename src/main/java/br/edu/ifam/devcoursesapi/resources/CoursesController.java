package br.edu.ifam.devcoursesapi.resources;

import br.edu.ifam.devcoursesapi.model.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="courses")
public class CoursesController {
    @GetMapping
    public Courses courses(@RequestParam(value = "nameCompany", defaultValue = "Fundação Bradesco") String nameCompany ){
        return new Courses(0, "Empresa promotora " + nameCompany);
    }
}

