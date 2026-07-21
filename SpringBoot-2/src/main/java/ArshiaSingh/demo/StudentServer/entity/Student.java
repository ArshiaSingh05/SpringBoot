package ArshiaSingh.demo.StudentServer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity
public class Student {

    @Id
   // private int id;

  //  private String name;

 //   private int age;

  //  private String department;

   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @NotBlank()
    private int id;

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 3, max=50,message = "Name must be between 3 and 50 characters")
    private String name;

    @Min(value = 1,message = "Age must be greater than 0")
    private int age;

    @NotBlank(message = "Department cannot be empty")
    @Size(min = 2,max = 50,message = "Department must be between 2 and 50 characters")
    private String department;

    private String email;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public LocalDateTime getcreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }
    public LocalDateTime getupdatedAt(){
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt){
        this.updatedAt = updatedAt;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
}
