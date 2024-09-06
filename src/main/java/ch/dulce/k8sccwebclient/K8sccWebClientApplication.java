package ch.dulce.k8sccwebclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class K8sccWebClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sccWebClientApplication.class, args);
    }

}
