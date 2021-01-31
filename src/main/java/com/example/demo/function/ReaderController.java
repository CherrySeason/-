package com.example.demo.function;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Entity.Book;
import com.example.demo.Entity.User;
import com.example.demo.Entity.View;
import com.example.demo.Service.BookService;
import com.example.demo.Service.ClassService;
import com.example.demo.Service.UserService;
import com.example.demo.Service.ViewService;

@Controller
public class ReaderController {

	@Autowired
	UserService userService;
	@Autowired
	BookService bookService;
	@Autowired
	ViewService viewService;
	@Autowired
	ClassService ClassService;
	@RequestMapping(value = "/index2", method = RequestMethod.GET)
	 public String showindex(@CookieValue("userid")String user,Map<String, Object> paramMap) {
		//从数据库读取用户信息 
//		String usernum="0000001";
//		String username="张三";
		User sUser=userService.findByUserid(user);
		paramMap.put("user", sUser.getUserid());
		paramMap.put("username", sUser.getUsername());
		return "index2";
	 }
	
	@RequestMapping(value = "/findbook",method = RequestMethod.GET)
	 public String showBook(@CookieValue("userid")String user,Map<String, Object> paramMap) {
		User sUser=userService.findByUserid(user);
		paramMap.put("user", sUser.getUserid());
		paramMap.put("username", sUser.getUsername());
		return "findbook";
	}
	
	@RequestMapping(value = "/findbook",method = RequestMethod.POST)
	 public String findBook(Model map,@RequestParam(value = "content") String content) {
		List<Book> list=bookService.findByBooknameLikeOrAuthorLikeOrPublichouseLikeOrIntroductionLikeOrBookidLike( content, content, content, content, content);
		 map.addAttribute("showbooks", list);
		 return "findbook::findbook";
	}
	
	@RequestMapping(value = "/readerinfo",method = RequestMethod.GET)
	 public String showInfo(@CookieValue("userid")String user,Map<String, Object> paramMap) {
		User sUser=userService.findByUserid(user);
		paramMap.put("user", sUser.getUserid());
		paramMap.put("username", sUser.getUsername());
		paramMap.put("userid", sUser.getUserid());
		paramMap.put("name", sUser.getUsername());
		paramMap.put("phone", sUser.getPhone());
		paramMap.put("iscan", sUser.getIscan());
		return "readerinfo";
	}
	
	 @RequestMapping(value = "/updatereaderinfo",method = RequestMethod.PUT)
	 @ResponseBody
	 public String updateReader(@RequestParam(value = "userid")String userid,@RequestParam(value = "username")String username,@RequestParam(value = "phone")String phone) {
		 User s=userService.findByUserid(userid);
		 System.out.println(phone.length());
		 if(phone.length()!=11) {
			 return "";
		 }
		 else {
		     s.setUsername(username);
		     s.setPhone(phone);
		     s=userService.saveAndFlush(s);
		     return "readerinfo";
		 }
	 }
	 
	 @RequestMapping(value = "/readerpass",method = RequestMethod.GET)
	 public String showchangepass(@CookieValue("userid")String user,Map<String, Object> paramMap) {
		 User sUser=userService.findByUserid(user);
		 //System.out.println(user);
		 paramMap.put("userid", sUser.getUserid());
		 paramMap.put("user", sUser.getUserid());
		 paramMap.put("username", sUser.getUsername());
		 
		 return "readerpass";		 
	 }
	 
	 @RequestMapping(value = "/readerpass",method = RequestMethod.PUT)
	 public String updatepass(@RequestParam(value = "userid")String userid,Map<String, Object> paramMap,@RequestParam(value = "oldpass")String oldpass,@RequestParam(value = "newpass")String newpass) {
		 User s=userService.findByUserid(userid);
		 if (oldpass.equals(s.getUpassword())) {
			s.setUpassword(newpass);
			s=userService.saveAndFlush(s);
			System.out.println("ddd");
			return "readerpass";
		}
		 else {
			return "";
		}
		 
	 }
	 
	 @GetMapping("/record")
	 public String showRecord(@CookieValue("userid")String user,Map<String, Object> paramMap,Model map) {
		 User sUser=userService.findByUserid(user);
		 paramMap.put("user", sUser.getUserid());
		 paramMap.put("username", sUser.getUsername());
		 
		 List<View> list=viewService.findByRecordidUsersid(user);
		 //System.out.println(list.get(0).getBookname());
		 map.addAttribute("record", list);
		 return "record";
	 }
}
