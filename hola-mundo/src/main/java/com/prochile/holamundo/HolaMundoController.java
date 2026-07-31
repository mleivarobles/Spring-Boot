package com.prochile.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class HolaMundoController {

    @GetMapping("/")
    public Map<String, String> holaMundo() {
        return Map.of(
            "mensaje", "¡Hola Mundo desde ProChile!",
            "ambiente", "Test",
            "fecha", LocalDateTime.now().toString()
        );
    }

    @GetMapping("/salud")
    public Map<String, String> healthCheck() {
        return Map.of(
            "estado", "OK",
            "servicio", "Comunidad ProChile"
        );
    }
}
