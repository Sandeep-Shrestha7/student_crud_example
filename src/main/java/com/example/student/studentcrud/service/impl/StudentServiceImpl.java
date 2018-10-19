package com.example.student.studentcrud.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.studentcrud.entity.Student;
import com.example.student.studentcrud.repository.StudentRepository;
import com.example.student.studentcrud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		
		 Student student=studentRepository.findById(id).get();
		 
		 return student;
		 
	}

	@Override
	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
		
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
		
	}

	@Override
	public void deleteStudent(Integer id) {
		
		 studentRepository.deleteById(id);
		
	}

}
