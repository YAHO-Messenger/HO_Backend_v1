package com.yaho.ho_backend_v1.refreshtoken;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, String> {
    Optional<RefreshToken> findById(Long id);
    Optional<RefreshToken> findByRefreshToken(String RefreshToken);
}
