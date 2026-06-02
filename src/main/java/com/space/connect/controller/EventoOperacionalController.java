package com.space.connect.controller;
import com.space.connect.model.EventoOperacional;
import com.space.connect.service.EventoOperacionalService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/eventosoperacionais")
@CrossOrigin

public class EventoOperacionalController {
    private final EventoOperacionalService service;

    public EventoOperacionalController(EventoOperacionalService service) {
        this.service = service;
    }

    @GetMapping
    public List<EventoOperacional> listar() {
        return service.listar();
    }

    @GetMapping("{id}")
    public EventoOperacional buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public EventoOperacional salvar(@RequestBody EventoOperacional eventoOperacional) {
        return service.salvar(eventoOperacional);
    }

    @PutMapping("{id}")
    public EventoOperacional atualizar(@PathVariable Long id, @RequestBody EventoOperacional eventoOperacional) {
        return service.atualizar(id, eventoOperacional);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
