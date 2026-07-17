package ArshiaSingh.demo.StudentServer.repository;

import ArshiaSingh.demo.StudentServer.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
