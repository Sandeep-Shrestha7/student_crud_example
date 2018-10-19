package com.example.student.studentcrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.student.studentcrud.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
