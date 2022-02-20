package io.javabrains.cookies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000/")



@RestController
public class CookieController {
	@Autowired
	public CookieService cookieService;
	
	@RequestMapping("/cookies")
	public List<Cookie> getAllCookies() {
		
		return cookieService.getAllCookies();
	}
	@RequestMapping(method=RequestMethod.POST,value="/cookies")
	public void addTopic(@RequestBody Cookie cookie) {
		cookieService.addCookie(cookie);
	}
	
}
