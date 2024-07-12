package springmvctesting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	
	@RequestMapping("/emp")
	public String showEmployee() {
		return "anurag";
	}
	
//	@RequestMapping("/welcome")
//	public String welcomePage(Model model) {
//		JDBC_Connection jdbccon= new JDBC_Connection();
//		jdbccon.getJDBCConnection();
//		System.out.println("Calling JDBC");
//		return "welcome";
//	}
	
	
	@RequestMapping("/employeePage")
	public String welcomePage(Model model) {
		return "employee";
	}
	
	@PostMapping("/empInfo")
	public String employeeCreate(
			@RequestParam("name") String empName,
			@RequestParam("age") int empAge,
			@RequestParam("address") String empAddress) {
		JDBC_Connection jdbccon= new JDBC_Connection();
		jdbccon.getJDBCConnection(empName,empAge,empAddress);
		System.out.println("Calling JDBC");
		return "welcome";
	}


}
