package ru.garkolym.snapnote.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PasteController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}