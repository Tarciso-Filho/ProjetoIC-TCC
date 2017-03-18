package principal;
import principal.BancaTCC;
import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

public class TCC {
	private int id;
	private Curso curso;
	private Professor orientador; // COLOQUEI TIPO PROFESSOR E NÃO "TIPO ORIENTADOR"
	private String autor;
	private Date dataInicio;
	private Date dataFim;
	private List<BancaTCC> bancaTCC = new ArrayList<BancaTCC>();
	
		public TCC(int id, Curso curso, Professor orientador, String autor, Date dataInicio, Date dataFim,
			List<BancaTCC> bancaTCC) {
		super();
		this.id = id;
		this.curso = curso;
		this.orientador = orientador;
		this.autor = autor;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.bancaTCC = bancaTCC;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Professor getOrientador() {
		return orientador;
	}

	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public List<BancaTCC> getBancaTCC() {
		return bancaTCC;
	}

	public void setBancaTCC(List<BancaTCC> bancaTCC) {
		this.bancaTCC = bancaTCC;
	}
	

}

