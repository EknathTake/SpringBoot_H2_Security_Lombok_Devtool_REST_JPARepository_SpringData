package com.ekspract.service;

import java.util.List;

import com.ekspract.model.Student;

public interface IStudentService {

	Student saveStudent(Student student);

	List<Student> getAllStudents();

	Student getStudentById(Long id);

}
