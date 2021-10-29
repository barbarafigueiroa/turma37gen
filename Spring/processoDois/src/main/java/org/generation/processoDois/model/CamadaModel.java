package org.generation.processoDois.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.GetMapping;

//Aqui eu digo que esta classe é uma entidade através da anotação @Entity e defino o nome da minha tabela do banco de dados de Tabela do banco de dados
//através da anotação @Table
@Entity
@Table(name = "Tabela_db")
public class CamadaModel {
	
	//aqui eu defino através das anotações Id e GeneratedValue a chave primária da minha tabela
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//aqui eu defino um atributo titulo que vai ser ligado a minha tabela no banco de dados e digo que ele vai ser not null e vai ter limites de 5 a 100
	@NotNull
	@Size(min = 5, max = 100)
	private String umTitulo;
	
	//aqui eu defino um atributo texto que vai ser ligado a minha tabela no banco de dados e digo que ele vai ser not null e vai ter limites de 10 a 500
	@NotNull
	@Size(min = 10, max = 500)
	private String umTexto;
	
	//aqui eu defino um atributo que representa a data atual e vai ser ligado a minha tabela no banco de dados, utilizando um objeto ja existente Date
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDeHoje = new java.sql.Date(System.currentTimeMillis());

	
	//Getrs and setrs gerados
	public Long getChavePrimaria() {
		return id;
	}

	public void setChavePrimaria(Long chavePrimaria) {
		this.id = chavePrimaria;
	}

	public String getUmTitulo() {
		return umTitulo;
	}

	public void setUmTitulo(String umTitulo) {
		this.umTitulo = umTitulo;
	}

	public String getUmTexto() {
		return umTexto;
	}

	public void setUmTexto(String umTexto) {
		this.umTexto = umTexto;
	}

	public Date getDataDeHoje() {
		return dataDeHoje;
	}

	public void setDataDeHoje(Date dataDeHoje) {
		this.dataDeHoje = dataDeHoje;
	}
	
	
	
	

}
