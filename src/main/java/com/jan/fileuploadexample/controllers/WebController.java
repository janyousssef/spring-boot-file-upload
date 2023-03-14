package com.jan.fileuploadexample.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
public class WebController {
    @PostMapping(value = "/upload")
    String uploadFile(@RequestBody MultipartFile file){
        log.info("file uploaded {}",file);
        return "upload success";
    }
}
