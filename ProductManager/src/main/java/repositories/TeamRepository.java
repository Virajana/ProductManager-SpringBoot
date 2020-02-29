package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domains.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
