package com.lanpascal.lanbackend.api;

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
	UserRepository repository;

    @RequestMapping("/")
    @ResponseBody
    String getAllNames() {


		final Iterable<User> users = repository.findAll();
		String allo = "";
		for (User user : users) {
			allo += user.getName().toString() + "\n";
		}
		return allo;
    }

}
