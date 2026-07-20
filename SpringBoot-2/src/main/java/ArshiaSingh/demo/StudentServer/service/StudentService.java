package ArshiaSingh.demo.StudentServer.service;

import ArshiaSingh.demo.StudentServer.DTO.CreateStudentRequestDTO;
import ArshiaSingh.demo.StudentServer.DTO.CreateStudentResponseDTO;
import ArshiaSingh.demo.StudentServer.entity.Student;
import ArshiaSingh.demo.StudentServer.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class StudentService {
    StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository){

        this.studentRepository= studentRepository;
    }

    //public Student studentValidate(Student student){
    public CreateStudentResponseDTO studentValidate(CreateStudentRequestDTO createStudentRequestDTO){
      //  int id= student.getId();
      //  String name=student.getName();
      //  int age=student.getAge();
      //  String department=student.getDepartment();

       // if(id<0 || name==null || age<0 || department==null){
      //      return null;
       // }

    //    if(id<=0 || name==null || name.isBlank() || age<0 || department==null || department.isBlank()){
     //       return null;
    //    }

      //  studentRepository.save(student);
      //  return student;
     //   student.setCreatedAt(LocalDateTime.now());
     //   student.setUpdatedAt(LocalDateTime.now());

      //  return studentRepository.save(student);
            Student student = mapToStudent(createStudentRequestDTO);
            studentRepository.save(student);
            return mapToResponseDTO(student);
    }

    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(int id, Student student){
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if(optionalStudent.isEmpty()){
            return null;
        }
        Student existingStudent = optionalStudent.get();
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setDepartment(student.getDepartment());
        return studentRepository.save(existingStudent);
    }

    public boolean deleteStudent(int id){
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if(optionalStudent.isEmpty()){
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }

        private Student mapToStudent(CreateStudentRequestDTO createStudentRequestDTO) {
            Student student = new Student();

            student.setName(createStudentRequestDTO.getName());
            student.setAge(createStudentRequestDTO.getAge());
            student.setDepartment(createStudentRequestDTO.getDepartment());
            student.setCreatedAt(LocalDateTime.now());
            student.setUpdatedAt(LocalDateTime.now());

            return student;
        }

        private CreateStudentResponseDTO mapToResponseDTO(Student student) {
            CreateStudentResponseDTO createStudentResponseDTO = new CreateStudentResponseDTO();
            createStudentResponseDTO.setId(student.getId());
            createStudentResponseDTO.setName(student.getName());
            createStudentResponseDTO.setAge(student.getAge());
            createStudentResponseDTO.setDepartment(student.getDepartment());

            return createStudentResponseDTO;

        }

}

