package regradenegocios;

public class Despesas{
	protected String descricao;
	protected float valor;
	protected Categoria categoria;
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public float getValor(){
		return this.valor;
	}
}
