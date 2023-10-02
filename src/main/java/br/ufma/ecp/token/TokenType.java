package br.ufma.ecp.token;

import java.util.List;
import java.util.Map;

public enum TokenType {
    
    // symbols
    LPAREN,RPAREN,
    LBRACE, RBRACE,
    LBRACKET,RBRACKET,

    COMMA, SEMICOLON, DOT,
  
    PLUS,  MINUS,ASTERISK, SLASH,

    AND, OR, NOT,

    LT, GT, EQ,

    // Literals.
    NUMBER,
    STRING,

    IDENT,

    // keywords
    METHOD,
    WHILE,
    IF,
    CLASS,
    CONSTRUCTOR,
    FUNCTION,
    FIELD,
    STATIC,
    VAR,
    INT,
    CHAR,
    BOOLEAN,
    VOID,
    TRUE,
    FALSE,
    NULL,
    THIS,
    LET,
    DO,
    ELSE,
    RETURN,

    EOF,

    ILLEGAL;

    static public boolean isSymbol(char c) {
        String symbols = "{}()[].,;+-*/&|<>=~";
        return symbols.indexOf(c) > -1;
    }

    static public boolean isKeyword(TokenType type) {
        List<TokenType> keywords = List.of(
                METHOD,
                WHILE,
                IF,
                CLASS,
                CONSTRUCTOR);
        return keywords.contains(type);
    }

}