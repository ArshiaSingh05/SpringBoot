package ArshiaSingh.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentserver {
    // 1. Store the student
    @PostMapping("/create")
    public String storeStudent(RequestBody ){
        return """
                id: 1
                name: Arshia
                Department: CSE
                age: 20
                """;
    }

    // 2. Read the student with id
    // 3. Update student info
    // 4. Delete student info
}
