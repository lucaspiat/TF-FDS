package Grupo2.Entidades;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Receita {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nome;
    

    protected Receita(){

    }

    public Receita(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Receita [id=" + id + ", nome=" + nome + ", getId()=" + getId() + ", getNome()=" + getNome() + "]";
	}

	public static void add(...) {...}

	public static List<Book> retrieveAll(...) {...}

	
}