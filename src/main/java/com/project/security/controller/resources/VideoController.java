package com.project.security.controller.resources;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @GetMapping(value = "/{videoName:.+}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public Resource getVideo(@PathVariable String videoName) {
        return new ClassPathResource("static/" + videoName);
    }

}
