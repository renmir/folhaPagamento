import javax.swing.*;
class Remuneracao {
    String resp;
    int horasMes;
    Remuneracao() {
        String perguntar = "O funcionario é do tipo: \nA. Comissionado \nB. Horista \nC. Assalariado \n";
        while (true) {          // loop até usuario escholher uma das opções validas
            resp = JOptionPane.showInputDialog(perguntar);
            resp = resp.toUpperCase();
            boolean respValida = resp.equals("A") || resp.equals("B") || resp.equals("C");
            if (respValida) { break;
            } else { JOptionPane.showMessageDialog(null, "Resposta invalida. Por favor escolha A, B ou C."); }
        }
        horasMes = Integer.parseInt(JOptionPane.showInputDialog(null, "O total de horas trabalhadas neste mês: "));
    }
    void comissionado() {
        int totalVendas = Integer.parseInt(JOptionPane.showInputDialog(null, "O total de vendas realizdadas neste mês:"));
        float porcentComi = Float.parseFloat(JOptionPane.showInputDialog(null, "O percentual de comissão contratado: "));
        float calPag = totalVendas * porcentComi;
        JOptionPane.showMessageDialog(null, "O funcionaro deve ser pago: R$" + calPag);
    }
    void horista(){
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog(null, "O valor recebido por hora de trabalho: "));
        float calPag = valorHora * horasMes;
        JOptionPane.showMessageDialog(null, "O funcionaro deve ser pago: R$" + calPag);
    }
    void assalariado(){
        float calPag = Float.parseFloat(JOptionPane.showInputDialog(null, "O salario mensal contratado: "));
        JOptionPane.showMessageDialog(null, "O funcionaro deve ser pago: R$" + calPag);
    }
}
