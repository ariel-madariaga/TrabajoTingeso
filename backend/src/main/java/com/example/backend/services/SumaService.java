package com.example.backend.services;
import com.example.backend.model.Suma;
import org.springframework.web.bind.annotation.*;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

@RestController
@RequestMapping("/suma")
@CrossOrigin(origins = "*")
public class SumaService {
    private final Gson gson;

    SumaService(){
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }
    @PostMapping("/suma")
    public Integer Sumar(@RequestBody String request){
        Suma miSuma = gson.fromJson(request, Suma.class);
        Integer result = miSuma.Sumar();
        return result;
    }
}
