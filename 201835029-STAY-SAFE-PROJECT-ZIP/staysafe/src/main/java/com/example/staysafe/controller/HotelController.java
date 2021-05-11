package com.example.staysafe.controller;

import com.example.staysafe.domain.Hotel;
import com.example.staysafe.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class HotelController {

    @Autowired
    private HotelService service;

    @GetMapping("/hotel")
    public String viewHomePage(Model model){
        List<Hotel> listHotel = service.listAll();
        model.addAttribute("listHotel",listHotel);
        System.out.println("Get / ");
        return "index";
    }

    @GetMapping("/hotelList")
    public String add(Model model){
        model.addAttribute("Hotel", new Hotel());
        return "hotelList";
    }

    @RequestMapping(value = "/saveHotel", method = RequestMethod.POST)
    public String saveHotel (@ModelAttribute("employee") Hotel hotel) {
        service.save(hotel);
        return "redirect:/";

    }
    @RequestMapping("/editHotel/{id}")
    public ModelAndView showEditHotelPage (@PathVariable(name = "id") int id){
        ModelAndView mav = new ModelAndView("new");
        Hotel hotel = service.get(id);
        mav.addObject("hotel",hotel);
        return mav;

    }

    @RequestMapping("/deleteHot/{id}")
    public String deleteHotelPage(@PathVariable(name = "id") int id){
        service.delete(id);
        return "redirect:/";

    }



}
