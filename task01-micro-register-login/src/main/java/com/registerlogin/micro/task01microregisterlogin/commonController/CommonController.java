package com.registerlogin.micro.task01microregisterlogin.commonController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.EntityResponse;

import com.registerlogin.micro.task01microregisterlogin.Repository.RegisterRepository;
import com.registerlogin.micro.task01microregisterlogin.RestClient.ClientUser;
import com.registerlogin.micro.task01microregisterlogin.TweetAPI.TweetRest;

import com.registerlogin.micro.task01microregisterlogin.domain.Users;
import com.registerlogin.micro.task01microregisterlogin.domain.logindata;
import com.registerlogin.micro.task01microregisterlogin.service.RegisterService;


@Controller
@SessionAttributes("name")
@RequestMapping("/api/v1.0/tweets")
public class CommonController {

     
	@Autowired
	private RegisterService rs;
	
	
	private Users u=new Users();
	
	@Autowired
	private TweetRest tr;
	
	
	 @PostMapping("/register")
	  public ResponseEntity<String> registerUser(@Valid @RequestBody Users user) {
	      
		 System.out.println("IN REGISTER");
		 rs.saveUser(user);
	      
	    // return "Register Successfully";
	     //return new ResponseEntity<Users>(HttpStatus.OK);
	     return new ResponseEntity<>("User registered Successfully", HttpStatus.OK);
	    }	
	 

	 @PostMapping("/login")
	  public ResponseEntity<String> login(@RequestBody logindata ld) {
	     
		 System.out.println("LOGIN page............"+ld.getEmail());
		 String a=rs.getUsersByEmail(ld.getEmail()).get(0).getEmail();
		 System.out.println("LOGIN page............"+a);
		 if((ld.getEmail()).equals(a))
		 {	
			 System.out.println("got the user"+ld.getEmail());
			 
			 return new ResponseEntity<>("User found..", HttpStatus.OK);
		 
		 }
		 
		
	 return new ResponseEntity<>("User dosen't exits...please register", HttpStatus.OK);
	 }
 
//	 
//	 @GetMapping("/users/all")
//	  public  ResponseEntity< List<Users>> getAllUsers() {
//	     
//		 System.out.println("get all users");
//		//return rs.getAllUsers() ;	
//      return new ResponseEntity<List<Users>>(rs.getAllUsers(),HttpStatus.OK);
//
//	 }
	 
	 
	 @GetMapping("/users/all")
	  public ResponseEntity<List<ClientUser>> getAllUsers() {
	     
		 System.out.println("Connecting the links");
		//return rs.getAllUsers() ;	
     return new ResponseEntity<List<ClientUser>> (tr.readAlltweets(),HttpStatus.ACCEPTED);

	 }
	 
	 
	 
	 
	 
	
	 @GetMapping("/users/{firstname}")
	 public List<ClientUser> getUserByname(@PathVariable String firstname)
	 {
		 System.out.println("finding the user by name");
		// return tr.findByFirstName();
		 return null;
	 }
	 
}  
   
