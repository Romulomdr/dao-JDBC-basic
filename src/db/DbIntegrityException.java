package db;
//Tratamento de exceção para se caso apagar coisa que não devia exibir um erro
public class DbIntegrityException extends RuntimeException	{

	private static final long serialVersionUID = 1L;

	public DbIntegrityException(String msg) {
		super(msg);
	}
}
