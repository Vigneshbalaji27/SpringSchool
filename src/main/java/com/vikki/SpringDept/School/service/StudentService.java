package com.vikki.SpringDept.School.service;

import java.util.List;

import com.vikki.SpringDept.School.entity.Student;

public interface StudentService {
	
	// Save operation
    Student saveStudent(Student student);
 
    // Read operation
    List<Student> fetchStudentList();
 
    // Update operation
    Student updateStudent(Student student,
                                Integer id);
    
    Student getStudentById(Integer id);
 
    // Delete operation
    void deleteStudentById(Integer id);

}
