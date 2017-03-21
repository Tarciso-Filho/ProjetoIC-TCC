package principal;
import principal.BancaTCC;
import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;

public class TCC {
	private int id;
	private Curso curso;
	private Discente discente;
	private Professor orientador; // COLOQUEI TIPO PROFESSOR E NÃO "TIPO ORIENTADOR"
	//private String autor; NO UML NÃO TEM ESSA VÁRIAVEL
	private String titulo;
	private Date dataInicio;
	private Date dataFim;
	private BancaTCC bancaTCC = new BancaTCC();
	
	public TCC(int id, Curso curso, Professor orientador, Discente aluno, String /*autor*/ titulo, Date dataInicio, Date dataFim,
			BancaTCC bancaTCC) {
		super();
		this.id = id;
		this.curso = curso;
		this.discente = aluno;
		this.orientador = orientador;
		//this.autor = autor;
		this.titulo = titulo;
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
	
	public Discente getDiscente() {
		return discente;
	}

	public void setDiscente(Discente discente) {
		this.discente = discente;
	}

	public Professor getOrientador() {
		return orientador;
	}

	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}

	/*public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}*/
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public BancaTCC getBancaTCC() {
		return bancaTCC;
	}

	public void setBancaTCC(BancaTCC bancaTCC) {
		this.bancaTCC = bancaTCC;
	}
	
	public void gerarDeclaracaoOrientacao()
	{
		String declaracao = "/nDECLARAÇÃO DE PARTICIPAÇÃO DA BANCA EXAMINADORA";
		DateFormat converter = DateFormat.getDateInstance(DateFormat.FULL);
		
		declaracao += "/n/nDeclaro para os devidos fins que os professores ";
		
		declaracao += getOrientador().getNome();
		
		declaracao += "participou da Banca Examinadora da Monografia de Graduação como Orientador do(a) aluno(a) ";
		declaracao += getDiscente().getNome();
		declaracao += "com o título ";
		declaracao += getTitulo();
		declaracao += " apresentado no dia ";
		declaracao += converter.format(getDataFim().getTime());
		
		System.out.println(declaracao);
	}
	
	public void gerarDeclaracaoDeParticipacao()
	{
		String declaracao = "/nDECLARAÇÃO DE PARTICIPAÇÃO DA BANCA EXAMINADORA";
		DateFormat converter = DateFormat.getDateInstance(DateFormat.FULL);
		
		declaracao += "/n/nDeclaro para os devidos fins que o professor ";
		
		for(Servidor professor: getBancaTCC().getListaServidores())
		{
			declaracao += professor.getNome() + ", ";
		}
		
		declaracao += "participaram da Banca Examinadora da Monografia de Graduação do(a) aluno(a) ";
		declaracao += getDiscente().getNome();
		declaracao += "com o título ";
		declaracao += getTitulo();
		declaracao += " apresentado no dia ";
		declaracao += converter.format(getDataFim().getTime());
		
		System.out.println(declaracao);
	}

}

