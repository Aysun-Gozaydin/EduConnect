package repository;

import com.entities.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ogrenciRepository extends JpaRepository<ogrenci, Long>{

}
