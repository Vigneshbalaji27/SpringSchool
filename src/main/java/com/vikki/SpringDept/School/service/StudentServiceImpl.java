package com.vikki.SpringDept.School.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikki.SpringDept.School.entity.Student;
import com.vikki.SpringDept.School.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> fetchStudentList() {
		// TODO Auto-generated method stub
		return (List<Student>)studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student, Integer id) {
		
		Student stDB=studentRepository.findById(id).get();
		
		 if (Objects.nonNull(student.getStudName())
		            && !"".equalsIgnoreCase(
		            		student.getStudName())) {
		            stDB.setStudName(
		            		student.getStudName());
		        }
		 

		 if (Objects.nonNull(student.getStudAddress())
		            && !"".equalsIgnoreCase(
		            		student.getStudAddress())) {
		            stDB.setStudName(
		            		student.getStudAddress());
		        }

		 if (Objects.nonNull(student.getStudDept())
		            && !"".equalsIgnoreCase(
		            		student.getStudDept())) {
		            stDB.setStudName(
		            		student.getStudDept());
		        }
		
		
		
		return studentRepository.save(stDB);
		
	}

	@Override
	public void deleteStudentById(Integer id) {
		
		studentRepository.deleteById(id);
		
	}


    @Override
    public Student getStudentById(Integer id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        }
        return null;
    }
}
