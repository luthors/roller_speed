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

import com.roller_speed.app.dashboard.model.entity.Role;
import com.roller_speed.app.dashboard.model.entity.Student;
import com.roller_speed.app.dashboard.service.IRoleService;
import com.roller_speed.app.dashboard.service.IStudentService;


@Controller
@RequestMapping("/students")
public class StudentController{
    
    private final IStudentService studentService;
    private final IRoleService roleService;
    
    
    public StudentController(IStudentService studentService, IRoleService roleService) {
        this.studentService = studentService;
        this.roleService = roleService;
    }
    
    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        
        Role role1 = new Role();
        role1.setName("ADMIN_ROLE");
        roleService.saveRole(role1);

        Role role2 = new Role();
        role2.setName("INSTRUCTOR_ROLE");
        roleService.saveRole(role2);

        Role role3 = new Role();
        role3.setName("STUDENT_ROLE");
        roleService.saveRole(role3);
    
        Student student = new Student();
        student.setFirstName("Juan");
        student.setLastName("Perez");
        student.setBirthDate("1990-01-01");
        student.setGender("Masculino");
        student.setActive(true);
        student.setEmail("juanperez@gmail.com");
        student.setPhone("1234567890");
        student.setPassword("12345678");
        student.setRole(role3);

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getBirthDate());
        System.out.println(student.getGender());
        System.out.println(student.getEmail());
        System.out.println(student.getPhone());
        System.out.println(student.getPassword());

        studentService.saveStudent(student);
        
        
        model.addAttribute("student", student); 
        return "students/student_page";
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
