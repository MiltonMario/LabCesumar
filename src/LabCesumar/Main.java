
package LabCesumar;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        int opcao;
        
        // Fiz um loop para sempre voltar ao inicio do menu para facilitar a escolha do exame.
        do {
            String input = JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                    "1. Exame de Glicemia\n" +
                    "2. Exame de Colesterol\n" +
                    "3. Exame de Triglicerídeos\n" +
                    "4. sair"       
            );
            
            opcao = Integer.parseInt(input);
            
            switch (opcao) {
                case 1:                    
                    JOptionPane.showMessageDialog(null, "Exame de Glicemia");
                    Glicemia eg = new Glicemia();
                    eg.cadastrarExame();
                    eg.mostrarResultado();
                    break;
                    
                case 2:                    
                    JOptionPane.showMessageDialog(null, "Exame de Colesterol");
                    Colesterol ec = new Colesterol();
                    ec.cadastrarExame();
                    ec.mostrarResultado();
                    break;
                    
                case 3:                    
                    JOptionPane.showMessageDialog(null, "Triglicerídeos");
                    Triglicerideos et = new Triglicerideos();
                    et.cadastrarExame();
                    et.mostrarResultado();
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
            }

        } while (opcao != 4);

    }
    
}
