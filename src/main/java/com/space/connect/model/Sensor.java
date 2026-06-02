package com.space.connect.model;
import jakarta.persistence.*;

@Entity
@Table(name = "sensores")

public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private String tipo;
    private String status;
    private Double valorAtual;
    private String unidade;

    public Sensor() {}

    public Sensor(String nome, String tipo, String status, Double valorAtual, String unidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
        this.valorAtual = valorAtual;
        this.unidade = unidade;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Double getValorAtual() { return valorAtual; }
    public void setValorAtual(Double valorAtual) { this.valorAtual = valorAtual; }
    public String getUnidade() { return unidade; }
    public void setUnidade(String unidade) { this.unidade = unidade; }
}
