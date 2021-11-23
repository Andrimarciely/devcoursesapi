package br.edu.ifam.devcoursesapi.resources;

import br.edu.ifam.devcoursesapi.model.DevCourses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="devcourses")
public class DevCoursesResources {

    /*
    *
    * private  String nameCompany;
    private  String contentType; //paid or free
    private  Boolean certified; //has certificate issuance
    private  String description;
    private  String link;
    * */

    public DevCourses devcourses(@RequestParam(value = "nameCompany", defaultValue = "Fundação Bradesco") String nameCompany ){
        return new DevCourses(0, "Empresa promotora" + nameCompany);
    }

    /*
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

    */

}
