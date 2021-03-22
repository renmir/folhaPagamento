import javax.swing.*;
public class horista extends Remuneracao{
    float valorHora = Float.parseFloat(JOptionPane.showInputDialog(null, "O valor recebido por hora de trabalho: "));
    void pagamento() {
        float calPag = valorHora * horasMes;
        JOptionPane.showMessageDialog(null, "O funcionaro deve ser pago: R$" + calPag);
    }
}
