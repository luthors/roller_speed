package com.roller_speed.app.dashboard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.roller_speed.app.dashboard.model.entity.Student;
import com.roller_speed.app.dashboard.service.IStudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
    
    private final IStudentService studentService;
    
    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }
    
    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "/students/dashboard";
    }
    
    @GetMapping("/payments")
    public String showPayments(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students/payments";
    }
    
    @GetMapping("/schedule")
    public String showSchedule(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students/schedule";
    }
    
    @GetMapping("/new")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "students/form";
    }
    
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students/dashboard";
    }
    
    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        Optional<Student> student = studentService.getStudentById(id);
        if (student.isPresent()) {
            model.addAttribute("student", student.get());
            return "students/form";
        }
        return "redirect:/students/dashboard";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students/dashboard";
    }
}
