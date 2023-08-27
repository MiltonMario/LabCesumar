
package LabCesumar;

import javax.swing.JOptionPane;

public class Glicemia extends Paciente {
    
    private int glicose;
    
    public void setGlicose(int glicose){
        this.glicose = glicose;
    }
    
    public int getGlicose() {
        return glicose;
    } 
    
    // cadastro do cliente com reutilização do cadastro de paciente da classe Paciente
    public void cadastrarExame() {
        cadastrarPaciente();
        glicose = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a concentração de glicose no sangue: "));
    }
    
    //onde compara e dar o resultado
    public String classificarResultado() {
        if(glicose < 100) {
            return "Normoglicemia";
        } else if (glicose >= 100 && glicose < 126) {
            return "Pré-diabetes";
        } else {
            return "Diabetes estabelecido";
        }
    
    }
    

    // metodo responsavel por mostrar o resultado em uma tela só
    // concatenei as strings em uma variavél para ficar mais limpo e facil de entender
    public void mostrarResultado() {
        
        String resultado = "Nome: " + getNome() + "\n" + "Resultado: " + getGlicose() + "\n" + "Classificação: " + classificarResultado();

        JOptionPane.showMessageDialog(null, resultado, "Resultado do exame", JOptionPane.INFORMATION_MESSAGE);
        
    }    
        
        
        
}
