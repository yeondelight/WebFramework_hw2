package kr.ac.hansung.cse.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.cse.model.Course;
import kr.ac.hansung.cse.service.CourseService;


@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/courses")
	public String showOffers(Model model,
			@RequestParam(value="year", required=false) Integer year,
			@RequestParam(value="semester", required=false) Integer semester) {
		
		if (year==null && semester==null) {
			int total = 0;
			List<Course> sums = courseService.getSums();
			for(Course c : sums) {
				total += c.getCredit();
			}
			
			model.addAttribute("sums", sums);
			model.addAttribute("total", total);
			return "courses";
		}
		
		else {
			List<Course> course = courseService.getCourse(year, semester);
			model.addAttribute("course", course);
			return "detailCourse";
		}
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
		courseService.insert(course);
		
		return "courseCreated";
	}

}
