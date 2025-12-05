package projeto.redes.socket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // Habilita um broker de mensagens simples em memória para os prefixos "/topic"
        config.enableSimpleBroker("/topic");
        // Define prefixos de destino específicos da aplicação
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Define prefixos de destino específicos da aplicação
        registry.addEndpoint("/chat");

        // Habilita o fallback SockJS para o endpoint "/chat"
        registry.addEndpoint("/chat").withSockJS();
    }
}

