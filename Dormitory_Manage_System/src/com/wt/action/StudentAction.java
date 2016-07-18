package com.wt.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wt.entity.Dormitory;
import com.wt.entity.Student;
import com.wt.service.DormitoryService;
import com.wt.service.StudentService;

public class StudentAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	private StudentService studentService;

	ActionContext context = ActionContext.getContext();

	HttpServletRequest request = (HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);

	HttpSession session = request.getSession();

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public String studentList() {

		List<Student> students = studentService.getAll();

		// 以下为测试时使用
		for (Student student : students) {

			System.out.println("name -- " + student.getStudent_name());
			System.out.println("phone -- " + student.getStudent_phone());
			System.out.println("sex -- " + student.getStudent_sex());

		}
		
		if(students != null){
			Map<String, Object> mapSession = ActionContext.getContext().getSession();
			mapSession.put("students", students);
		}
		
		return "studentList";
	}
}
