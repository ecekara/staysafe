package com.example.staysafe.controller;

import com.example.staysafe.domain.Reservation;
import com.example.staysafe.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class ReservationController {

    @Autowired
    private ReservationService service;

    @GetMapping("/res")
    public String viewHomePage(Model model){
        List<Reservation> listReservation= service.listAll();
        model.addAttribute("listereservasyon",listReservation);
        System.out.println("Get / ");
        return "index";
    }

    @GetMapping("/reservation")
    public String add(Model model){
        model.addAttribute("employee", new Reservation());
        return "reservation";
    }

    @RequestMapping(value = "/saveRes", method = RequestMethod.POST)
    public String saveReservation (@ModelAttribute("Reservation") Reservation res) {
        service.save(res);
        return "redirect:/";

    }
    @RequestMapping("/editRes/{id}")
    public ModelAndView showEditReservationPage (@PathVariable(name = "id") int id){
        ModelAndView mav = new ModelAndView("new");
        Reservation res = service.get(id);
        mav.addObject("reservation",res);
        return mav;

    }

    @RequestMapping("/deleteRes/{id}")
    public String deleteReservationPage(@PathVariable(name = "id") int id){
        service.delete(id);
        return "redirect:/";

    }



}
