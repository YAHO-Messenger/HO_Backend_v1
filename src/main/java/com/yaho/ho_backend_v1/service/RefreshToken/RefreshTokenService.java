package com.yaho.ho_backend_v1.service.RefreshToken;

import com.yaho.ho_backend_v1.refreshtoken.RefreshToken;

import java.util.Optional;

public interface RefreshTokenService {
    void save(RefreshToken token);
    Optional<RefreshToken> findRefreshToken(String token);
}
