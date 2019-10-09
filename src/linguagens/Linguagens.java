/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagens;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author Arthur
 */
public class Linguagens {
        
      /**
     * @param args the command line arguments
     */
    
    public static void geraLexer(String path){
        File arquivo = new File(path);  //abre o arquivo "Lexer.flex"
        jflex.Main.generate(arquivo);   //gera a classe "Lexer.java"
    }
    public static void main(String[] args) throws IOException {
        
        // ============= GERAR ARQUIVO LEX ================
        String path = "src\\linguagens\\language.flex";
        geraLexer(path);
        
        // ============ LER ARQUIVO LINGUAGEM ==============
        //System.out.println("whata");
        String expr = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));
	    while(br.ready()){
		String linha = br.readLine();
                expr += linha;
            }
            br.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
	}
        //System.out.println(expr);
        
       Queue<String> toke = new LinkedList<>(); 
        LexicalAnalyzer lexer = new LexicalAnalyzer(new StringReader(expr));
        System.out.println("\nLISTA DE TOKENS \n");
        String resultado = "";
        Tokens token = lexer.yylex();
        toke.offer(lexer.lexeme);
                    
        while(token != null){
            switch(token){
                case DelimEsq:
                    resultado = resultado + "DelimEsq  | " + lexer.lexeme + "\n";
                    toke.offer(lexer.lexeme);
                    break;
                case DelimDir:
                    resultado = resultado + "DelimDir  | " + lexer.lexeme + "\n";
                    toke.offer(lexer.lexeme);
                    break;
                case OpUn:
                    resultado = resultado + "OpUn  | " + lexer.lexeme + "\n";
                    toke.offer(lexer.lexeme);
                    break;
                case OpBin:
                    resultado = resultado + "OpBin     | " + lexer.lexeme + "\n";
                    toke.offer(lexer.lexeme);
                    break;
                case TesteCond:
                    resultado = resultado + "TesteCond | " + lexer.lexeme + "\n";
                    toke.offer(lexer.lexeme);
                    break;
                case Espaco:
                    resultado = resultado + "Espaço | " + lexer.lexeme + "\n";
                    toke.offer(lexer.lexeme);
                    break;
                    case palavrareservada:
                    resultado = resultado + "Palavra Terminal | " + lexer.lexeme + "\n";
                    toke.offer(lexer.lexeme);
                    break;
                
                
                case NomeFunc:
                    String a = lexer.lexeme;
                    a = a.substring(6, a.length());
                    resultado = resultado + "NomeFunc  | " + a + "\n";
                    toke.offer(lexer.lexeme);
                    break;
                case Num: 
                    resultado = resultado + "Num       | " + lexer.lexeme + "\n";
                    toke.offer("$"+lexer.lexeme+"$");
                    break;
                case ID:
                    resultado = resultado + "ID        | " + lexer.lexeme + "\n";
                    toke.offer("$"+lexer.lexeme+"$");
                    break;
                case fim:
                    resultado = resultado + "Simb final      | " + lexer.lexeme + "\n";
                    toke.offer("$"+lexer.lexeme+"$");
                    break;
            }
           token = lexer.yylex();
        }
        System.out.println(resultado);           
       AnalisadorSintatico analisa = new AnalisadorSintatico(toke);
        analisa.analisa();
       
    }
    
       
}












