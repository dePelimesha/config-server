
package com.gp.config_research.client.controller;

import com.gp.config_research.client.config.PropertyClass;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(value = "/refreshed")
@RequiredArgsConstructor
public class RefreshedController {

  private final PropertyClass propertyClass;

  @Value("${app.word}")
  public String word;

  @GetMapping("/")
  public String getProperty() {
    return word;
  }

  @GetMapping("/property-class")
  public String getPropertyFromClass() {
    return propertyClass.getWord();
  }
}
