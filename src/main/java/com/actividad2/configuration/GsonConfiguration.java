package com.actividad2.configuration;

import com.actividad2.time.serialization.HoraAdapter;
import com.actividad2.time.serialization.MinutoAdapter;
import com.actividad2.time.serialization.SegundoAdapter;
import com.actividad2.time.domain.Hora;
import com.actividad2.time.domain.Minuto;
import com.actividad2.time.domain.Segundo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GsonConfiguration {

    @Bean
    public Gson gson(){
        return new GsonBuilder()
                .registerTypeAdapter(Hora.class,new HoraAdapter())
                .registerTypeAdapter(Minuto.class,new MinutoAdapter())
                .registerTypeAdapter(Segundo.class,new SegundoAdapter())
                .create();
    }
}
