package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerInquiryServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.setProperty("spring.config.name", "customer-server");
		SpringApplication.run(CustomerInquiryServer.class, args);
	}
}
