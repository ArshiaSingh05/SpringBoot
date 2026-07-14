package ArshiaSingh.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentserver {
    // 1. Store the student
    @PostMapping("/create")
    public String storeStudent(@RequestBody Student student){
        int id= student.getId();
        String name=student.getName();
        int age=student.getAge();
        String department=student.getDepartment();

        return "id: "+id+
                ", name: "+name+
                ", age: "+age+
                ", department: "+department;

        // return """ id: 1 name: Arshia Department: CSE age: 20 """;
    }

    // 2. Read the student with id
    // 3. Update student info
    // 4. Delete student info
}
