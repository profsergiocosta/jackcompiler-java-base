package br.ufma.ecp.token;

import java.util.List;
import java.util.Map;

public enum TokenType {
    PLUS("+"),
    MINUS("-"),

     // Literals.
     NUMBER("0123456789"),
     STRING("IDENT"),


     IDENT("IDENT"),

 
     // keywords
     METHOD("method"),
     WHILE("while"),
     IF("if"),
     CLASS("class"),
     CONSTRUCTOR("constructor"),
     FUNCTION("function"),
     FIELD("field"),
     STATIC("static"),
     VAR("var"),
     CHAR("char"),
     BOOLEAN("boolean"),
     VOID("void"),
     TRUE("true"),
     FALSE("false"),
     NULL("null"),
     THIS("this"),
     LET("let"),
     DO("do"),
     ELSE("else"),
     RETURN("return"),

     EOF("\0"),

     ILLEGAL("ILLEGAL");

     static public boolean isSymbol (char c) {
        String symbols = "{}()[].,;+-*/&|<>=~";
        return symbols.indexOf(c) > -1;
    }

    private String value;

    TokenType(String value) {
    }

    public String getValue() {
         return this.value;
    }

    static public boolean isKeyword (TokenType type) {
        List<TokenType> keywords  = 
            List.of(
                METHOD,
                WHILE,
                IF,
                CLASS,
                CONSTRUCTOR
            );
            return keywords.contains(type);
    }

}
