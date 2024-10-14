package nz.ac.auckland;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class Main implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	Logger logger = LoggerFactory.getLogger(Main.class);
	Logger syslogger = LoggerFactory.getLogger("Syslogger");
			
	@Override
	public void run(String... args) {
		System.out.println("Hello, world!");
		System.out.println(Main.class.getName());
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		try {
			throw new Exception("some exception");
		} catch (Exception e) {
			logger.error("bla ", e);
		}
				
	}
}