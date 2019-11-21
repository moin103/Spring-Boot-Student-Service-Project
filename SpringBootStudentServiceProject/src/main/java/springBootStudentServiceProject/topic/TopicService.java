

package springBootStudentServiceProject.topic;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
//	@Autowired
//	private TopicRepository topicRepository;
//	
//	/*private List<Student> students= new ArrayList<>(Arrays.asList(
//			new Student("101","moin","X"),
//			new Student("102","mahmud","Y")
//	));*/
//	
//	public List<Topic> getAllTopics(String courseId){
//		//return students;
//		
//		List<Topic> topics=new ArrayList<>();
//		topicRepository.findByCourseId(courseId)
//		.forEach(topics::add);
//		return topics;
//	}
//	
//
//	
//	public Optional<Topic> getTopic(String id) {
//		//return students.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//		return topicRepository.findById(id);
//	}
//	public void addTopic(Topic topic) {
//		topicRepository.save(topic);	
//	}
//	public void updateTopic(Topic topic) {
//	/*	for(int i=0;i<students.size();i++) {
//			Student s=students.get(i);
//			if(s.getId().equals(id)) {
//				students.set(i, student);
//				return; 
//			}
//		}*/
//		topicRepository.save(topic);
//	}
//	public void deleteTopic(String id) {
//		//students.removeIf(t -> t.getId().equals(id));
//		topicRepository.deleteById(id);
//	}
////
//// ///////////////////////////////////////////////////////////////////
////	
////	public List<Topic> getAllTopicsOnly(String id) {
////			//return students;
////			
////			List<Topic> topics=new ArrayList<>();
////			topicRepository.findByCourseId(id)
////			.forEach(topics::add);
////			return topics;
////		}
////
////
////
////	public void addTopicOnly(Topic topic) {
////		topicRepository.save(topic);
////		
////	}
////
////
////
////	public List<Topic> getAllTopicsOfAllCourses() {
////		List<Topic> topics=new ArrayList<>();
////		topicRepository.findAll()
////		.forEach(topics::add);
////		return topics;
////		
////	}
////
////
////
////	public void addTopicOfAllCourse(Topic topic) {
////		topicRepository.save(topic);
////		
////	}
////	
////	
////	/////////////////////////////////////////////////
//
//
//
//	public List<Topic> getAllTopicsOnly() {
//		List<Topic> topics=new ArrayList<>();
//		topicRepository.findAll()
//		.forEach(topics::add);
//		return topics;
//	}
//
//
//
//	public void addTopicOnly(Topic topic) {
//		topicRepository.save(topic);
//		
//	}
//
//
//
//	public void deleteTopicsOnly(String id) {
//		topicRepository.deleteById(id);
//		
//	}
//
//
//
//	public List<Topic> getAllTopicsOfACourse(String courseId) {
//
//		List<Topic> topics=new ArrayList<>();
//		topicRepository.findByCourseId(courseId)
//		.forEach(topics::add);
//		return topics;
//	}
	
}

