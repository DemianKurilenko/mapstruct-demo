package com.github.mapstructdemo.medium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleWithNested implements CommandLineRunner {

    @Autowired
   private SportCarMapper sportCarMapper;

        @Override
        public void run(String... args) throws Exception {
            SportCar sportCar = new SportCar();
            Engine engine = new Engine();
            engine.setFuelType("Gas");
            engine.setPartsCount(20055);
            sportCar.setEngine(engine).setColor("RED").setFuelCapacity(300L);
            SportCarModel sportCarModel = sportCarMapper.toSportCarModel(sportCar);
            System.out.println(sportCarModel);
        }





    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ExampleWithNested.class);
        app.run(args);
    }
}
