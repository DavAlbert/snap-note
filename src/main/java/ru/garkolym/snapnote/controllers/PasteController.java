package ru.garkolym.snapnote.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.garkolym.snapnote.models.Paste;
import ru.garkolym.snapnote.requests.PasteRequest;
import ru.garkolym.snapnote.services.PasteService;

import java.util.Optional;

@Controller
public class PasteController {

    @Autowired
    private PasteService pasteService;

    public PasteController(PasteService pasteService) {
        this.pasteService = pasteService;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String create(@ModelAttribute PasteRequest pasteRequest) {
        String identity = pasteService.savePaste(pasteRequest.getPaste());
        return "redirect:/" + identity;
    }

    @RequestMapping("{identity}")
    public String find(@PathVariable String identity, Model model) {
        Optional<Paste> paste = pasteService.findPaste(identity);
        if (!paste.isPresent()) {
            return "redirect:/";
        }
        model.addAttribute("message", paste.get().getMessage());
        return "paste";
    }
}
