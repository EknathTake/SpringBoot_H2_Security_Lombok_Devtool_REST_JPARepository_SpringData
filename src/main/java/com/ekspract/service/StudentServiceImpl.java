package com.ekspract.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

import com.ekspract.model.Student;
import com.ekspract.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Inject
	@Named("studentRepository")
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) { //
		studentRepository.save(student);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElse(new Student());
	}

}
