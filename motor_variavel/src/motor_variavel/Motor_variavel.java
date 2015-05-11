package motor_variavel;

public class Motor_variavel {

    public static void main(String[] args) {
        String cod = JOptionPane.showInputDialog(null, "Código:");
        while(!cod.equalsIgnoreCase("s")){
            boolean res = declaracao(cod);
            System.out.println("Resultado:" +res);
            cod = JOptionPane.showInputDialog(null, "Código:");
        }       
    }
    public static String nome (){
        return "<n>";
    }
    public static String expressao (){
        return "<e>";
    }
    public static boolean declaracao (String codigo){
        //var <n> = <e>
        //var +<n>|var +<n> *= *<e>
        return codigo.matches(" *var +"+nome()+"|var "+nome()+" *= *"+expressao());
    }
    public static boolean atribuicao (String codigo){
        //<n> = <e>
        // *<n> *= *<e>
        return codigo.matches(" *"+nome()+" *= *"+expressao());
    }
}
