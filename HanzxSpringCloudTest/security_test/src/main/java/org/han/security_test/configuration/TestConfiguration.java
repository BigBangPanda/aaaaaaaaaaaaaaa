package org.han.security_test.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableOAuth2Sso
@EnableAutoConfiguration
public class TestConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void match(RequestMatchers matchers) {
        matchers.antMatchers("/ui/**")
                .authorizeRequests().anyRequest().authenticated();
    }

}
