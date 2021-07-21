package com.TP.chatbot;

import com.github.messenger4j.Messenger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ChatBotApplication {
    @Bean
    public Messenger messenger(@Value("EABYiXO6jfBABAPDW2ZBoe7ZBnG2J7R8hqVRySsMShRzedkN7In5dXMobbhM6rKdZCIVZCZBZCQtocuYqrVA0J5MAqR3dGZBzPIAfkbpydSCUc4snEJfTbHkKJQfAmLRZAP9CTRkrZBZBseXxmoQ0ynTYlgjDi5KzPmHMjmNBbvFK5Ax8TjTavz0NYZBj4icLBo9uXMZD")  String PAGE_ACCESS_TOKEN,
                               @Value("bee261486564523cf86207e0fa06502a")  final String APPSECRET,
                               @Value("$123456789") final String VERIFY_TOKEN) {
        return Messenger.create(PAGE_ACCESS_TOKEN, APPSECRET, VERIFY_TOKEN);
    }
}