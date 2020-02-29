package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domains.Country;
import repositories.CountryRepository;

@Service
@Transactional
public class CountryService {

	@Autowired
	private CountryRepository repo;
	
	public List<Country> listAll() {
		return repo.findAll();
	}
	
	public void save(Country country) {
		repo.save(country);
	}
	
}
