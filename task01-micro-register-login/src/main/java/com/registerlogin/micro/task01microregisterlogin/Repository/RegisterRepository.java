package com.registerlogin.micro.task01microregisterlogin.Repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.registerlogin.micro.task01microregisterlogin.domain.Users;

@Repository
public interface RegisterRepository  extends JpaRepository<Users,Integer> {


	public List<Users> findByEmail(String email);
	
	
}
