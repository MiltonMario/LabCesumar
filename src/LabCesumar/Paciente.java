
package LabCesumar;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public abstract class Paciente {
    private String nome;
    private int anoNasc;
    private String tipoSangue;
  
    
    //metodo padrão para cadastrar o paciente
    public void cadastrarPaciente() {
        nome = JOptionPane.showInputDialog("digite o nome:");
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("digite o ano de nascimento:"));
        tipoSangue = JOptionPane.showInputDialog("digite o tipo de sangue:");
    }

    // se segue os getter e setters dos atributos
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }
    
    public void setAnoNasc(int dataNasc) {
        this.anoNasc = dataNasc;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }
    
    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }
    
    // aqui faço a conversão do ano de nascimento para 
    // idade para ser usado nos exames que pedirem
    public int idade(int idade) {
        int anoAtual = LocalDate.now().getYear();
        return idade = anoAtual - getAnoNasc();
    }
    
}    
