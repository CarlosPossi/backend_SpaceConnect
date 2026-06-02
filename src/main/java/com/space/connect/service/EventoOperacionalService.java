package com.space.connect.service;
import com.space.connect.model.EventoOperacional;
import com.space.connect.repository.EventoOperacionalRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class EventoOperacionalService {
    private final EventoOperacionalRepository repository;

    public EventoOperacionalService(EventoOperacionalRepository repository) {
        this.repository = repository;
    }

    public List<EventoOperacional> listar() {
        return repository.findAll();
    }

    public EventoOperacional buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento Operacional não encontrado"));
    }

    public EventoOperacional salvar(EventoOperacional eventoOperacional) {
        return repository.save(eventoOperacional);
    }

    public EventoOperacional atualizar(Long id, EventoOperacional eventoOperacionalAtualizado) {
        EventoOperacional eventoOperacionalExistente = buscarPorId(id);
        eventoOperacionalExistente.setSistemaMonitorado(eventoOperacionalAtualizado.getSistemaMonitorado());
        eventoOperacionalExistente.setDataHora(eventoOperacionalAtualizado.getDataHora());
        eventoOperacionalExistente.setDescricao(eventoOperacionalAtualizado.getDescricao());
        eventoOperacionalExistente.setSeveridade(eventoOperacionalAtualizado.getSeveridade());
        return repository.save(eventoOperacionalExistente);
    }

    public void deletar(Long id) {
        EventoOperacional eventoOperacional = buscarPorId(id);
        repository.delete(eventoOperacional);
    }
}
