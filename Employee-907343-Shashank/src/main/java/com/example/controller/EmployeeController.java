package com.example.controller;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;
	import com.example.model.Employee;
	import com.example.service.EmployeeService;
	//mark class as Controller
	@RestController
	public class EmployeeController 
	{
	//autowire the BooksService class
	@Autowired
	EmployeeService employeeService;
	//creating a get mapping that retrieves all the books detail from the database 
	@GetMapping("/employee")
	private List<Employee> getAllEmployee() 
	{
	return employeeService.getAllEmployee();
	}
	//creating a get mapping that retrieves the detail of a specific book
	@GetMapping("/employee/{id}")
	private Employee getEmployee(@PathVariable("id") int id) 
	{
	return employeeService.getEmployeeById(id);
	}
	//creating a delete mapping that deletes a specified book
	@DeleteMapping("/employee/{id}")
	private void deleteEmployee(@PathVariable("id") int id) 
	{
	employeeService.delete(id);
	}
	//creating post mapping that post the book detail in the database
	@PostMapping("/employees")
	private int saveEmployee(@RequestBody Employee employee) 
	{
	employeeService.saveOrUpdate(employee);
	return employee.getId();
	}
	//creating put mapping that updates the book detail 
	@PutMapping("/employees")
	private Employee update(@RequestBody Employee employee) 
	{
	employeeService.saveOrUpdate(employee);
	return employee;
	}
}
