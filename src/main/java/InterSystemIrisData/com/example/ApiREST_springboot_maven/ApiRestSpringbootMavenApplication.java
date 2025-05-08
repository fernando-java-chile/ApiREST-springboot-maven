package InterSystemIrisData.com.example.ApiREST_springboot_maven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("InterSystemIrisData.com.example.ApiREST_springboot_maven.mapper")
public class ApiRestSpringbootMavenApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringbootMavenApplication.class, args);
	}

}
