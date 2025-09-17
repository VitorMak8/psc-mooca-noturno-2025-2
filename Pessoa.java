
import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private Double idade;
    private Double altura;
    private String email;
    private String cpf;
    private Double peso;
    private String cnpj;

    public void realizarlogin(){


    }

    public void realizarCadastro(){


    }

    public void emitirNotar(){



    }
    
    public void chorar(){

        JOptionPane.showMessageDialog(null, 
        "AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
