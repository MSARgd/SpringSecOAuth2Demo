package rgd.msa.SpringSecOAuth2Demo.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Getter @Setter @Validated
@Configuration
@ConfigurationProperties(prefix = "jwt.auth.converter.principal-attribute")
public class JwtConverterProperties {
    private String resourceId;
    private String principalAttribute;
}
/**
 * The JwtConverterPropertiesclass is a configuration class for JWT authentication conversion.
 * It holds properties like “resourceId” (Keycloak resource identifier)
 * and “principalAttribute” (preferred principal attribute).
 * These properties play a crucial role in decoding and processing JWTs
 * within the Keycloak integration.
 */