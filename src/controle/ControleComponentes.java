package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "controleComponentes")
@SessionScoped
public class ControleComponentes implements Serializable{
	
	private String texto;
	private String idComponente;
	
	public ControleComponentes() {
	}
	
	public String geraTexto() {
		texto = "texto gerado: < > & <b>Texto em negrito</b>";
		return "componentesParte2";
	}
	
	public void listerner(ActionEvent event) {
		UIComponent source = event.getComponent();
		idComponente = "Componente que executou a ação: " +  source.getId();
	}
	
	public String executar() {
		return "componentesParte3";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getIdComponente() {
		return idComponente;
	}

	public void setIdComponente(String idComponente) {
		this.idComponente = idComponente;
	}
	
}
