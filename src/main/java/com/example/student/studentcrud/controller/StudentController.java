package com.example.student.studentcrud.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.studentcrud.entity.Student;
import com.example.student.studentcrud.service.StudentService;

@RestController
@RequestMapping(value="/api")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getAllStudents(@AuthenticationPrincipal final UserDetails userDetails){
		// 2. by using @AuthenticationPricipal and Userdetails class we can 
		// authorize the user 
		//Collection<? extends GrantedAuthority>authority=userDetails.getAuthorities();
		//authority.forEach(System.out::println);
		
		return studentService.getAllStudents();
		 
	}
	
	@GetMapping(value="/student/{id}")
	public Student getStudentById(@PathVariable Integer id){
		
		return studentService.getStudentById(id);
	}
	
	@PostMapping(value="/student")
	public Student addStudent(@RequestBody Student student) {
		 return studentService.addStudent(student);
	}
	
	@DeleteMapping("/Student/{id}")
	public void deleteStudent(@PathVariable Integer id){
		 studentService.deleteStudent(id);
	}
	
	@PutMapping("/student/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable Integer id){
		
		return studentService.updateStudent(student);
	}

}
