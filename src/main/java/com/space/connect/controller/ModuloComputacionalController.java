package com.space.connect.controller;
import com.space.connect.model.ModuloComputacional;
import com.space.connect.service.ModuloComputacionalService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/moduloscomputacionais")
@CrossOrigin

public class ModuloComputacionalController {
    private final ModuloComputacionalService service;

    public ModuloComputacionalController(ModuloComputacionalService service) {
        this.service = service;
    }

    @GetMapping
    public List<ModuloComputacional>listar() {
        return service.listar();
    }

    @GetMapping("{id}")
    public ModuloComputacional buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public ModuloComputacional salvar(@RequestBody ModuloComputacional moduloComputacional) {
        return service.salvar(moduloComputacional);
    }

    @PutMapping("{id}")
    public ModuloComputacional atualizar(@PathVariable Long id, @RequestBody ModuloComputacional moduloComputacional) {
        return service.atualizar(id, moduloComputacional);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
