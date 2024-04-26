package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleJbossController {

	
	 @GetMapping("/welcome")
     public String welcome() {
        
         return "Hello welcome to new spring boot App ";
     }
	 @GetMapping("/")
     public String home() {
        
         return "Hello welcome to new spring boot Home App ";
     }
	 @GetMapping("/hello")
     public String home() {
        
         return "Hello welcome to new spring boot Home App deployed in JBoss EAP 8 ";
     }
}
