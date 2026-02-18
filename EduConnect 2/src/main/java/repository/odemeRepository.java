package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.*;

@Repository
public interface odemeRepository extends JpaRepository<odeme, Long> {

}
