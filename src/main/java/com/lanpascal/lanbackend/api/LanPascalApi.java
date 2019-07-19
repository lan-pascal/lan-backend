package com.lanpascal.lanbackend.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;

import com.lanpascal.lanbackend.model.User;
import com.lanpascal.lanbackend.repository.UserRepository;

@Controller
@EnableAutoConfiguration
public class LanPascalApi extends HttpServlet {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/findAll")
	@ResponseBody
	String findAll() {
		List<User> userList = userRepository.findAll();
		StringBuilder userStrings = new StringBuilder();
		for (User user : userList) {
			userStrings.append(user.toString()).append("\n");
		}
		return userStrings.toString();
	}

}
