@Entity
public class Usuario {
    @Id
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private Preferencia preferenciaUsuario;

    protected Usuario(){

    }

    public Usuario(String nome, String sobrenome, String email, String senha, Preferencia preferenciaUsuario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.preferenciaUsuario = preferenciaUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Preferencia getPreferencia() {
        return preferenciaUsuario;
    }

    @Override
    public String toString() {
        return "Usuario [Nome = " + getNome() + ", Sobrenome = " + getSobrenome() + ", e-mail = " + getEmail() + ", Senha = " + getSenha() + ", Preferência = " + getPreferencia() + "]";
    }
}