package com.rishabh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
     @Bean(name = "Koko")
     Parrot p1(){
         var p = new Parrot();
         p.setName("Koko");
         return p;
     }

    @Bean
    Parrot p2(){
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }
    @Bean
    Parrot p3(){
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }
}
