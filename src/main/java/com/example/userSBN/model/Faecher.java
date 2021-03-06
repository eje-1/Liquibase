package com.example.userSBN.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data

@Entity
@Table(name = "faecher")
public class Faecher implements Serializable {


    //Klassen Variable model faecher

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "abkuerzung")
    private String abkuerzung;

    @NotNull
    @Column(name = "stufe")
    private String stufe;

    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
    private Set<User> student;

    //Einfache konstruktor
    public Faecher() {

    }

    public Faecher(String name, String abkuerzung, String stufe) {
        this.name = name;
        this.abkuerzung = abkuerzung;
        this.stufe = stufe;
    }


    //Getter and Setter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAbkuerzung() {
        return abkuerzung;
    }

    public String getStufe() {
        return stufe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbkuerzung(String abkuerzung) {
        this.abkuerzung = abkuerzung;
    }

    public void setStufe(String stufe) {
        this.stufe = stufe;
    }

    public Set<User> getStudent() {
        return student;
    }

    public void setStudent(Set<User> student) {
        this.student = student;
    }


}
