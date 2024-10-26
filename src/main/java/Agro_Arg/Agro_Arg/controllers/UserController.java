package Agro_Arg.Agro_Arg.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UserController {
    @PostMapping(value = "demo")
    public String welcome()
    {
        return "Welcome from secure endpoint";
    }
}
