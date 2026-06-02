package com.space.connect.model;
import jakarta.persistence.*;

@Entity
@Table(name = "moduloscomputacionais")

public class ModuloComputacional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private String versao;
    private String status;
    @ManyToOne
    @JoinColumn(name = "sistemamonitorado_id")
    private SistemaMonitorado sistemaMonitorado;

    public ModuloComputacional() {}

    public ModuloComputacional(String nome, String versao, String status , SistemaMonitorado sistemaMonitorado) {
        this.nome = nome;
        this.versao = versao;
        this.status = status;
        this.sistemaMonitorado = sistemaMonitorado;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getVersao() { return versao; }
    public void setVersao(String versao) { this.versao = versao; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public SistemaMonitorado getSistemaMonitorado() { return sistemaMonitorado; }
    public void setSistemaMonitorado(SistemaMonitorado sistemaMonitorado) { this.sistemaMonitorado = sistemaMonitorado; }
}
