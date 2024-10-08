package org.example;


import jakarta.persistence.*;

@Entity
@Table(name = "Student_Table")
public class Student {
    @Id
    @Column(name = "Student_Id")
    private int Id;
    public void setId(int Id){
        this.Id=Id;
    }
    public int getId(){
        return Id;
    }

    @Column(name = "Student_Name")
    private String Name;
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }

    @Column(name = "Student_Gender")
//    @Transient
    private String Gender;
    public void setGender(String Gender){
        this.Gender=Gender;
    }
    public String getGender(){
        return Gender;
    }


    @Override
    public String toString(){
        return "Student[Id = "+Id+", Name = "+Name+", Gender = "+Gender+"];";
    }
}
