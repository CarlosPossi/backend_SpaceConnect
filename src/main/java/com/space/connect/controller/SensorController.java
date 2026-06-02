package com.space.connect.controller;
import com.space.connect.model.Sensor;
import com.space.connect.service.SensorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/sensores")
@CrossOrigin

public class SensorController {
    private final SensorService service;

    public SensorController(SensorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Sensor> listar() {
        return service.listar();
    }

    @GetMapping("{id}")
    public Sensor buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Sensor salvar(@RequestBody Sensor sensor) {
        return service.salvar(sensor);
    }

    @PutMapping("{id}")
    public Sensor atualizar(@PathVariable Long id, @RequestBody Sensor sensor) {
        return service.atualizar(id, sensor);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
