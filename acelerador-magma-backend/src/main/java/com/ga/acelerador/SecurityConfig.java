package com.ga.acelerador;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.ldap.authentication.ad.ActiveDirectoryLdapAuthenticationProvider;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.ga.acelerador.Constants.Parameter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	private static final String LOGIN_URL = Parameter.API_URL_SUFFIX  + "/login";
	   
    private static final String[] AUTH_WHITELIST = {
            LOGIN_URL
    };

	@Override
	public void configure(AuthenticationManagerBuilder builder) throws Exception {
		builder.authenticationProvider(getProvider()).userDetailsService(userDetailsService());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and()
        // make sure we use stateless session; session won't be used to
        // store user's state.
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
        // We don't need CSRF for this example
        .csrf().disable()
        // dont authenticate this particular request
        .authorizeRequests().antMatchers(AUTH_WHITELIST).permitAll()
        // all other requests need to be authenticated
        .anyRequest().authenticated().and()
        .addFilter(new JWTAuthenticationFilter(authenticationManager()))
        .addFilter(new JWTAuthorizationFilter(authenticationManager()))
        .exceptionHandling().authenticationEntryPoint(new authenticationEntryPoint());
	}
	
	@Bean
	public AuthenticationProvider getProvider() {
		
		ActiveDirectoryLdapAuthenticationProvider provider = new ActiveDirectoryLdapAuthenticationProvider("grupoassa.com","ldap://ldap.grupoassa.com:389","DC=grupoassa");
		provider.setConvertSubErrorCodesToExceptions(true);
		provider.setUseAuthenticationRequestCredentials(true);
		provider.setSearchFilter("(&(mail={0})(objectclass=user))");
		return provider;
		
	}
	
	@Bean
	public BCryptPasswordEncoder getPassword() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
       
        configuration.setAllowedOrigins(Arrays.asList("*"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS", "DELETE", "PUT", "PATCH"));
        configuration.setAllowedHeaders(Arrays.asList("X-Requested-With", "Origin", "Content-Type", "Accept", "Authorization", "Set-Cookie", "Cookies","nonce"));
        configuration.setExposedHeaders(Arrays.asList("Authorization", "Set-Cookie", "Cookies", "nonce"));
        configuration.setAllowCredentials(true);
       
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
       
        return source;
    }
	
	@Bean
	public AuthenticationManager getAuthManager() {
		return new ProviderManager(Arrays.asList(getProvider()));
	}
	
	

}
