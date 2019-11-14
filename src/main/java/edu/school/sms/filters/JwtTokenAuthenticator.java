package edu.school.sms.filters;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class JwtTokenAuthenticator {

    public UserDetails isValidToken(String jwtToken) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey("chachacha")
                    .parseClaimsJws(jwtToken)
                    .getBody();
            return User.builder()
                    .username(claims.getSubject())
                    .password("balbla")
                    .authorities(new ArrayList<>())
                    .build();
        } catch (JwtException e) {
            return null;
        }
    }
}
