package com.sherlock.spring_security.Service.Filter;

import com.sherlock.spring_security.Service.MyUserDetailsService;
import com.sherlock.spring_security.config.Utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {

    private final JwtUtils jwtUtils;
    private final MyUserDetailsService myUserDetailsService;

    @Autowired
    public JwtFilter(JwtUtils jwtUtils, MyUserDetailsService myUserDetailsService) {
        this.jwtUtils = jwtUtils;
        this.myUserDetailsService = myUserDetailsService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
         String requestTokenHeader = request.getHeader("Authorization");
         String jwtToken = null;
         String userName = null;

         if (requestTokenHeader != null) {
             jwtToken = requestTokenHeader;
             userName = jwtUtils.getUserNameFromToken(jwtToken);
         }

         if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
             UserDetails userDetails = this.myUserDetailsService.loadUserByUsername(userName);

            if (jwtUtils.validateToken(jwtToken, userDetails)) {
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                        userDetails, null, userDetails.getAuthorities()
                );

                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
         }

         filterChain.doFilter(request, response);
    }
}
