package ru.garkolym.snapnote.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.garkolym.snapnote.requests.PasteRequest;

@Controller
public class PasteController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String create(@ModelAttribute PasteRequest pasteRequest, Model model) {
        model.addAttribute("redirect", "yes");
        return "index";
    }
}
