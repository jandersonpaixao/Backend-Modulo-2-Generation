package com.blogpessoal.blogpessoal.model;

import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;


@Entity //informa que a classe é uma entidade e será mapeada como tabela no banco
@Table(name = "tb_postagens") //cria a tabela
public class Postagem {
	
	@Id //indica que é chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //torna auto incremente
	private long id;
	
	@NotBlank //not null
	@Size(min = 3, max = 255)// limite de caracteres, começando a partir do 3 caractere
	private String titulo;
	
	
	@NotBlank
	@Size(max = 1000)
	private String texto;
	
	@UpdateTimestamp //ao criar uma postagem ele gera uma data e hora em tempo real
	private LocalDateTime data;
	
	
	private String foto;


	//é necessário criar os getters and setters para
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public LocalDateTime getData() {
		return data;
	}


	public void setData(LocalDateTime data) {
		this.data = data;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	
}
