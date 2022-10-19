package com.example.dynamicrole2.service;

import com.example.dynamicrole2.model.RefreshToken;

import java.util.Optional;

public interface RefreshTokenService {
    public Optional<RefreshToken> findByToken(String token);

    public RefreshToken createRefreshToken(Long userId);

    public RefreshToken verifyExpiration(RefreshToken token);

    public int deleteByUserId(Long userId);

}
