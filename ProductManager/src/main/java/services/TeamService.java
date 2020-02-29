package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domains.Team;
import repositories.TeamRepository;

@Service
@Transactional
public class TeamService {

	@Autowired
	private TeamRepository repo;
	
	public List<Team> listAll() {
		return repo.findAll();
	}
	
	public void save(Team team) {
		repo.save(team);
	}
	
}
