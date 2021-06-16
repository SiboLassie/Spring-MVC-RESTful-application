package com.SpringMVCRESTfulapplication.controller;

import com.SpringMVCRESTfulapplication.model.FullDate;
import com.SpringMVCRESTfulapplication.model.GrDate;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DateController {

    GrDate grDate;
    /**
     * This Method is getting the date from the UI and send it to the url of hebcal-API,
     * gets from the API a json string and parse it, then send it to the jsp view for display.
     * @param date is the gregorian date from UI entered by the user.
     * @return a ModelView of the converted date.
     */
    @RequestMapping(value = "date", method = RequestMethod.POST)
    public ModelAndView getDate(@ModelAttribute GrDate date) {
        grDate = date;

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("https://www.hebcal.com/converter?cfg=json&gy="+date.getYear()+"&gm="+date.getMonth()+"&gd="+date.getDay()+"&g2h=1", String.class);

        Gson gson = new Gson();
        FullDate fullDate = gson.fromJson(response, FullDate.class);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("result", fullDate.getHebrew());
        modelAndView.addObject("grDate", date.toString());
        return modelAndView;
    }
}