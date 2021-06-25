
package agmed;


public abstract class PessoaFisica {

    private final String nome;
    private final String cpf;
    private String endereco;
    private String contato;

    public PessoaFisica(String nome, String cpf, String endereco, String contato) {

        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;

    }
    @Override
    public String toString() {
        return "PessoaFisica{"
                + "nome='" + nome + '\''
                + ", cpf='" + cpf + '\''
                + ", endereço='" + endereco
                + "', contato='" + contato
                + "'}";
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public String getContato() {
        return this.contato;
    }
    
}
