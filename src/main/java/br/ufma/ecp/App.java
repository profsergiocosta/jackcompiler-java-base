package br.ufma.ecp;

import static br.ufma.ecp.token.TokenType.*;

import br.ufma.ecp.token.Token;

public class App {

    public static void main(String[] args) {

        String input = """
                            //comentario de linha
                            /*
                            comentario em bloco
                            */
                            \"Teste\"
                            int estoque = //valor recuperado do sistema

                            if (estoque >= 100) {
                            estoque = estoque - 100;
                            } else if (estoque < 100 && estoque > 50) {
                                estoque = estoque - 50;
                                } else if (estoque <= 50 && estoque > 0) {
                                estoque = estoque - 10;
                            } else {
                                estoque = 0;
                            }
                        """;
        Scanner scan = new Scanner(input.getBytes());
        for (Token tk = scan.nextToken(); tk.type != EOF; tk = scan.nextToken()) {
            System.out.println(tk);
        }
    }
}