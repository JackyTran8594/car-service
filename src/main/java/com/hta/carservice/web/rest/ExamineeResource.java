package com.hta.carservice.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * ExamineeResource controller
 */
@RestController
@RequestMapping("/api/examinee")
public class ExamineeResource {

    private final Logger log = LoggerFactory.getLogger(ExamineeResource.class);

    /**
     * GET search
     */
    @GetMapping("/search")
    public String search() {
        return "search";
    }

    /**
     * POST create
     */
    @PostMapping("/create")
    public String create() {
        return "create";
    }

    /**
     * PUT update
     */
    @PutMapping("/update")
    public String update() {
        return "update";
    }

    /**
     * GET getById
     */
    @GetMapping("/get-by-id")
    public String getById() {
        return "getById";
    }

    /**
     * DELETE deleteById
     */
    @DeleteMapping("/delete-by-id")
    public String deleteById() {
        return "deleteById";
    }

    /**
     * POST deleteAll
     */
    @PostMapping("/delete-all")
    public String deleteAll() {
        return "deleteAll";
    }
}
