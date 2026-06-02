package com.space.connect.service;
import com.space.connect.model.ModuloComputacional;
import com.space.connect.repository.ModuloComputacionalRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class ModuloComputacionalService {
    private final ModuloComputacionalRepository repository;

    public ModuloComputacionalService(ModuloComputacionalRepository repository) {
        this.repository = repository;
    }

    public List<ModuloComputacional> listar() {
        return repository.findAll();
    }

    public ModuloComputacional buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Módulo Computacional não encontrado"));
    }

    public ModuloComputacional salvar(ModuloComputacional moduloComputacional) {
        return repository.save(moduloComputacional);
    }

    public ModuloComputacional atualizar(Long id, ModuloComputacional moduloComputacionalAtualizado) {
        ModuloComputacional moduloComputacionalExistente = buscarPorId(id);
        moduloComputacionalExistente.setNome(moduloComputacionalAtualizado.getNome());
        moduloComputacionalExistente.setVersao(moduloComputacionalAtualizado.getVersao());
        moduloComputacionalExistente.setStatus(moduloComputacionalAtualizado.getStatus());
        moduloComputacionalExistente.setSistemaMonitorado(moduloComputacionalAtualizado.getSistemaMonitorado());
        return repository.save(moduloComputacionalExistente);
    }

    public void deletar(Long id) {
        ModuloComputacional moduloComputacional = buscarPorId(id);
        repository.delete(moduloComputacional);
    }
}
