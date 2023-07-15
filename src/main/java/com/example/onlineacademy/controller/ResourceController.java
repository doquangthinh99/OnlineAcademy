package com.example.onlineacademy.controller;

import org.aspectj.util.FileUtil;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class ResourceController {
    @GetMapping("/image")
    @ResponseBody
    public HttpEntity<byte[]> getPhoto(@RequestParam("filename") String filename) {
        byte[] image = new byte[0];
        if(!filename.equals("undefined")) {
            InputStream is = null;
            try {
                is = new ClassPathResource("/data/" + filename).getInputStream();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                image = FileUtil.readAsByteArray(is);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);
        headers.setContentLength(image.length);
        return new HttpEntity<byte[]>(image, headers);
    }

    @GetMapping("/video")
    @ResponseBody
    public HttpEntity<byte[]> getVideo(@RequestParam("filename") String filename) {
        byte[] image = new byte[0];
        if(!filename.equals("undefined")) {
            InputStream is = null;
            try {
                is = new ClassPathResource("/data/" + filename).getInputStream();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                image = FileUtil.readAsByteArray(is);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("video/mp4"));
        headers.setContentLength(image.length);
        return new HttpEntity<byte[]>(image, headers);
    }

}
