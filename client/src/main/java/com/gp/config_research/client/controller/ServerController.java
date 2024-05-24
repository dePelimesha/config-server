package com.gp.config_research.client.controller;

import com.gp.config_research.client.config.PropertyClass;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/old")
@RequiredArgsConstructor
public class ServerController {

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
