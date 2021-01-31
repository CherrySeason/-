package com.example.demo.function;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@Controller
public class loginController {
	@Autowired
	UserService userService;
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	 public String showlogin() {
		//System.out.println("123"); 
		return "login";
	 }
	@RequestMapping(value = "/login", method = RequestMethod.PUT)
	@ResponseBody
	 public String updateClient(@RequestParam(value = "id") String id, @RequestParam(value = "password") String password,Map<String, Object> paramMap,HttpServletResponse response) {
		//System.out.println(id);
		//……数据库根据user得到密码
        User user=userService.findByUserid(id);
        String userid=user.getUserid();
        String upassword=user.getUpassword();
        String ID="0";
        Cookie cookie=new Cookie("userid", userid);
	    response.addCookie(cookie);
		if(id.equals(userid) && password.equals(upassword))//登录判断
			
			if (ID.equalsIgnoreCase(user.getId())) {				
				return "/index";
			}
		    else {
				return "/index2";
			}
	    	
		else {
			return "";
		}
	 }
}
