package com.example.demo;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class gauthcontroller {
	
	@GetMapping("/")
	public String start() {
		return "divineconnect";
	}

    @GetMapping("/home")
    public String home(@AuthenticationPrincipal OAuth2User oauth2User, Model model) {
        if (oauth2User != null) {
            model.addAttribute("name", oauth2User.getAttribute("name"));
            model.addAttribute("photo", oauth2User.getAttribute("picture"));
        }
        return "index";
    }
}
