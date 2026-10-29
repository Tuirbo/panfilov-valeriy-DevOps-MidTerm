package com.example.panfilovvaleriyapi;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String studentGroup;

    public Student() {}

    public Student(String firstName, String lastName, String studentGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentGroup = studentGroup;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getStudentGroup() { return studentGroup; }
    public void setStudentGroup(String studentGroup) { this.studentGroup = studentGroup; }
}