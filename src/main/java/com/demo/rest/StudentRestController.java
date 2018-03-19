package com.demo.rest;

import com.demo.entity.param.StudentParam;
import com.demo.entity.result.Student;
import com.demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/19.
 */
@RestController
@RequestMapping("api/")
@Api(description = "swagger测试接口SweggerController",tags = {"SweggerController"})
public class StudentRestController {

    @Autowired
   private StudentService studentService;


    @ApiOperation(value = "获取学生信息接口" , notes = "swagger测试接口")
    @RequestMapping(value = "student/_search",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public Student getStudent(@RequestBody StudentParam param){
       return studentService.findStudent(param.getId());
    }


    @RequestMapping("/getStudentInfo")
    public Student getStudentInfo(){
        Student student = new Student();
        student.setId(1);
        student.setName("張三");
        student.setBirthday(new Date());
        return student;
    }
}
