package com.prochile.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class HolaMundoController {

    @GetMapping("/api/salud")
    public Map<String, String> healthCheck() {
        return Map.of(
            "estado", "OK",
            "servicio", "Comunidad ProChile",
            "fecha", LocalDateTime.now().toString()
        );
    }
}