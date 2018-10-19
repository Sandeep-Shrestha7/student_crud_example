package com.example.student.studentcrud.service;

import java.util.List;
import com.example.student.studentcrud.entity.Student;


public interface StudentService {
		
	public List<Student> getAllStudents();
	public Student getStudentById(Integer id);
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(Integer id);

}
