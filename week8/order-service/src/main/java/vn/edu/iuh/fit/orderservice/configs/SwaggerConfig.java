package vn.edu.iuh.fit.orderservice.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI productOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Order Service API")
                        .description("API documentation for Order Service")
                        .version("1.0.0"))
                .servers(List.of(new Server().url("http://localhost:8083")));
    }

    @Bean
    public GroupedOpenApi productApi() {
        return GroupedOpenApi.builder()
                .group("Order Service")
                .pathsToMatch("/api/v1/products/**") // Đảm bảo path chính xác
                .build();
    }
}
