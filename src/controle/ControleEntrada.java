package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name="controleEntrada")
@ViewScoped
public class ControleEntrada implements Serializable{
	
	private Integer id;
	private String nome;
	private String senha;
	private String obs;
	private String grauInstrucao;
	private String saida;
	
	private List<String> grausInstrucao = new ArrayList<String>();

	public ControleEntrada() {
		id = 1;
		grausInstrucao.add("Ensino fundamental");
		grausInstrucao.add("Ensino medio");
		grausInstrucao.add("Ensino superior");
	}
	
	public String processa() {
		saida = "";
		saida += "ID: " + id + "<br/>";
		saida += "nome: " + nome + "<br/>";
		saida += "senha: " + senha + "<br/>";
		saida += "obs: " + obs + "<br/>";
		saida += "grau de instrução: " + grauInstrucao + "<br/>";
		
		return "componentesParte5";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getGrauInstrucao() {
		return grauInstrucao;
	}

	public void setGrauInstrucao(String grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	public List<String> getGrausInstrucao() {
		return grausInstrucao;
	}

	public void setGrausInstrucao(List<String> grausInstrucao) {
		this.grausInstrucao = grausInstrucao;
	}
	
	
	
}
