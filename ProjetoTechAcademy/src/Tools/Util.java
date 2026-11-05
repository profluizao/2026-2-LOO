package Tools;

public class Util {
    public static void limparTerminal() {
        // \033[H move o cursor para o início e \033[2J limpa a tela
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
