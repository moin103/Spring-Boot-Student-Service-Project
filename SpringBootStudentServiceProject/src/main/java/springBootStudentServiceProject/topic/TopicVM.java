package springBootStudentServiceProject.topic;

import springBootStudentServiceProject.course.CourseVM;

public class TopicVM {
	
	private String id;
	private String name;
	private String description;
	private CourseVM course;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public TopicVM(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	/*public CourseVM getCourse() {
		return course;
	}
	public void setCourse(CourseVM course) {
		this.course = course;
	}*/
	
	public TopicVM(String id, String name, String description, CourseVM course) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.course = course;
	}
	
	
}
