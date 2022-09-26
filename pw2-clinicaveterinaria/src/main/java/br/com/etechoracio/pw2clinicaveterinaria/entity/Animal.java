package br.com.etechoracio.pw2clinicaveterinaria.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ANIMAL")
public class Animal {

	@Id
	@GeneratedValue
	private int IDANIMAL;
	private String NOME_ANIMAL;
	private String TIPO;
	private String RACA_ANIMAL;
	private Long PESO;
	@ManyToOne
	@JoinColumn(name = "DONO")
	private Cliente DONO;
}
