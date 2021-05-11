package com.example.staysafe.controller;

import com.example.staysafe.domain.Employee;
import com.example.staysafe.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String viewHomePage(Model model){
        List<Employee> listemployee = service.listAll();
        model.addAttribute("listemployee",listemployee);
        System.out.println("Get / ");
        return "index";
    }

    @GetMapping("/newEmp")
    public String add(Model model){
        model.addAttribute("employee", new Employee());
        return "newEmp";
    }

    @RequestMapping(value = "/saveEmp", method = RequestMethod.POST)
    public String saveEmployee (@ModelAttribute("employee") Employee emp) {
        service.save(emp);
        return "redirect:/";

    }
    @RequestMapping("/editEmp/{id}")
    public ModelAndView showEditEmployeePage (@PathVariable(name = "id") int id){
        ModelAndView mav = new ModelAndView("new");
        Employee emp = service.get(id);
        mav.addObject("employee",emp);
        return mav;

    }

    @RequestMapping("/deleteEmp/{id}")
    public String deleteEmployeePage(@PathVariable(name = "id") int id){
        service.delete(id);
        return "redirect:/";

    }



}
