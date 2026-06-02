package com.space.connect.controller;
import com.space.connect.model.AlertaCritico;
import com.space.connect.service.AlertaCriticoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alertascriticos")
@CrossOrigin

public class AlertaCriticoController {
    private final AlertaCriticoService service;

    public AlertaCriticoController(AlertaCriticoService service) {
        this.service =service;
    }

    @GetMapping
    public List<AlertaCritico> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public AlertaCritico buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public AlertaCritico salvar(@RequestBody AlertaCritico alertaCritico) {
        return service.salvar(alertaCritico);
    }

    @PutMapping("/{id}")
    public AlertaCritico atualizar(@PathVariable Long id, @RequestBody AlertaCritico alertaCritico) {
        return service.atualizar(id, alertaCritico);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
