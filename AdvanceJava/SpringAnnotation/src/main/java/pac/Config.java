package pac;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Greet greet1() {
		
		
		return new Greet();
		
		
	}
	

}
 