package zw.co.nseremwe.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                title = "School Administration API",
                description = "This API provides endpoints for managing school operations, including student management, teacher management, class management, and more.",
                version = "1.0",
                contact = @Contact(
                        name = "Ngoni",
                        email = "ngoni@nseremwe.co.zw",
                        url = "https://nseremwe.co.zw"
                ),
                license = @License(
                        name = "MIT License",
                        url = "https://opensource.org/licenses/MIT"
                ),
                termsOfService = "https://nseremwe.co.zw/terms"
        )
)
public class ApiConfig {
}