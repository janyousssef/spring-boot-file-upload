package com.jan.fileuploadexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class FileUploadExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadExampleApplication.class, args);
	}

}
