package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.UserRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRefreshTokenRepository extends JpaRepository<UserRefreshToken,Long> {

    Optional<UserRefreshToken> findByUserId(Long userId);

}
