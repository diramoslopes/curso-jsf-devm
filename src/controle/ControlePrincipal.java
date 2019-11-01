package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controlePrincipal")
@SessionScoped
public class ControlePrincipal implements Serializable {
	
	
	private String mensagens;

	public ControlePrincipal() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
		mensagens = "A aplicação foi ao ar no momento " + 
					sdf.format(Calendar.getInstance().getTime());
	}
	
	public String sobre() {
		mensagens = "voce navegou de maneira dinamica";
		
		return "sobre";
	}
	
	public String sobreRedirecionado() {
		mensagens = "voce foi redirecionado para a pag sobre.xhtml";
		
		return "sobre?faces-redirect=true";
	}
	
	public String geraErro() {
		return "erro";
	}
	
	public String geraErroGrave() {
		return "erro";
	}
	
	public String geraLogin() {
		return "login";
	}

	public String getMensagens() {
		return mensagens;
	}

	public void setMensagens(String mensagens) {
		this.mensagens = mensagens;
	}
	
	
}
