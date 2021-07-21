package com.TP.chatbot;

import com.github.messenger4j.Messenger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ChatBotApplication {
    @Bean
    public Messenger messenger(@Value("EABYiXO6jfBABAHE9am0Blv2mhuRWvHlDc6OEZAnBuf8PkognMTIwnmcKxmuq6uF3mqVav1H0ewD6ClGLbwGam4ga9A5VRUZAQY04beIBCi6ZBSvtdUQLTeE3CZAAEe4imznc2M9zAVZC36vLRAmTteeN4ouf0NczwQ0uQ9uHnZB4m4iarHxBMdmy21SihDHJkZD")  String PAGE_ACCESS_TOKEN,
                               @Value("bee261486564523cf86207e0fa06502a")  final String APPSECRET,
                               @Value("$123456789") final String VERIFY_TOKEN) {
        return Messenger.create(PAGE_ACCESS_TOKEN, APPSECRET, VERIFY_TOKEN);
    }
}