import javax.swing.*;
public class comissionado extends Remuneracao {
    int totalVendas = Integer.parseInt(JOptionPane.showInputDialog(null, "O total de vendas realizdadas neste mês:"));
    float porcentComi = Float.parseFloat(JOptionPane.showInputDialog(null, "O percentual de comissão contratado: "));
    void pagamento(){
        float calcPag = totalVendas * porcentComi;
        JOptionPane.showMessageDialog(null, "O funcionaro deve ser pago: R$" + calcPag);
    }
}
