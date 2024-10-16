package com.example.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class zooApplication {

	public static void main(String[] args) {
		System.out.println("███████╗ ██████╗  ██████╗ ");
		System.out.println("╚══███╔╝██╔═══██╗██╔═══██╗");
		System.out.println("  ███╔╝ ██║   ██║██║   ██║");
		System.out.println(" ███╔╝  ██║   ██║██║   ██║");
		System.out.println("███████╗╚██████╔╝╚██████╔╝");
		System.out.println("╚══════╝ ╚═════╝  ╚═════╝ ");
		SpringApplication.run(zooApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

//			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
//				System.out.println(beanName);
			}

			System.out.println();
			System.out.println("Welcome to the Zoo!");
			System.out.println();


			System.out.println("This application will enable you to create your very own zoo.");
		};



	}
}
