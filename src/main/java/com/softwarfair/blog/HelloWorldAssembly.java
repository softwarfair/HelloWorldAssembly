package com.softwarfair.blog;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class HelloWorldAssembly {
	private static final Logger logger = Logger.getLogger(HelloWorldAssembly.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.info("Hello world!");
	}
}
