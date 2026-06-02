package com.space.connect.service;
import com.space.connect.model.Sensor;
import com.space.connect.repository.SensorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class SensorService {
    private final SensorRepository repository;

    public SensorService(SensorRepository repository) {
        this.repository = repository;
    }

    public List<Sensor> listar() {
        return repository.findAll();
    }

    public Sensor buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sensor não encontrado"));
    }

    public Sensor salvar(Sensor sensor) {
        return repository.save(sensor);
    }

    public Sensor atualizar(Long id, Sensor sensorAtualizado) {
        Sensor sensorExistente = buscarPorId(id);
        sensorExistente.setNome(sensorAtualizado.getNome());
        sensorExistente.setStatus(sensorAtualizado.getStatus());
        sensorExistente.setTipo(sensorAtualizado.getTipo());
        sensorExistente.setValorAtual(sensorAtualizado.getValorAtual());
        sensorExistente.setUnidade(sensorAtualizado.getUnidade());

        return repository.save(sensorExistente);
    }

    public void deletar(Long id) {
        Sensor sensor = buscarPorId(id);
        repository.delete(sensor);
    }
}
