package com.example.panfilovvaleriyapi;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Student> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return repository.save(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student updated) {
        return repository.findById(id).map(student -> {
            student.setFirstName(updated.getFirstName());
            student.setLastName(updated.getLastName());
            student.setStudentGroup(updated.getStudentGroup());
            return repository.save(student);
        }).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}