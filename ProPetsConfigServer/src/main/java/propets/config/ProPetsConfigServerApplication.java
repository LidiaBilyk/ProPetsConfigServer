package propets.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProPetsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProPetsConfigServerApplication.class, args);
	}

}
