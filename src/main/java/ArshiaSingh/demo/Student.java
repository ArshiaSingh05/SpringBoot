package ArshiaSingh.demo;

public class Student {
    private String name;
    private int age;

    public Student(){

    }
    public Student(int age, String name){
        this.name= name;
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String getName() {
        return name;
    }
}
