package br.edu.ifam.devcoursesapi.model;

public class DevCourses {
    private  long id;
    private  String nameCompany;
   /*
    private  String contentType; //paid or free
    private  Boolean certified; //has certificate issuance
    private  String description;
    private  String link;
   */

    public DevCourses() {
    }

    public DevCourses(long id, String nameCompany){
        super();
        this.id = id;
        this.nameCompany = nameCompany;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

}
