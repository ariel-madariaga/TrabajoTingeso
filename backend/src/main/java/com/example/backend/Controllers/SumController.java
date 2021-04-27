package com.example.backend.Controllers;

import com.example.backend.Models.Sum;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sum")
@CrossOrigin(origins = "*")
public class SumController {
    private final Gson gson;

    SumController() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    @PostMapping({"","/"})
    ResponseEntity<String> test(@RequestBody String request) {
        Sum sum = gson.fromJson(request, Sum.class);
        int res = sum.calculateSum(sum.getOperandA(), sum.getOperandB());
        sum.setResult(res);
        return new ResponseEntity<>(gson.toJson(sum), HttpStatus.OK);
    }
}