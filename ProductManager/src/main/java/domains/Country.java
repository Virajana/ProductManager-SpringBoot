package domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	private Long cid;
	private String cname;
	private String shortname;
	
	protected Country() {
	}

	protected Country(Long cid, String cname, String shortname) {
		this.cid = cid;
		this.cname = cname;
		this.shortname = shortname;
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return cid;
	}

	public void setId(Long cid) {
		this.cid = cid;
	}

	public String getName() {
		return cname;
	}

	public void setName(String name) {
		this.cname = name;
	}

	public String getCountry() {
		return shortname;
	}

	public void setCountry(String shortname) {
		this.shortname = shortname;
	}

}
