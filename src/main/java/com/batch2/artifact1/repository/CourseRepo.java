package com.batch2.artifact1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batch2.artifact1.domain.Student;

public interface CourseRepo extends JpaRepository<Student, Long> {

}
