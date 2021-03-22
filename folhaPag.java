import javax.swing.*;
public class folhaPag {
    static String resp;
    static String perguntar = "O funcionario é do tipo: \nA. Comissionado \nB. Horista \nC. Assalariado \n";
    public static void main(String[] args) {
        while (true) {          // loop até usuario escolher uma das opções validas
            resp = JOptionPane.showInputDialog(perguntar);
            resp = resp.toUpperCase();
            boolean respValida = resp.equals("A") || resp.equals("B") || resp.equals("C");
            if (respValida) {
                break;
            } else { JOptionPane.showMessageDialog(null, "Resposta invalida. Por favor escolha A, B ou C."); }
        }
        if ((resp.equals("A"))) {
            Remuneracao funcionario = new comissionado();
            funcionario.pagamento();
        }
        if ((resp.equals("B"))) {
            Remuneracao funcionario = new horista();
            funcionario.pagamento();
        }
        if ((resp.equals("C"))) {
            Remuneracao funcionario = new assalariado();
            funcionario.pagamento();
        }
    }
}
