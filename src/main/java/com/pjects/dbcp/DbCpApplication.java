package com.pjects.dbcp;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import com.pjects.dbcp.frames.DemoFrame;
import com.pjects.dbcp.frames.MainFrame;

@SpringBootApplication
public class DbCpApplication {


    /**
     * Application main() method.
     *
     * Uses the fluent {@link SpringApplicationBuilder} to create and run the
     * {@link SpringApplication} object.
     *
     * The options specified:
     *
     * <ul>
     * <li>headless(false) - allow AWT classes to be instantiated</li>
     * <li>web(false) - prevents the bundling of Tomcat or other Web components
     * </ul>
     *
     * Execution is picked up by the {@link Runner} class, which implements
     * {@link CommandLineRunner}.
     *
     * @param args
     */
	public static void main(String[] args) throws Exception {

		SpringApplication springApplication = new SpringApplication(DbCpApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.setHeadless(false);
		springApplication.setWebEnvironment(false);
		springApplication.run(args);

	}

    /**
     * Creates the {@link DemoFrame} object and returns it.
     *
     * This @Bean could have been replaced by a @Component annotation being
     * added to the {@link DemoFrame} class.
     *
     * @return the application window
     */
    @Bean
    public DemoFrame frame() {
        return new DemoFrame();
    }
    
    @Bean
    public MainFrame mainFrame() {
    	return new MainFrame();
    }
}
	

