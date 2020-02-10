package pl.pawel112.webapp.controllers;

import pl.pawel112.webapp.User;
import pl.pawel112.webapp.UserDAO;
import pl.pawel112.webapp.dataBase.DBLogin;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@Autowired
	UserDAO dao;
	
	@RequestMapping("/list")
	public String listUser(Model model) {
		model.addAttribute("user", dao.getUser());
		return "list";
	}
	
	@RequestMapping("/add")
	public String addUser(HttpServletRequest request,  @ModelAttribute("DBLogin") @Valid DBLogin dbLogin, BindingResult result) {
		if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
			User user = new User();
			user.setLogin(dbLogin.getLogin());
			user.setEmail(dbLogin.getEmail());
			user.setPassword(dbLogin.getPassword());
			user.setGroup(dbLogin.getGroup());
			user.setAccount_blocked(dbLogin.isAccount_active());
			dao.addUser(user);
			return "redirect:/list";
		}
		return "add";
	}
	
	@RequestMapping("/user-{id}")
	public String getUser(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("user", dao.getUserbyId(id));
		return "user";
	}
	
}
