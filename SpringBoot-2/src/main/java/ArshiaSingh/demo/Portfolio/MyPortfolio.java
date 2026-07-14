package ArshiaSingh.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/myself")
    public String myself() {
        return """
                <h1>Myself</h1>
                <p>Hi, my name is Arshia Singh.</p>

                <ul>
                    <li>GitHub: https://github.com/ArshiaSingh05</li>
                    <li>LeetCode: https://leetcode.com/u/Arshia_Singh/</li>
                    <li>HackerRank: https://www.hackerrank.com/profile/singharshia2005</li>
                </ul>
                """;
    }

    @GetMapping("/myskills")
    public String mySkills() {
        return """
                <h2>My Skills</h2>

                <h3>Technical Skills</h3>
                <ul>
                    <li>Languages: Python, Java</li>
                    <li>Database: MySQL</li>
                    <li>Technologies/Frameworks: Power BI, Machine Learning, Deep Learning, Excel</li>
                    <li>Libraries: NumPy, Pandas, Matplotlib, Seaborn, TensorFlow, Keras</li>
                </ul>

                <h3>Soft Skills</h3>
                <ul>
                    <li>Communication</li>
                    <li>Teamwork</li>
                    <li>Leadership</li>
                    <li>Adaptability</li>
                </ul>
                """;
    }

    @GetMapping("/myedu")
    public String education() {
        return """
                <h2>Education</h2>

                <ul>
                    <li>B.Tech CSE Data Science, Lovely Professional University</li>
                    <li>Current CGPA: 8.63</li>
                </ul>
                """;
    }

    @GetMapping("/myprojects")
    public String projects() {
        return """
                <h2>Projects</h2>

                <ul>
                    <li>Platform Identification System Using Acoustic Signature (DRDO)</li>
                    <li>Health-o-Scope (Machine Learning)</li>
                    <li>EduVista India Dashboard (Power BI)</li>
                    <li>College Recommendation System</li>
                </ul>
                """;
    }
}