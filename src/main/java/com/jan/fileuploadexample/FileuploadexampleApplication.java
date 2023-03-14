package com.jan.fileuploadexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class FileuploadexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileuploadexampleApplication.class, args);
	}

}
