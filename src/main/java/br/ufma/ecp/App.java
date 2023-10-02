package br.ufma.ecp;

import static br.ufma.ecp.token.TokenType.*;

import br.ufma.ecp.token.Token;

public class App {

    public static void main(String[] args) {

        String input = "289";
        Scanner scan = new Scanner(input.getBytes());
        System.out.println(scan.nextToken());
        for (Token tk = scan.nextToken(); tk.type != EOF; tk = scan.nextToken()) {
            System.out.println(tk);
        }
    }
}