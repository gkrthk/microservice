/**
 * 
 */
package registration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author karthik
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class RegistrationServer {		
	  public static void main(String[] args) {
	    // Tell Boot to look for registration-server.yml	
		System.setProperty("spring.config.name", "registration-server");
	    SpringApplication.run(RegistrationServer.class, args);
	  }	

}
