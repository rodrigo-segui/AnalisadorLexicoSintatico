package linguagens;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.Queue;

public class AnalisadorSintatico {
    private char digito[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Queue toke;
public AnalisadorSintatico(Queue toke){
    this.toke = toke;
}

    public boolean verificarNum(String s){ // TRUE -> NÚMERO, FALSE -> ID
        char inicio = s.charAt(0);
        for(int i = 0; i < digito.length; i++){
            if(inicio == digito[i]){
                return true;
            }
        }
        return false;
    }
    
    public int verifica(String palavra) {
        char[] letras = null;
        letras = palavra.toCharArray();//quebra a string em caracter

            if(Character.isLetter(letras[0])){
                return 1;
            }else if(Character.isDigit(letras[0])){
                return 2;
               
            
        }
        return 0;
    }

public void analisa(){
    toke.poll();
    String[][] reg1= new String[1][5];
    String[][] reg2 = new String[55][5];
    String[][] reg3 = new String[54][5];
    String[][] reg4 = new String[70][5];
    String entrada2 = null;
    String[] palavraReservada = new String[35]; 
    Setmatriz matriz = new Setmatriz();
    matriz.matriz(reg1, reg2, reg3, reg4,palavraReservada);
    Stack pilha = new Stack();
    Stack pilha2 = new Stack();
    String estado ="p";
    String expr = "";
    int ok=0;
    String entrada="";
    String entrada1="";
    String AntEntrada="";
    int flag2=0;
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
        boolean controle = true;
        while(controle){
        
        if(estado == "q#"){
            
            controle = false;
            //System.out.println("estrou aqui xD");
        }
        if(estado=="p"){
            System.out.println("Estado: " + estado+ " | Entrada: "+expr+ " | Pilha: vazia");
            pilha.add("<programa>");
            estado="q";
        }
        
        System.out.println("Estado: " + estado+ " | Entrada: "+expr+ " | Pilha: " + pilha.peek());
        
        if(estado=="q"){
            
            int i=1;
            if(flag2==0){
            entrada=String.valueOf(toke.poll());
            }
            
            if(!(entrada.contains("$"))){
                while(true){
                if(entrada1.equals(entrada)){
                    break;
                }
                    else{
                    entrada1=expr.substring(0,i);
                    i++;
                    }
                }
                
                expr = expr.substring(entrada.length(),expr.length());
                
                i=0;

                while(!(reg2[i][1].equals(entrada))){
                    i++;
                }
                
                 estado=reg2[i][3];
                 
                 
            }
            else{
                flag2=1;
                AntEntrada="";
                AntEntrada=entrada.substring(0,1);
                if(!(entrada.substring(1,2).equals("$"))){
                entrada1=entrada.substring(1,2);
                entrada2 = entrada;
                entrada=entrada.substring(2,entrada.length());
                
                if(ok!=1){    
                expr = expr.substring(entrada.length(),expr.length());
                ok=1;
                }
                    entrada=AntEntrada+entrada;
                    i=0;
                    while(!(reg2[i][1].equals(entrada1))){
                        i++;
                    }
                     estado=reg2[i][3];
                     
                }
                else{
                    estado="q";
                    flag2=0;
                    ok=0;
                    pilha.pop();
                }
                
            }
        }
        else{
            
            int cont=0;
            while(cont<7){
                    
                    if(entrada1.equals("#")){
                        if(pilha.peek().equals(")")){
                            pilha.pop();
                        }
                        System.out.println("Estado1: " + estado+ " | Entrada: "+expr+ " | Pilha: " + pilha.peek());
                        
                        break;
                    }
                    if(entrada.equals(" ") && estado == "qEsp" && pilha.peek().equals("<lf>")){
                        pilha.pop();
                    }
                    if(entrada.equals(")") && estado == "q" && pilha.peek().equals("<nn>")){
                        pilha.pop();
                    }
                    if(entrada1.equals("(") && estado == "q(" && pilha.peek().equals(")")){
                        pilha.pop();
                    }
                    
                    
                    if(estado.equals("q)") && pilha.peek().equals("<p>")){
                        pilha.pop();
                    }
                    if(entrada1.equals(pilha.peek())){
                    estado="q";
                        pilha.pop();
                    break;
                    }
                else{
                    int j=0;
                    while(!(reg4[j][2].equals(pilha.peek()))){
                        j++;
                    }
                    
                    if(pilha.peek().equals("<n>")){
                        if(verificarNum(entrada1)){
                            j = 30;
                        }else{
                            j = 31;
                        }
                    }
                    //System.out.println("expr = " + expr.substring(0,1));
                    if(expr.substring(0,1).equals("+") && pilha.peek().equals("<corpo>")){
                        j=7;
                    }
                    if(expr.substring(0,1).equals("+") && pilha.peek().equals("<exp>")){
                        j=13;
                    }
                    if(expr.substring(0,1).equals("-") && pilha.peek().equals("<corpo>")){
                        j=7;
                    }
                    if(expr.substring(0,1).equals("-") && pilha.peek().equals("<exp>")){
                        j=14;
                    }
                    if(expr.substring(0,1).equals("/") && pilha.peek().equals("<corpo>")){
                        j=7;
                    }
                    if(expr.substring(0,1).equals("/") && pilha.peek().equals("<exp>")){
                        j=16;
                    }
                    if(expr.substring(0,1).equals("*") && pilha.peek().equals("<corpo>")){
                        j=7;
                    }
                    if(expr.substring(0,1).equals("*") && pilha.peek().equals("<exp>")){
                        j=15;
                    }
                    if(verifica(expr.substring(0,1))==2 && pilha.peek().equals("<corpo>")){
                        j=7;
                    }
                    if(verifica(expr.substring(0,1))==2 && pilha.peek().equals("<exp>")){
                        j=11;
                    }
                    if((verifica(expr.substring(0,1))==1 || verifica(expr.substring(0,1))==0) && pilha.peek().equals("<corpo>")){
                        //System.out.println("entra aqui pf");
                        j=7;
                    }
                    if(verifica(expr.substring(0,1))==1 && pilha.peek().equals("<exp>")){
                        j=12;
                    }       
                    if(expr.substring(0,2).equals("gt") && pilha.peek().equals("<cond>")){
                        j=17;
                    }
                    if(expr.substring(0,2).equals("lt") && pilha.peek().equals("<cond>")){
                        j=18;
                    }
                    if(expr.substring(0,3).equals("leq") && pilha.peek().equals("<cond>")){
                        j=20;
                    }
                    if(expr.substring(0,2).equals("eq") && pilha.peek().equals("<cond>")){
                        j=21;
                    }
                    if(expr.substring(0,3).equals("neq") && pilha.peek().equals("<cond>")){
                        j=22;
                    }
                    if(expr.substring(0,3).equals("not") && pilha.peek().equals("<cond>")){
                        j=23;
                    }
                    if(expr.substring(0,3).equals("geq") && pilha.peek().equals("<cond>")){
                        j=19;
                    }
                    if(expr.substring(0,3).equals("and") && pilha.peek().equals("<cond>")){
                        j=24;
                    }
                    if(expr.substring(0,2).equals("or") && pilha.peek().equals("<cond>")){
                        j=25;
                    }
                    if(expr.substring(0,2).equals("if") && pilha.peek().equals("<corpo>")){
                        j=5;
                    }
                    
                    //colocar um aqui função que verifica string ou int
                    //System.out.println("jota = " + j);
                    if(flag2==1 && reg4[j][2].equals("<letra>")){
                        while(!(reg4[j][4]).equals(entrada1)){
                            j++;
                        }
                        pilha.pop();
                        pilha.push(entrada1);
                    }
                    else if(flag2==1 && reg4[j][2].equals("<digito>")){
                        while(!(reg4[j][4]).equals(entrada1)){
                            j++;
                        }
                        pilha.pop();
                        pilha.push(entrada1);
                    }
                    else{
                    pilha.pop();
                    int i=1;
                    String palavra,palavra2;
                    palavra="";
                    palavra=reg4[j][4];
                    //System.out.println("PALAVRA"+palavra);
                    palavra2="";
                    int flag=0,dd=0;
                        while(!(palavra.isEmpty())){
                            i=1;
                            dd=0;
                            flag=0;
                            while(flag==0){
                                while(dd<35){
                                    if(palavra2.equals(palavraReservada[dd])){
                                        flag=1;
                                        break;
                                    }
                                    dd++;
                                }
                                if(flag==0){
                                    palavra2=palavra.substring(0,i);
                                    i++;
                                    dd=0;
                                }
                                dd=0;
                            }
                            System.out.println("PALAVRA2"+palavra2);
                            pilha2.push(palavra2);
                            palavra=palavra.substring(palavra2.length(),palavra.length());
                            palavra2="";
                            palavra2=palavra;
                            
                        }
                    }
                    
                        while(!(pilha2.empty())){
                            pilha.push(String.valueOf(pilha2.pop()));
                            
                        }
                        cont++;
                        System.out.println("Estado: " + estado+ " | Entrada: "+expr+ " | Pilha: " + pilha.peek());
                        
                }
                
            }
            
        }
        
    }
}    
}
