package com.accioJob.officeManagementSystem;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;



@RestController
public class Controller {

    Map<Integer, employee> empDB = new HashMap<>();

    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody employee emp) {
        empDB.put(emp.getEmp_id(), emp);

        return "Employee Registered Successfully";
    }

    @GetMapping("/get-employee")
    public employee getEmployee(@RequestParam("q") int empId){
        return empDB.get(empId);
    }

    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable("id") int empId){
        empDB.remove(empId);

        return "Employee Deleted Successfully";
    }

    //update the sal

}
