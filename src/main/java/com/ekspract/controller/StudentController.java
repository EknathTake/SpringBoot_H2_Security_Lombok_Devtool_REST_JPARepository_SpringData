package com.ekspract.controller;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ekspract.model.Student;
import com.ekspract.service.IStudentService;

@RestController
public class StudentController {

	@Inject /// @Autowired
	@Named("studentService")
	private IStudentService studentService;

	@GetMapping(path = { "/", "/students" })
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping(path = "/students/{id}")
	public Student getStudentById(@PathVariable(name = "id") Long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping(path = "/students")
	public Student saveStudent(@RequestBody Student student) {
		student.getId();
		return studentService.saveStudent(student);
	}
}
