public class Decisao {
    public static void main(String[] args) {
        int idadeUsuario = 16;
        String classificacaoIndicativa = "18+";

        //Lógica de Verificação
        if (classificacaoIndicativa.equals("Livre")){
            System.out.println("Acesso para todas as idades");

        } else if (classificacaoIndicativa.equals("12+") && (idadeUsuario >= 12)){
            System.out.println("Acesso permitido");

        } else if (classificacaoIndicativa.equals("14+") && (idadeUsuario >= 14)){
            System.out.println("Acesso permitido");

        } else if (classificacaoIndicativa.equals("16+") && (idadeUsuario >= 16)){
            System.out.println("Acesso permitido");

        } else if (classificacaoIndicativa.equals("18+") && (idadeUsuario >= 18)){
            System.out.println("Acesso permitido");

        } else {
            // Caso nenhuma das condições acima seja atendida
            System.out.println("Acesso negado. Idade insuficiente");
        }
    }
}
