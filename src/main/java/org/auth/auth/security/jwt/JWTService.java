package org.auth.auth.security.jwt;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Key;
import java.util.Map;
import java.util.function.Function;


public interface JWTService {
    String extractUsername(String token);
    Claims extractAllClaims(String token);
    <T> T extractClaim(String token, Function<Claims , T> claimResolver);
    String generateToken(Map<String, Object> claims, UserDetails userDetails);
    String generateToken(UserDetails userDetails);
    Key getSignInKey(String secretKey);
    Boolean isTokenValid(String token, UserDetails userDetails);
}
