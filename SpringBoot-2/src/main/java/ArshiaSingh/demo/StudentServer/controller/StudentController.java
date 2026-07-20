package ArshiaSingh.demo.StudentServer.controller;

import ArshiaSingh.demo.StudentServer.DTO.CreateStudentRequestDTO;
import ArshiaSingh.demo.StudentServer.DTO.CreateStudentResponseDTO;
import ArshiaSingh.demo.StudentServer.service.StudentService;
import ArshiaSingh.demo.StudentServer.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService= studentService;
    }

    @PostMapping("/create")
  //  public ResponseEntity<Student> storeStudent(@RequestBody Student student){
   //     Student result = studentService.studentValidate(student);
      public ResponseEntity<?> storeStudent(@RequestBody CreateStudentRequestDTO createStudentRequestDTO){
        CreateStudentResponseDTO result = studentService.studentValidate(createStudentRequestDTO);
        if(result == null){
            return ResponseEntity.status(404).body(result);
        }

        return ResponseEntity.status(201).body(result);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){
        Student student1 = studentService.getStudentById(id);
        return ResponseEntity.status(200).body(student1);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody Student student) {
        Student result = studentService.updateStudent(id, student);
        if(result == null){
            return ResponseEntity.status(404).body("Student Not Found");
        }
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id){
        boolean deleted = studentService.deleteStudent(id);
        if(deleted){
            return ResponseEntity.ok("Student Deleted Successfully");
        }
        return ResponseEntity.status(404).body("Student Not Found");
    }

}
