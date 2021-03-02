package com.tts.TechTalentTwitter.repository;

import com.tts.TechTalentTwitter.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  // User repo to set the instructions to get the user by user name.
  User findByUsername(String username);

}
