package mhtowel.controller;

import mhtowel.dto.Towel;
import mhtowel.service.TowelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class TowelController {

    @Autowired
    private TowelService towelService;

    public List<Towel> initList() {
        return towelService.getListService();
    }
    @RequestMapping(value = "/index.html")
    public String index(final Model model) {
       model.addAttribute("listTowel", this.initList());
        return "index";
    }
}
