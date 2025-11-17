package com.example.selab5;

import com.example.selab5.entity.ApplicationRequest;
import com.example.selab5.entity.Courses;
import com.example.selab5.entity.Operators;
import com.example.selab5.repository.ApplicationRequestRepository;
import com.example.selab5.repository.CoursesRepository;
import com.example.selab5.repository.OperatorsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Selab5Application {
    public static void main(String[] args) {
        SpringApplication.run(Selab5Application.class, args);
    }

//    @Bean
//    CommandLineRunner seed(CoursesRepository coursesRepo, OperatorsRepository operatorsRepo, ApplicationRequestRepository reqRepo) {
//        return args -> {
//            if (coursesRepo.count() == 0) {
//                coursesRepo.saveAll(List.of(
//                        new Courses(null, "Java Standard Edition", "Core Java", 45000),
//                        new Courses(null, "Java Pro", "Advanced Java", 65000),
//                        new Courses(null, "Web Technologies", "HTML/CSS/JS", 35000),
//                        new Courses(null, "UX/UI Design", "Design basics", 30000),
//                        new Courses(null, "Django Framework", "Python web dev", 40000),
//                        new Courses(null, "Spring Boot", "Spring Boot deep dive", 55000)
//                ));
//            }
//            if (operatorsRepo.count() == 0) {
//                operatorsRepo.saveAll(List.of(
//                        new Operators(null, "Ali", "Jumash", "IT"),
//                        new Operators(null, "Aidana", "Nasip", "Praja"),
//                        new Operators(null, "Andrei", "Lee", "Marketing"),
//                        new Operators(null, "Diana", "Samatova", "IT"),
//                        new Operators(null, "EmaÍ", "Stone", "Marketing")
//                ));
//            }
//            if (reqRepo.count() == 0) {
//                Courses c = coursesRepo.findAll().get(0);
//                ApplicationRequest r = new ApplicationRequest();
//                r.setUserName("Demo User");
//                r.setPhone("+77027777777");
//                r.setCommentary("How long does the course take?");
//                r.setHandled(false);
//                r.setCourse(c);
//                reqRepo.save(r);
//            }
//        };
//    }
}
