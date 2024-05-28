package com.vikki.SpringDept.School.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vikki.SpringDept.School.entity.Student;
import com.vikki.SpringDept.School.service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public Student saveStudent(
			@Validated @RequestBody Student student) {
		
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> fetchStudentList(){
		return studentService.fetchStudentList();
	}
	
	@PutMapping("/students/{id}")
	public Student updateStudent(@RequestBody Student student,
			@PathVariable("id") Integer id) {
		
		return studentService.updateStudent(student, id);
	}
	
	@GetMapping("/student/{id}")
	    public Student getStudentById(@PathVariable("id") Integer id) {
	        return studentService.getStudentById(id);
	    }
	
	@DeleteMapping("/students/{id}")
	public String deleteStudentById(@PathVariable("id") Integer id) {
		
		studentService.deleteStudentById(id);
		
		return "Student with "+id +" deleted successfully";
	}

}
