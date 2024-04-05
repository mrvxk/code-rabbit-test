package com.mrvxk.coderabbittest;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Service {

    @Scheduled(fixedRate = 5000)
    public void printSomething() {
        String printablecontent = "Hello";
        if (Math.random() > 0.5) {
            printablecontent = printablecontent.concat(" rabbit!");
        }

        if (printablecontent.contains("rabbit")) {
            System.out.println(printablecontent);
        }
    }
}
