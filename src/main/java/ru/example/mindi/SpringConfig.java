package ru.example.mindi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.example.mindi")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public Music musicBean() {
        return new ClassicalMusic();
    }

    @Bean
    MusicPlayer musicPlayer() {
        return new MusicPlayer(musicBean());
    }
}

