package io.javabrains.springbootstarter.course;


import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(){
		List<Course> courses=new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}
	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}
	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
	}
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
		
	}
}
