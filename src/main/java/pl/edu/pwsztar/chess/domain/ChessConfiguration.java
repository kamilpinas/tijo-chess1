package pl.edu.pwsztar.chess.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ChessConfiguration {
    @Bean
    ChessFacade chessFacade(){
        return  new ChessFacade();
    }
}
