public class Pessoa {

    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setNome(String n) {
        this.nome = n;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object obj) {
        Pessoa p = (Pessoa) obj;
        return this.cpf == p.cpf;

    }


}
