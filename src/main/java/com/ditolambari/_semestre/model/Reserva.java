package com.ditolambari._semestre.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalTime;

import org.antlr.v4.runtime.misc.NotNull;

import io.micrometer.common.lang.NonNull;

@Entity
@Table(name = "reserva")
public class Reserva{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "telefone", nullable = false)
    private String telefone;


    @Column(name = "data_reserva", nullable = false)
    private LocalDate dataReserva;

    @Column(name = "horario", nullable = false)
    private LocalTime horario;

    @Column(name = "numero_pessoas", nullable = false)
    private int numeroPessoas;

    @Column(name = "mensagem")
    private String mensagem;

    public Reserva() {
    }

    public Reserva(String nome, String email, String telefone, LocalDate dataReserva, LocalTime horario, int numeroPessoas, String mensagem) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataReserva = dataReserva;
        this.horario = horario;
        this.numeroPessoas = numeroPessoas;
        this.mensagem = mensagem;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataReserva=" + dataReserva +
                ", horario=" + horario +
                ", numeroPessoas=" + numeroPessoas +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
}
