package ArshiaSingh.demo;

import ArshiaSingh.demo.DependencyInjection.OrderService;
import ArshiaSingh.demo.server.HelloServer;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoApplication{
	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoApplication.class);
		//Student student= context.getBean(Student.class);
		//student.setName("Rahul");
		//student.setAge(30);

		//System.out.println(student.getName());
		//System.out.println(student.getAge());

		//OrderService orderService= context.getBean(OrderService.class);
		//orderService.placeOrder();

		//HelloServer helloServer= context.getBean(HelloServer.class);
		//helloServer.hello(); //RUN localhost:8080/hello on BROWSER and it WILL SHOW MESSAGE!!
	}

	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://127.0.0.1:5500","https://localhost:5500").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
}
