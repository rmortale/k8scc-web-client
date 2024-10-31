package ch.dulce.k8sccwebclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyController {

  @Value("${app.greeting}")
  private String greeting;

  @Value("${app.prefix}")
  private String prefix;

  @GetMapping("env")
  public ResponseEntity<?> greet() {
    return ResponseEntity.ok(prefix + greeting);
  }
}
