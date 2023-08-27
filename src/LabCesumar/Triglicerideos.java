
package LabCesumar;

import javax.swing.JOptionPane;

public class Triglicerideos extends Paciente{
    
    private int triglicere;

    public int getTriglicere() {
        return triglicere;
    }
    
    // cadastro do cliente com reutilização do cadastro de paciente da classe Paciente
    public void cadastrarExame() {
        cadastrarPaciente();
        triglicere = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de Triglicere: "));
    }
    
    // pego a variavel idade para usar na comparação do exames
    int idade = idade(getAnoNasc());
    
    // classificando os resultados do triglicere
    public String classificarResultadoTriglicere() {   
        
        if(idade <= 9 && getTriglicere() < 75) {
            return "Triglicerídeos Bom";
        }
        if(idade >= 10 && idade <= 19 && getTriglicere() < 90) {
            return "Triglicerídeos Bom";
        }
        if(idade > 20 && getTriglicere() < 150) {
            return "Triglicerídeos Bom";
        } else {
            return "Triglicerídeos Ruim";
        }
    }
    
    // metodo responsavel por mostrar o resultado em uma tela só
    // concatenei as strings em uma variavél para ficar mais limpo e facil de entender
    public void mostrarResultado() {
        
        String resultado = "Nome: " + getNome() + "\n" + "Resultado: " + getTriglicere()+ "\n" + "Classificação: " + classificarResultadoTriglicere();

        JOptionPane.showMessageDialog(null, resultado, "Resultado do exame", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
