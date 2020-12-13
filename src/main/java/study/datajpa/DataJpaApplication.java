package study.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;
import java.util.UUID;

@EnableJpaAuditing
@SpringBootApplication
public class DataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataJpaApplication.class, args);
    }

    @Bean
    public AuditorAware<String> auditorProvider(){
        //보통 spring security 에서 아이디를 가져와서 넘겨준다.
        // 동작방식
        // 등록되거나 수정될 떄 마다, 이 method 를 호출해서 결과물을 가져간다.
        return () -> Optional.of(UUID.randomUUID().toString());
    }
}
