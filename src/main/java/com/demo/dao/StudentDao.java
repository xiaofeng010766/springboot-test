package com.demo.dao;

import com.demo.entity.result.Student;

/**
 * Created by Administrator on 2017/3/19.
 */
public interface StudentDao {
    Student findStudent(Integer id);
}
