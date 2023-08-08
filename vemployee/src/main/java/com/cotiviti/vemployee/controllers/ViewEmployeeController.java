package com.cotiviti.vemployee.controllers;

import com.cotiviti.vemployee.model.Employee;
import com.cotiviti.vemployee.service.ViewEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ViewEmployeeController {


    private ViewEmployeeService viewEmployeeService;

    @Autowired
    public ViewEmployeeController(ViewEmployeeService viewEmployeeService) {
        this.viewEmployeeService = viewEmployeeService;
    }

//    @GetMapping("/employees")
//    public List<Employee> getEmployeesByManagerName(@RequestParam String managerName) {
//        // Delegate to the service to get employees by manager name
//        return viewEmployeeService.getEmployeesByManagerName(managerName);
//    }

    @GetMapping("/employees")
    public Map<String, Object> getEmployeesByManagerName(@RequestParam String managerName) {
        Map<String, Object> result = new HashMap<>();

        List<Employee> employees = viewEmployeeService.getEmployeesByManagerName(managerName);
        result.put("employees", employees);

        Optional<Employee> manager = viewEmployeeService.getManagerByName(managerName);
        result.put("manager", manager.orElse(null));

        return result;
    }
}
