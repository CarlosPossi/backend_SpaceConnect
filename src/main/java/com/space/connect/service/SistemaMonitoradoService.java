package com.space.connect.service;
import com.space.connect.model.SistemaMonitorado;
import com.space.connect.repository.SistemaMonitoradoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class SistemaMonitoradoService {
    private final SistemaMonitoradoRepository repository;

    public SistemaMonitoradoService(SistemaMonitoradoRepository repository) {
        this.repository = repository;
    }

    public  List<SistemaMonitorado> listar() {
        return repository.findAll();
    }

    public SistemaMonitorado buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sistema Monitorado não encontrado"));
    }

    public SistemaMonitorado salvar(SistemaMonitorado sistemaMonitorado) {
        return repository.save(sistemaMonitorado);
    }

    public SistemaMonitorado atualizar(Long id, SistemaMonitorado sistemaMonitoradoAtualizado) {
        SistemaMonitorado sistemaMonitoradoExistente = buscarPorId(id);
        sistemaMonitoradoExistente.setDescricao(sistemaMonitoradoAtualizado.getDescricao());
        sistemaMonitoradoExistente.setNome(sistemaMonitoradoAtualizado.getNome());
        sistemaMonitoradoExistente.setStatus(sistemaMonitoradoAtualizado.getStatus());
        sistemaMonitoradoExistente.setSensor(sistemaMonitoradoAtualizado.getSensor());
        return repository.save(sistemaMonitoradoExistente);
    }

    public void deletar(Long id) {
        SistemaMonitorado sistemaMonitorado = buscarPorId(id);
        repository.delete(sistemaMonitorado);
    }
}
