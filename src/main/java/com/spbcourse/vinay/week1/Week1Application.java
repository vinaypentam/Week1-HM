package com.spbcourse.vinay.week1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1Application implements CommandLineRunner {

	@Autowired
	private CakeBaker bake;

	public static void main(String[] args) {
		SpringApplication.run(Week1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(bake.bakeCake());
	}
}
