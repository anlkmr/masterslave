package com.emagia.master.config;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfiguration {

   
	 @Bean
	    public OpenAPI openAPI() {
	        return new OpenAPI()
	        		//.addSecurityItem(new SecurityRequirement().addList("Bearer Authentication"))
	            //.components(new Components().addSecuritySchemes("Bearer Authentication", createAPIKeyScheme()))
	          // .addServersItem(new Server().url("https://gateway.emagia.com"))
	            .info(new Info().title("Gateway Emagia")
	               // .description("Some custom description of API.")
	                .version("1.0"));
	                //.contact(new Contact().name("Sallo Szrajbman").email( "www.baeldung.com").url("salloszraj@gmail.com"))
	               // .license(new License().name("License of API")));
	                  //  .url("API license URL")));
	    }

}