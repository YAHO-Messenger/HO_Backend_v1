package com.yaho.ho_backend_v1.entity.User;

import com.yaho.ho_backend_v1.entity.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
