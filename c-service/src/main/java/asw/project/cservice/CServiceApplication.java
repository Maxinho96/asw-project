package asw.project.cservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient 
public class CServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CServiceApplication.class, args);
	}

}
