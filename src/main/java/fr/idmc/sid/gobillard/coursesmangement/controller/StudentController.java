package fr.idmc.sid.gobillard.coursesmangement.controller;

import fr.idmc.sid.gobillard.coursesmangement.entity.Student;
import fr.idmc.sid.gobillard.coursesmangement.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository sr;

    @GetMapping
    public ResponseEntity<?> getAllStudents() {
        Iterable<Student> students = sr.findAll();
        return ResponseEntity.ok(students);
    }
}
