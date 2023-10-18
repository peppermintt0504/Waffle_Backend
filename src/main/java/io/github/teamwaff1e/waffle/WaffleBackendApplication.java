package io.github.teamwaff1e.waffle;

import io.github.teamwaff1e.waffle.domain.comment.config.CommentConfig;
import io.github.teamwaff1e.waffle.domain.waffle.config.WaffleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({CommentConfig.class, WaffleConfig.class})
@SpringBootApplication
public class WaffleBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaffleBackendApplication.class, args);
	}

}
