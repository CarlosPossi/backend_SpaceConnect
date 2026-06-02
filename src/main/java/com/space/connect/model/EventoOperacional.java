package com.space.connect.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "eventosoperacionais")

public class EventoOperacional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String descricao;
    private String dataHora;
    private String severidade;
    @ManyToOne
    @JoinColumn(name = "sistemamonitorado_id")
    private SistemaMonitorado sistemaMonitorado;

    public EventoOperacional() {}

    public EventoOperacional(String descricao, String dataHora, String severidade, SistemaMonitorado sistemaMonitorado) {
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.severidade = severidade;
        this.sistemaMonitorado = sistemaMonitorado;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getSeveridade() { return severidade; }
    public void setSeveridade(String severidade) { this.severidade = severidade; }
    public String getDataHora() { return dataHora; }
    public void setDataHora(String dataHora) { this.dataHora = dataHora; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public SistemaMonitorado getSistemaMonitorado() { return sistemaMonitorado; }
    public void setSistemaMonitorado(SistemaMonitorado sistemaMonitorado) { this.sistemaMonitorado = sistemaMonitorado; }
}
