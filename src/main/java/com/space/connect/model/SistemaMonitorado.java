package com.space.connect.model;
import jakarta.persistence.*;

@Entity
@Table(name = "sistemasmonitorados")

public class SistemaMonitorado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private String status;
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;

    public SistemaMonitorado() {}

    public SistemaMonitorado(String nome, String status, String descricao, Sensor sensor) {
        this.nome = nome;
        this.status = status;
        this.descricao = descricao;
        this.sensor = sensor;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Sensor getSensor() { return sensor; }
    public void setSensor(Sensor sensor) { this.sensor = sensor; }
}
