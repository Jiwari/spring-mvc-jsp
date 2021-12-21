package com.github.jiwari;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Map;

@Configuration
public class AppConfig {

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("classpath:/message");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public Map<String, String> countriesOptions() {
        return Map.of(
                "BR", "Brazil",
                "CA", "Canada",
                "US", "USA",
                "PL", "Poland",
                "GE", "Germany"
        );
    }

    @Bean
    public Map<String, String> programmingLanguagesOptions() {
        return Map.of(
                "Java", "Java",
                "C#", "C#",
                "Javascript", "Javascript",
                "Python", "Python"
        );
    }

    @Bean
    public Map<String, String> operationalSystemsOptions() {
        return Map.of(
                "Linux", "Linux",
                "Windows", "Windows",
                "Mac", "Mac"
        );
    }
}
