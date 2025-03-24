package com.roller_speed.app.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.roller_speed.app.dashboard.service.IClassService;
import com.roller_speed.app.dashboard.service.IInstructorService;
import com.roller_speed.app.dashboard.service.IStudentService;
import com.roller_speed.app.dashboard.model.entity.Class;
import com.roller_speed.app.dashboard.model.entity.Instructor;
import com.roller_speed.app.dashboard.model.entity.Role;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class ClassController {

    private final IClassService classService;
    private final IStudentService studentService;
    
    private final IInstructorService instructorService;

    public ClassController(IClassService classService, IStudentService studentService,  IInstructorService instructorService) {
        this.classService = classService;
        this.studentService = studentService;
    
        this.instructorService = instructorService;
    }

    @GetMapping("/students/schedule/{studentId}")
    public String showStudentSchedule(@PathVariable Long studentId, Model model) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("-------------------" + studentId + "-------------------------------------------------------------");    
        System.out.println("--------------------------------------------------------------------------------");
        List<Class> schedule = classService.getStudentSchedule(studentId);
        System.out.println("--------------------------------------------------------------------------------");
        System.err.println(schedule);


        Role role1 = new Role();
        role1.setId(1L);
        role1.setName("ADMIN_ROLE");
        System.out.println("----------- ROLE 1 ---------------------------------------------------------------------");

        Role role2 = new Role();
        role2.setId(2L);
        role2.setName("INSTRUCTOR_ROLE");
        System.out.println("----------- ROLE 2 ---------------------------------------------------------------------");

        Role role3 = new Role();
        role3.setId(3L);
        role3.setName("STUDENT_ROLE");
        System.out.println("----------- ROLE 3 ---------------------------------------------------------------------");


        Instructor instructor = new Instructor();
        instructor.setActive(true);
        
        instructor.setFirstName("Pepe");
        instructor.setLastName("Perez");
        instructor.setYearsExperience(4);
        instructor.setSpecialty("Patinaje de velocidad");
        instructor.setEmail("pepe00perez@gmail.com");
        instructor.setPhone("1234567890");
        instructor.setPassword("12345678");
        //instructor.setRole(role2);
        
        instructorService.saveInstructor(instructor);

        System.out.println("----------- INSTRUCTOR -------------------------------------------------------------");

        
        Class clase1= new Class();
        clase1.setName("Beginner Skating");
        clase1.setInstructor(instructor);
        clase1.setScheduleDate(LocalDateTime.now());

        System.out.println("----------- CLASE 1 ---------------------------------------------------------------------");

        Class clase2= new Class();
        clase2.setName("Intermediate Skating");
        clase2.setInstructor(instructor);        
        clase2.setScheduleDate(LocalDateTime.now());

        System.out.println("----------- CLASE 2 ---------------------------------------------------------------------");





        Class clase3= new Class();
        clase3.setName("Advanced Skating");
        clase3.setInstructor(instructor);        
        clase3.setScheduleDate(LocalDateTime.now());


        System.out.println("----------- CLASE 3 ---------------------------------------------------------------------");

        schedule.add(clase1);
        schedule.add(clase2);
        schedule.add(clase3);
        
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(schedule);
        System.out.println("-------- Shedule today -------------------------------------------------------------------");
        System.out.println(schedule.size());
        System.out.println("------- size -------------------------------------------------------------------");
        System.out.println(schedule.get(0).getName());
        System.out.println("--------------------------------------------------------------------------------");

        model.addAttribute("schedule", schedule);
        return "students/schedule";
    }
}
