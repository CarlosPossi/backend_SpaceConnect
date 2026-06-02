package com.space.connect.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "alertascriticos")

public class AlertaCritico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String mensagem;
    private String nivel;
    private String dataHora;
    private boolean ativo;

    public AlertaCritico() {}

    public AlertaCritico(String mensagem, String nivel, String dataHora, boolean ativo){
        this.mensagem = mensagem;
        this.nivel = nivel;
        this.dataHora = dataHora;
        this.ativo = ativo;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
    public String getDataHora() { return dataHora; }
    public void setDataHora(String dataHora) { this.dataHora = dataHora; }
    public boolean getAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }
}
