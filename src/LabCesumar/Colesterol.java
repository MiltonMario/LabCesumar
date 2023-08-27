
package LabCesumar;

import javax.swing.JOptionPane;

public class Colesterol extends Paciente{
    
    private int LDL;
    private int HDL;
    private String risco;

    public int getLDL() {
        return LDL;
    }   

    public int getHDL() {
        return HDL;
    }
    
    public String getRisco() {
        return risco;
    }
    
    // cadastro do cliente com reutilização do cadastro de paciente da classe Paciente
    public void cadastrarExame() {
        cadastrarPaciente();
        LDL = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de LDL: "));
        HDL = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de HDL: "));
        risco = JOptionPane.showInputDialog(null, "Risco(A - Alto, M - Médio, B - Baixo)");
    }
    
    // pego a variavel idade para usar na comparação do exames
    int idade = idade(getAnoNasc());
    
    // comparando e gerando o resultado do HDL
    public String classificarResultadoHDL() {   
        
        if(idade <= 19 && getHDL() > 45) {
            return "HDL Bom";
        }
        if(idade > 20 && getHDL() > 40) {
            return "HDL Bom";
        } else {
            return "HDL Ruim";
        }
    }
    
    // comparando e gerando o resultado do LDL
    public String classificarResultadoLDL() {
        if("B".equals(getRisco()) && getLDL() < 100) {
            return "LDL Bom";
        }
        if("M".equals(getRisco()) && getLDL() < 70) {
            return "LDL Bom";
        }
        if("A".equals(getRisco()) && getLDL() < 50) {
            return "LDL Bom";
        } else {
            return "LDL Ruim";
        }
    }
    
    // metodo responsavel por mostrar o resultado em uma tela só
    // concatenei as strings em uma variavél para ficar mais limpo e facil de entender
    public void mostrarResultado() {
        
        String resultado = "Nome: " + getNome() + "\nResultado LDL: " + getLDL() + "\nResultado HDL: " + getHDL() + "\nResultado Risco: " + getRisco() + "\nClassificação HDL: " + classificarResultadoHDL() + "\nClassificação LDL: " + classificarResultadoLDL();

        JOptionPane.showMessageDialog(null, resultado, "Resultado do exame", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
