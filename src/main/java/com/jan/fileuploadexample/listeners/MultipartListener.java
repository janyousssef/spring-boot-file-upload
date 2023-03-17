package com.jan.fileuploadexample.listeners;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@WebListener
@Slf4j
public class MultipartListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest httpServletRequest = (HttpServletRequest) sre.getServletRequest();
        String header = httpServletRequest.getHeader("content-type");
        if (header!= null && header.startsWith("multipart/form-data;"))
            log.info("from listener: file upload started");
    }
}
