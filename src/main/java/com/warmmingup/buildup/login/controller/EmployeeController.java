package com.warmmingup.buildup.login.controller;

import com.warmmingup.buildup.common.ResponseDTO;
import com.warmmingup.buildup.login.dto.MemberDTO;
//import com.warmmingup.buildup.login.service.EmployeeService;
import com.warmmingup.buildup.login.service.MemberService;
import com.warmmingup.buildup.project.dto.ProjectDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    private final MemberService memberService;


    public EmployeeController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/auth/login/{employeeNo}")
    public ResponseEntity<ResponseDTO> selectMyEmployeeInfo(@PathVariable String employeeNo) {

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "조회 성공", memberService.selectMyEmployeeInfo(employeeNo)));
    }



}
