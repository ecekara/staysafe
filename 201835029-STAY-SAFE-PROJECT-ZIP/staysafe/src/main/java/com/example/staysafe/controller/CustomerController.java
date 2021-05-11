package com.example.staysafe.controller;

import com.example.staysafe.domain.Customer;
import com.example.staysafe.domain.Hotel;
import com.example.staysafe.service.CustomerService;
import com.example.staysafe.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/customer")
    public String viewHomePage(Model model){
        List<Customer> listCustomer = service.listAll();
        model.addAttribute("listCustomer",listCustomer);
        System.out.println("Get / ");
        return "index";
    }

    @GetMapping("/newCus")
    public String add(Model model){
        model.addAttribute("customer", new Customer());
        return "newCus";
    }

    @RequestMapping(value = "/saveCus", method = RequestMethod.POST)
    public String saveCustomer (@ModelAttribute("customer") Customer customer) {
        service.save(customer);
        return "redirect:/";

    }
    @RequestMapping("/editCus/{id}")
    public ModelAndView showEditCustomerPage (@PathVariable(name = "id") int id){
        ModelAndView mav = new ModelAndView("new");
        Customer customer = service.get(id);
        mav.addObject("customer",customer);
        return mav;

    }

    @RequestMapping("/deleteCus/{id}")
    public String deleteCustomerPage(@PathVariable(name = "id") int id){
        service.delete(id);
        return "redirect:/";

    }



}
