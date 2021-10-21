package com.yaho.ho_backend_v1.service.RefreshToken;


import com.yaho.ho_backend_v1.refreshtoken.RefreshToken;
import com.yaho.ho_backend_v1.refreshtoken.RefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RefreshTokenServiceImpl implements RefreshTokenService{

    private final RefreshTokenRepository refreshTokenRepository;

    @Override
    public void save(RefreshToken token) {
        refreshTokenRepository.save(token);
    }

    @Override
    public Optional<RefreshToken> findRefreshToken(String token) {
        return refreshTokenRepository.findByRefreshToken(token);
    }

}
