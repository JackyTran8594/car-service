package com.hta.carservice.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExamResource controller
 */
@RestController
@RequestMapping("/api/exam")
public class ExamResource {

    private final Logger log = LoggerFactory.getLogger(ExamResource.class);

    /**
     * GET getExam
     */
    @GetMapping("/get-exam")
    public String getExam() {
        return "getExam";
    }
}
