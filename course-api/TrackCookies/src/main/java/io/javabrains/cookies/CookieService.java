package io.javabrains.cookies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class CookieService {
	@Autowired
	public CookieRepository cookieRepository;
	public List<Cookie> getAllCookies(){
		List<Cookie> cookies=new ArrayList<>();
		Cookie cookie=new Cookie("B","C","A","D","e",5,false,false,false,false,5);
		cookieRepository.findAll().forEach(cookies::add);
		cookies.add(cookie);
		return cookies;
	}
	
	
	public Cookie getCookie(String id) {
		return cookieRepository.findById(id).get();
	}
	public void addCookie(Cookie cookie) {
		cookieRepository.save(cookie);
		
	}
	public void updateCookie(String id, Cookie cookie) {
		cookieRepository.save(cookie);
	}
	public void deleteCookie(String id) {
		cookieRepository.deleteById(id);
		
	}
}
