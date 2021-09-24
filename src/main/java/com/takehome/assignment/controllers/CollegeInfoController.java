package com.takehome.assignment.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/collegeInfos")
public class CollegeInfoController {

    @GetMapping("/findByCollegeName")
    CollegeInfoResponse findByCollegeName(@RequestParam("collegeName") String collegeName, @RequestParam(value = "roomAndBoard", required = false) Boolean roomAndBoard) {
        CollegeInfoResponse collegeInfoResponse = new CollegeInfoResponse();
        return collegeInfoResponse;
    }

}
