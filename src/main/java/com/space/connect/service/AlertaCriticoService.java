package com.space.connect.service;
import com.space.connect.model.AlertaCritico;
import com.space.connect.repository.AlertaCriticoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class AlertaCriticoService {
    private final AlertaCriticoRepository repository;

    public AlertaCriticoService(AlertaCriticoRepository repository) {
        this.repository = repository;
    }

    public List<AlertaCritico> listar() {
        return repository.findAll();
    }

    public AlertaCritico buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alerta Crítico não encontrado"));
    }

    public AlertaCritico salvar(AlertaCritico alertaCritico) {
        return repository.save(alertaCritico);
    }

    public AlertaCritico atualizar(Long id, AlertaCritico alertaCriticoAtualizado) {
        AlertaCritico alertaCriticoExistente = buscarPorId(id);
        alertaCriticoExistente.setMensagem(alertaCriticoAtualizado.getMensagem());
        alertaCriticoExistente.setNivel(alertaCriticoAtualizado.getNivel());
        alertaCriticoExistente.setDataHora(alertaCriticoAtualizado.getDataHora());
        alertaCriticoExistente.setAtivo(alertaCriticoAtualizado.getAtivo());
        return repository.save(alertaCriticoExistente);
    }

    public void deletar(Long id) {
        AlertaCritico alertaCritico = buscarPorId(id);
        repository.delete(alertaCritico);
    }
}
