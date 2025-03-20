package calculadora;

public class AlunoMain {

    public static void main(String[] args) {
        // Crie a instância da janela de diálogo
        AlunoView aluno = new AlunoView(new javax.swing.JFrame(), true);
        
        // Torne o diálogo visível
        aluno.setVisible(true);
    }
}
