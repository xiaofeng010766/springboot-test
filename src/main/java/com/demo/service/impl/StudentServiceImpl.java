package com.demo.service.impl;

import com.demo.dao.StudentDao;
import com.demo.entity.result.Student;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/19.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public Student findStudent(Integer id) {
        return studentDao.findStudent(id);
    }
}
