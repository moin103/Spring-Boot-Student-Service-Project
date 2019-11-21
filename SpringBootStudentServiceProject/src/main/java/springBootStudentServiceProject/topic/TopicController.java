package springBootStudentServiceProject.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
//	
//	@RequestMapping("/students/{studentId}/courses/{id}/topics")
//	public List<Topic> getAllTopics(@PathVariable String id,@PathVariable String studentId){
//		return topicService.getAllTopics(id);
//	}
//	@RequestMapping("/students/{studentId}/courses/{courseId}/topics/{id}")
//	 public Optional<Topic> getTopic(@PathVariable String id,@PathVariable String studentId,@PathVariable String courseId) {
//		 return topicService.getTopic(id);
//	 }
//	@RequestMapping(method=RequestMethod.POST,value="/students/{studentId}/courses/{courseId}/topics")
//	public void addTopic(@RequestBody Topic topic) {
//	//	topic.setCourse(new Course(courseId,"",topicList,studentList));
//		topicService.addTopic(topic);          
//	}
//	@RequestMapping(method=RequestMethod.PUT,value=" /students/{studentId}/courses/{courseId}/topics/{id}")
//	public void updateTopic(@RequestBody Topic topic) {
//		//topic.setCourse(new Course(courseId,"",topicList,studentList));
//		topicService.updateTopic(topic);
//	}
//	@RequestMapping(method=RequestMethod.DELETE,value="/students/{studentId}/courses/{courseId}/topics/{id}")
//	public void deleteTopic(@PathVariable String id) {
//		topicService.deleteTopic(id);
//	}

	//	/////////////////////////////////////////////////////////////\\\\\\\\\\\\
//	/////////////////////////////////////////////////////////////\\\\\\\\\\\\
//	@RequestMapping("/topics")
//	public List<Topic> getAllTopicsOfAllCourses(){
//		return topicService.getAllTopicsOfAllCourses();
//	}
//	@RequestMapping(method=RequestMethod.POST,value="/topics")
//	public void addTopicOfAllCourses(@RequestBody Topic topic,@RequestBody List<Topic> topicList,@RequestBody List<Student> studentList,@PathVariable String courseId) {
//		topic.setCourse(new Course(courseId,"",topicList,studentList));
//		topicService.addTopicOfAllCourse(topic);          
//	}
//	/////////////////////////////////////////////////////////////\\\\\\\\\\\\
//	/////////////////////////////////////////////////////////////\\\\\\\\\\\\
//	
//	@RequestMapping("/topics")
//	public List<Topic> getAllTopicsOnly(){
//		return topicService.getAllTopicsOnly();
//	}
//	@RequestMapping(method=RequestMethod.POST,value="/topics")
//	public void addTopicOnly(@RequestBody Topic topic) {
//		
//		topicService.addTopicOnly(topic);          
//	}
//	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
//	public void deleteTopicsOnly(@PathVariable String id) {
//		topicService.deleteTopicsOnly(id);
//	}
//	@RequestMapping("/courses/{id}/topics")
//	public List<Topic> getAllTopicsOfACourses(@PathVariable String courseId){
//		return topicService.getAllTopicsOfACourse(courseId);
//	}
	
}




