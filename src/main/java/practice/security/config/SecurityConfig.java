package practice.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig{

   @Autowired
   private CustomAuthenticationProvider authenticationProvider;

   protected void configure(AuthenticationManagerBuilder auth){
       auth.authenticationProvider(authenticationProvider);
   }

   protected void configure(HttpSecurity http) throws Exception{
       http.httpBasic();
       http.authorizeRequests().anyRequest().authenticated();
   }
}
