package br.com.etechoracio.pw2clinicaveterinaria.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue
	private int IDTUTOR;
	private String NOME_TUTOR;
	private String CELULAR_TUTOR;
	private String CPF_TUTOR;
}
