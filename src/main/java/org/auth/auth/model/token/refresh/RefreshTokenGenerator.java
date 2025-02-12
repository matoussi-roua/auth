package org.auth.auth.model.token.refresh;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.auth.auth.model.token.TokenGenerator;
import org.auth.auth.model.user.UserEntity;

import java.util.Date;

public class RefreshTokenGenerator implements TokenGenerator {

    @Override
    public String generateToken(UserEntity userEntity) {
        String email = userEntity.getEmail();
        Date currentData = new Date();
        //Date expireDate = new Date(System.currentTimeMillis() + SecurityConstants.ACCESS_JWT_EXPIRATION);

        return "";
//                Jwts.builder()
//                .setSubject(email)
//                .setIssuedAt(currentData)
//                .setExpiration(expireDate)
//                .signWith(JwtTokenProvider.getSignInKey(SecurityConstants.JWT_ACCESS_SECRET), SignatureAlgorithm.HS256)
//                .compact();
    }
}
