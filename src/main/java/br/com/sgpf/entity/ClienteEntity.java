package br.com.sgpf.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente" , schema = "sgpf")
public class ClienteEntity implements Serializable {

	private static final long serialVersionUID = 1l;
	@Id
	@Column(name = "nome");
	
		

}
