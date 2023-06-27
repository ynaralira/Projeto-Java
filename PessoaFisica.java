package spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_pessoafisica")
public class PessoaFisica extends Cliente {
	@Column
	private String cpf;

	public PessoaFisica() {
	}

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
}