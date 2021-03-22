import javax.swing.*;
public class assalariado extends Remuneracao {
    float calPag = Float.parseFloat(JOptionPane.showInputDialog(null, "O salario mensal contratado: "));
    void pagamento() {
        JOptionPane.showMessageDialog(null, "O funcionaro deve ser pago: R$" + calPag);
    }
}
