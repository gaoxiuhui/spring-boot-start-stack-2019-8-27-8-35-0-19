package com.tw.apistackbase.controller;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tw.apistackbase.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
     private static List<Employee> employees=new ArrayList<Employee>(){{
    	 add(new Employee(1,"小明",18,"男"));
    	 add(new Employee(2,"小红",28,"女"));
    	 add(new Employee(3,"小方",38,"男"));
    	 add(new Employee(4,"小李",48,"男"));
     }};
    @GetMapping
    public ResponseEntity<List<Employee>> queryEmployeeList() {             
        return ResponseEntity.ok(employees);       
    }

//    @GetMapping(path = "/{userId}")
//    public ResponseEntity<Employee> queryEmployeeByID(@PathVariable Integer userId) {
//        List<Employee> employees=new ArrayList<>();
//        Employee employee1=new Employee();
//        employee1.setAge(18);
//        employee1.setGender("女");
//        employee1.setId(1);
//        employee1.setName("luna");
//        employees.add(employee1);
//        
//        Employee employee2=new Employee();
//        employee2.setAge(19);
//        employee2.setGender("女");
//        employee2.setId(2);
//        employee2.setName("高阳");
//        employees.add(employee2);
//        for(Employee employee:employees) {
//        	if(employee.getId()==userId) {
//        		 return ResponseEntity.ok(employee);      
//        	}
//        }
//        return null;
//    }
    
//    @GetMapping
//    public ResponseEntity<List<Employee>> queryEmployeeByName(@RequestParam(name="name") String nameLike) {
//        List<Employee> employees=new ArrayList<>();
//        List<Employee> employeesResult=new ArrayList<>();
//        Employee employee1=new Employee();
//        employee1.setAge(18);
//        employee1.setGender("女");
//        employee1.setId(1);
//        employee1.setName("luna");
//        employees.add(employee1);
//        
//        Employee employee2=new Employee();
//        employee2.setAge(19);
//        employee2.setGender("女");
//        employee2.setId(2);
//        employee2.setName("高阳");
//        employees.add(employee2);
//        
//        for(Employee employee:employees) {
//        	if(employee.getName().contains(nameLike)) {
//        		employeesResult.add(employee);   
//        	}
//        }
//        return ResponseEntity.ok(employeesResult);      
//    }
	
//	@PostMapping(consumes="application/json")
//	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
//		employees.add(employee);
//		return ResponseEntity.status(HttpStatus.CREATED).build();   
//	}
    
//    @PutMapping(consumes="application/json")
//	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
//		//service.updateEmployee(employee);
//		return ResponseEntity.status(HttpStatus.OK).build();   
//	}
	
    @DeleteMapping("/{id}")
	public ResponseEntity<Employee> deleteEmployeeByID(@PathVariable Integer id){
		//service.deleteEmployee(id);
		return ResponseEntity.status(HttpStatus.OK).build();   
	}
}