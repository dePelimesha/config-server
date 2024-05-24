package com.gp.config_research.client.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("app.properties")
@NoArgsConstructor
public class PropertyClass {

  private String word;
}
