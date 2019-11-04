package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controleTabela")
@SessionScoped
public class ControleTabela implements Serializable{
	
	private List<Pessoa> lista;
	
	public ControleTabela() {
		lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa(1,"Joao","(99)9999-9999"));
		lista.add(new Pessoa(2,"Lukas","(99)9999-9999"));
		lista.add(new Pessoa(3,"Ana","(99)9999-9999"));
		lista.add(new Pessoa(4,"Lucia","(99)9999-9999"));
		lista.add(new Pessoa(5,"Marcelo","(99)9999-9999"));
		lista.add(new Pessoa(6,"Sergio","(99)9999-9999"));
		lista.add(new Pessoa(7,"Jorge","(99)9999-9999"));
		lista.add(new Pessoa(8,"Andre","(99)9999-9999"));
		
	}

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}
	
	
}
