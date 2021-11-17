package kr.ac.hansung.cse.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.cse.model.Course;
import kr.ac.hansung.cse.model.CourseBySemester;
import kr.ac.hansung.cse.service.CourseService;


@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/courses")
	public String showOffers(Model model) {
		int total = 0;
		List<Course> sums = courseService.getSums();
		for(Course c : sums) {
			total += c.getCredit();
		}
		
		model.addAttribute("sums", sums);
		model.addAttribute("total", total);
		return "courses";
	}
	
	@RequestMapping("/createCourse")
	public String createOffer(Model model) {
		model.addAttribute("course", new Course());
		
		return "createCourse";
	}
	
	@RequestMapping("/doCreate")
	public String doCreate(Model model, @Valid Course course, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("==Form data does not validated===");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error : errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "createCourse";
		}
		
		System.out.println(course);
		//courseService.insert(offer);
		
		return "courseCreated";
	}

}
