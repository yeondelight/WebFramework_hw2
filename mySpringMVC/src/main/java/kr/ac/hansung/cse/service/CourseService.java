package kr.ac.hansung.cse.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.cse.dao.CourseDao;
import kr.ac.hansung.cse.model.Course;

@Service
public class CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	public List<Course> getCurrent(){
		return courseDao.getCourses();
	}
	
	public void insert(Course course) {
		courseDao.insert(course);
	}
	
	public List<Course> getSums() {
		return courseDao.getSums();
	}

	public List<Course> getCourse(int year, int semester) {
		return courseDao.getCourse(year, semester);
	}
}
