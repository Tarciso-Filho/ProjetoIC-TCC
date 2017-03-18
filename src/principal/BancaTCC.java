package principal;
import principal.ConvidadoTCC;
import principal.TCC;

import java.awt.List;
import java.util.ArrayList;

public class BancaTCC {
	private int id;
	private List ListaServidores = new ArrayList<Servidor>() ;
	private List ListaProfessores = new ArrayList<Professor>();
	private List ListaConvidados = new ArrayList<ConvidadoTCC>() ;
	
	public BancaTCC(int id, List listaServidores, List listaProfessores, List listaConvidados) {
		super();
		this.id = id;
		ListaServidores = listaServidores;
		ListaProfessores = listaProfessores;
		ListaConvidados = listaConvidados;
	}
	
}
