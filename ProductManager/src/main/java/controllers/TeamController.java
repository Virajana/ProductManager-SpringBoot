package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domains.Team;
import services.TeamService;

@Controller
public class TeamController {

	@Autowired
	private TeamService service; 
	
	@RequestMapping("/")
	public String viewHomePage() {
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewTeam(Model model) {
		Team team = new Team();
		model.addAttribute("team", team);
		return "add";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveTeam(@ModelAttribute("team") Team team) {
		service.save(team);
		
		return "redirect:/";
	}
	
		
}
