package practice.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class WebAuthorizeConfig {

    protected void configure(HttpSecurity http) throws Exception{

        http.httpBasic();
        http.authorizeRequests().anyRequest().authenticated();

    }
}
