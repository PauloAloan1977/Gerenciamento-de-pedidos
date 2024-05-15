
	package br.com.sgpf.entity;

	import java.io.Serializable;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "Produto" , schema = "sgpf")
	public class ProdutoEntity implements Serializable {

		private static final long serialVersionUID = 1l;
		@Id
		@Column(name = "nome")
		private String nome;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}

		
	}


