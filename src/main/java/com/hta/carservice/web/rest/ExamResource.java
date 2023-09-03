package com.hta.carservice.web.rest;

import com.hta.carservice.service.dto.request.ExamDTO;
import com.hta.carservice.service.dto.response.ResponseDataObject;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("")
    public ResponseEntity<ResponseDataObject<ExamDTO>> createExam(
        @RequestParam(name = "search") Map<String, Object> searchParams,
        @RequestParam(name = "pageSize") int pageSize,
        @RequestParam(name = "pageNumber") int pageNumber
    ) {
        return null;
    }
}
