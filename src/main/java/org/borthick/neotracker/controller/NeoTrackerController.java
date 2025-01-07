package org.borthick.neotracker.controller;

import org.borthick.neotracker.service.NeoTrackerService;
import org.borthick.neotracker.service.impl.NeoTrackerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NeoTrackerController {
    @Autowired
    NeoTrackerServiceImpl neoTrackerServiceImpl;

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
