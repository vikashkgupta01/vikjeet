package vikjeet.buildAutomate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BuildAutomateApplication {

	@Value("${server.port}")
	private int port;
	public static void main(String[] args) {
		/*SpringApplication.run(BuildAutomateApplication.class, args);

		System.out.println("Application started!!!");
		System.out.println("port ::"+port);*/

		ApplicationContext context = SpringApplication.run(BuildAutomateApplication.class, args);

		// Access the Spring-managed bean
		BuildAutomateApplication app = context.getBean(BuildAutomateApplication.class);
		System.out.println("Application started!!!");
		System.out.println("Port :: " + app.port);
		System.exit(0);

	}

}
