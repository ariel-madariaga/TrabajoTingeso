package com.example.backend.Controllers;

import com.example.backend.Models.Calculadora;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
@CrossOrigin(origins = "*")
public class CalculadoraController {
    private final Gson gson;
    CalculadoraController () {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }
    @PostMapping("/suma")
    ResponseEntity<String> suma(@RequestBody String request) {
        Calculadora miCalculadora = gson.fromJson(request, Calculadora.class);
        int res = miCalculadora.Sumar(miCalculadora.getOperandA(), miCalculadora.getOperandB());
        miCalculadora.setResult(res);
        return new ResponseEntity<>(gson.toJson(miCalculadora), HttpStatus.OK);
    }

    @PostMapping("/resta")
    ResponseEntity<String> resta(@RequestBody String request) {
        Calculadora miCalculadora = gson.fromJson(request, Calculadora.class);
        int res = miCalculadora.Restar(miCalculadora.getOperandA(), miCalculadora.getOperandB());
        miCalculadora.setResult(res);
        return new ResponseEntity<>(gson.toJson(miCalculadora), HttpStatus.OK);
    }
}
