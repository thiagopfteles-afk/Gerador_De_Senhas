import java.security.SecureRandom;


public class ProjetoGeradorDeSenhas {

    private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*()[]~.;";

    public static String gerarSenha(int comprimento) {
        SecureRandom geradorDeNumeroAleatorio = new SecureRandom();
        StringBuilder senha = new StringBuilder(comprimento);

        for (int i = 0; i < comprimento; i++) {
            int indice = geradorDeNumeroAleatorio.nextInt(CARACTERES.length());
            senha.append(CARACTERES.charAt(indice));
        }
        return senha.toString();
    }

    public static void main(String[] args) {

        int comprimento = 12;
        String senha = gerarSenha(comprimento);
        System.out.println("Senha gerada: " + senha);

    }

}