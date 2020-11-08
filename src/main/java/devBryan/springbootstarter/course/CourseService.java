package devBryan.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	
	@Autowired
	private CourseRepository courseRepo;
	
	
	public List<Course> getallCourses(String topicId){
		//return topics;
		List<Course> courses = new ArrayList<>();
		courseRepo.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String id) {
		 return courseRepo.findById(id);
	}

	public void addCourse(Course course) {
		courseRepo.save(course);
	}

	public void updateCourse(Course course) {
		courseRepo.save(course);
	}

	public void deleteCourse(String id) {
		courseRepo.deleteById(id);
	}
}
