import javax.swing.*;
abstract class Remuneracao {
    int horasMes = Integer.parseInt(JOptionPane.showInputDialog(null, "O total de horas trabalhadas neste mês: "));
    abstract void pagamento();
}
