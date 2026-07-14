package ArshiaSingh.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfoli {

    @GetMapping("/myself")
    public String myself(){
           return """
                   <h1> Myself </h1>
                   <p> Hi, my name is Arshia Singh.</p>
                   <ul>
                   <li>GitHub: https://github.com/ArshiaSingh05</li>
                   <li>LeetCode: https://leetcode.com/u/Arshia_Singh/</li>
                   <li>Hackerrank: https://www.hackerrank.com/profile/singharshia2005</li>
                   </ul>
                   """ ;
    }
    @GetMapping("/myskills")
    public String mySkills(){
        return """
              <h2> My Skills </h2>
              <h3> Technical Skills </h3>
              <ul>
              <li> Languages: Python , Java </li>
              <li> DataBase: MySQL </li>
              <li> Technologies/FrameWorks: Power BI, Machine Learning, Deep Learning, Excel</li>
              <li> Libraries: NumPy, Pandas, Matplotlib, Seaborn, TensorFlow, Keras</li> 
              </ul>
              <h3> Soft Skills </h3>
              <ul>
              <li> Communication </li>
              <li> Teamwork </li>
              <li> Leadership </li>
              <li> Adaptability </li>
              </ul>
              """;
    }
    }
    @GetMapping("/myedu")
    public String education(){

    }
    public void project(){

    }
}
