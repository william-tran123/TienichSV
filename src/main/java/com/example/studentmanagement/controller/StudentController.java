package com.example.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/home")
    public String showHome(Model model) {
        model.addAttribute("viewName", "home");
        return "layout";
    }

    @GetMapping("/schedule")
    public String showSchedule(Model model) {
        model.addAttribute("viewName", "schedule");
        return "layout";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String studentCode, @RequestParam String password, Model model) {
        if ("123".equals(studentCode) && "123".equals(password)) {
            return "redirect:/students/home";
        }
        model.addAttribute("error", "Sai tài khoản hoặc mật khẩu!");
        return "login";
    }

    @GetMapping("/tuition")
    public String showTuition(Model model) {
        model.addAttribute("viewName", "tuition");
        return "layout";
    }

    @GetMapping("/register")
    public String showRegister(Model model) {
        model.addAttribute("viewName", "register");
        return "layout";
    }

    @GetMapping("/exam-schedule")
    public String showExamSchedule(Model model) {
        model.addAttribute("viewName", "exam-schedule");
        return "layout";
    }

    @GetMapping("/score")
    public String showScore(Model model) {
        model.addAttribute("viewName", "score");
        return "layout";
    }
}