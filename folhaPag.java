public class folhaPag {
    public static void main(String[] args) {
        Remuneracao funcionario = new Remuneracao();
        if ((funcionario.resp.equals("A"))) {
            funcionario.comissionado();         // inicia o metodo comissionado dentro de remuneracao
        }
        if ((funcionario.resp.equals("B"))) {
            funcionario.horista();
        }
        if ((funcionario.resp.equals("C"))) {
            funcionario.assalariado();
        }
    }
}
