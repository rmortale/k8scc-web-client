package ch.dulce.k8sccwebclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "hello")
@RestController()
public class MyController {

  @Value("${app.greeting}")
  private String greeting;

  @Value("${app.prefix}")
  private String prefix;

  @GetMapping()
  public ResponseEntity<?> greet() {
    return ResponseEntity.ok(prefix + greeting);
  }
}
