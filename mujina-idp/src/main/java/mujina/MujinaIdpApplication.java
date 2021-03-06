package mujina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.MetricFilterAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.TraceWebFilterAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
  TraceWebFilterAutoConfiguration.class,
  MetricFilterAutoConfiguration.class
})
public class MujinaIdpApplication {

  public static void main(String[] args) {
    SpringApplication.run(MujinaIdpApplication.class, args);
  }

}
