//package practice.security.config;
//
//import jakarta.servlet.FilterChain;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class ProjectConfig {
//
////    @Bean
////    public UserDetailsService userDetailsService(){
////        var userDetailsService = new InMemoryUserDetailsManager();
////
////        var user = User.withUsername("son")
////                .password("12345")
////                .authorities("read")
////                .build();
////        userDetailsService.createUser(user);
////
////        return userDetailsService;
////    }
////
////    @Bean
////    public PasswordEncoder passwordEncoder(){
////        return NoOpPasswordEncoder.getInstance();
////    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        http.authorizeHttpRequests((authorizeRequests) ->
//                authorizeRequests
//                .anyRequest().permitAll());
//
//        return http.build();
//    }
//
//
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//         var userDetailsService = new InMemoryUserDetailsManager();
//
//         var user = User.withUsername("son")
//                 .password("12345")
//                 .authorities("read")
//                 .build();
//
//         userDetailsService.createUser(user);
//
//         auth.userDetailsService(userDetailsService)
//                 .passwordEncoder(NoOpPasswordEncoder.getInstance());
//    }
//}
