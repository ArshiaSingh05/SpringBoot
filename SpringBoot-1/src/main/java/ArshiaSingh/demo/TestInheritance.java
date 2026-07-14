package ArshiaSingh.demo;
class p{
    void m1(){

    }
    void m2(){

    }
}

class c1 extends p{
    void m3(){

    }
}

public class TestInheritance {
   // c1 c= new p(); //GIVES ERROR
    p P= new c1();

}