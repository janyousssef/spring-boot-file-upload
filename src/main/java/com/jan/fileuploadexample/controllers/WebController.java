package com.jan.fileuploadexample.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
public class WebController {
    @PostMapping("/upload")
    void uploadFile(@RequestBody MultipartFile file){
        log.info("file uploaded {}",file);
        System.out.println(file.getContentType());
    }
}
