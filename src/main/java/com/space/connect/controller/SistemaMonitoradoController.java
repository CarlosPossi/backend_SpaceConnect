package com.space.connect.controller;
import com.space.connect.model.SistemaMonitorado;
import com.space.connect.service.SistemaMonitoradoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/sistemasmonitorados")
@CrossOrigin

public class SistemaMonitoradoController {
    private final SistemaMonitoradoService service;

    public SistemaMonitoradoController(SistemaMonitoradoService service) {
        this.service = service;
    }

    @GetMapping
    public List<SistemaMonitorado> listar() {
        return service.listar();
    }

    @GetMapping("{id}")
    public SistemaMonitorado buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public SistemaMonitorado salvar(@RequestBody SistemaMonitorado sistemaMonitorado) {
        return service.salvar(sistemaMonitorado);
    }

    @PutMapping("{id}")
    public SistemaMonitorado atualizar(@PathVariable Long id, @RequestBody SistemaMonitorado sistemaMonitorado) {
        return service.atualizar(id, sistemaMonitorado);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
