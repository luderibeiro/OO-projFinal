package regradenegocios;

public class Estudantes {
	private String nome;
	private String email;
	private float totalRendimentos;
	
	protected void cadastrarEstudante(){
		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public float getTotalRendimentos(){
		return this.totalRendimentos;
	}
	
	public void setNome(String n){
		this.nome = n;
	}
	
	public void setEmail(String e){
		this.email = e;
	}
}
