package linguagens;

public class Setmatriz {
    public void matriz(String[][] reg1,String[][] reg2,String[][] reg3,String[][] reg4,String[] palavras){
        String[][] regra1 = reg1; 
        String[][] regra2 =reg2;
        String[][] regra3 =reg3;
        String[][] regra4 =reg4;
        String[] palavra=palavras;
        
        //PALAVRAS
        
        palavra[0]="(";
        palavra[1]=")";
        palavra[2]="<id>";
        palavra[3]="defun";
        palavra[4]="<programa>";
        palavra[5]="if";
        palavra[6]="<lista-de-funcoes>";
        palavra[7]="<funcao>";
        palavra[8]="<lf>";
        palavra[9]="<params>";
        palavra[10]="<corpo>";
        palavra[11]="<cond>";
        palavra[12]="<exp>";
        palavra[13]="<num>";
        palavra[14]=" ";
        palavra[15]="+";
        palavra[16]="-";
        palavra[17]="*";
        palavra[18]="/";
        palavra[19]="and";
        palavra[20]="or";
        palavra[21]="not";
        palavra[22]="eq";
        palavra[23]="leq";
        palavra[25]="neq";
        palavra[26]="geq";
        palavra[27]="lt";
        palavra[28]="gt";
        palavra[29]="<p>";
        palavra[30]="<id>";
        palavra[31]="<nn>";
        palavra[32]="<digito>";
        palavra[33]="<n>";
        palavra[34]="<letra>";
        
        /*
        palavra[29]="0";
        palavra[30]="1";
        palavra[31]="2";
        palavra[32]="3";
        palavra[33]="4";
        palavra[34]="5";
        palavra[35]="6";
        palavra[36]="7";
        palavra[37]="8";
        palavra[38]="9";
        palavra[39]="a";
        palavra[40]="b";
        palavra[41]="c";
        palavra[42]="d";
        palavra[43]="e";
        palavra[44]="f";
        palavra[45]="g";
        palavra[46]="h";
        palavra[47]="i";
        palavra[48]="j";
        palavra[49]="k";
        palavra[50]="l";
        palavra[51]="m";
        palavra[52]="n";
        palavra[53]="o";
        palavra[54]="p";
        palavra[55]="q";
        palavra[56]="r";
        palavra[57]="s";
        palavra[58]="t";
        palavra[59]="u";
        palavra[60]="v";
        palavra[61]="w";
        palavra[62]="x";
        palavra[63]="y";
        palavra[64]="z";
        */
        //REGRAS 1
        
        regra1[0][0] = "p";
        regra1[0][1] = "";
        regra1[0][2] = "";
        regra1[0][3] = "q";
        regra1[0][4] = "<programa>";
        
        //REGAS 2
        
        regra2[0][0]="q";
        regra2[0][1]="(";
        regra2[0][2]="";
        regra2[0][3]="q(";
        regra2[0][4]="";
        
        regra2[1][0]="q";
        regra2[1][1]=")";
        regra2[1][2]="";
        regra2[1][3]="q)";
        regra2[1][4]="";
        
        regra2[2][0]="q";
        regra2[2][1]="defun";
        regra2[2][2]="";
        regra2[2][3]="qdefun";
        regra2[2][4]="";
        
        regra2[3][0]="q";
        regra2[3][1]="if";
        regra2[3][2]="";
        regra2[3][3]="qif";
        regra2[3][4]="";
        
        regra2[4][0]="q";
        regra2[4][1]="+";
        regra2[4][2]="";
        regra2[4][3]="q+";
        regra2[4][4]="";
        
        regra2[5][0]="q";
        regra2[5][1]="-";
        regra2[5][2]="";
        regra2[5][3]="q-";
        regra2[5][4]="";
        
        regra2[6][0]="q";
        regra2[6][1]="*";
        regra2[6][2]="";
        regra2[6][3]="q*";
        regra2[6][4]="";
        
        regra2[7][0]="q";
        regra2[7][1]="/";
        regra2[7][2]="";
        regra2[7][3]="q/";
        regra2[7][4]="";
        
        regra2[8][0]="q";
        regra2[8][1]="gt";
        regra2[8][2]="";
        regra2[8][3]="qgt";
        regra2[8][4]="";
        
        regra2[9][0]="q";
        regra2[9][1]="geq";
        regra2[9][2]="";
        regra2[9][3]="qgeq";
        regra2[9][4]="";
        
        regra2[10][0]="q";
        regra2[10][1]="leq";
        regra2[10][2]="";
        regra2[10][3]="qleq";
        regra2[10][4]="";
       
        regra2[11][0]="q";
        regra2[11][1]="eq";
        regra2[11][2]="";
        regra2[11][3]="qeq";
        regra2[11][4]="";
        
        regra2[12][0]="q";
        regra2[12][1]="and";
        regra2[12][2]="";
        regra2[12][3]="qand";
        regra2[12][4]="";
        
        regra2[13][0]="q";
        regra2[13][1]="or";
        regra2[13][2]="";
        regra2[13][3]="qor";
        regra2[13][4]="";
        
        regra2[14][0]="q";
        regra2[14][1]="neq";
        regra2[14][2]="";
        regra2[14][3]="qneq";
        regra2[14][4]="";
        
        regra2[15][0]="q";
        regra2[15][1]="not";
        regra2[15][2]="";
        regra2[15][3]="qnot";
        regra2[15][4]="";
        
        regra2[16][0]="q";
        regra2[16][1]="0";
        regra2[16][2]="";
        regra2[16][3]="q0";
        regra2[16][4]="";
        
        regra2[17][0]="q";
        regra2[17][1]="1";
        regra2[17][2]="";
        regra2[17][3]="q1";
        regra2[17][4]="";
        
        regra2[18][0]="q";
        regra2[18][1]="2";
        regra2[18][2]="";
        regra2[18][3]="q2";
        regra2[18][4]="";
        
        regra2[19][0]="q";
        regra2[19][1]="3";
        regra2[19][2]="";
        regra2[19][3]="q3";
        regra2[19][4]="";
        
        regra2[20][0]="q";
        regra2[20][1]="4";
        regra2[20][2]="";
        regra2[20][3]="q4";
        regra2[20][4]="";
        
        regra2[21][0]="q";
        regra2[21][1]="5";
        regra2[21][2]="";
        regra2[21][3]="q5";
        regra2[21][4]="";
        
        regra2[22][0]="q";
        regra2[22][1]="6";
        regra2[22][2]="";
        regra2[22][3]="q6";
        regra2[22][4]="";
       
        regra2[23][0]="q";
        regra2[23][1]="7";
        regra2[23][2]="";
        regra2[23][3]="q7";
        regra2[23][4]="";
        
        regra2[24][0]="q";
        regra2[24][1]="8";
        regra2[24][2]="";
        regra2[24][3]="q8";
        regra2[24][4]="";
        
        regra2[25][0]="q";
        regra2[25][1]="9";
        regra2[25][2]="";
        regra2[25][3]="q9";
        regra2[25][4]="";
        
        regra2[26][0]="q";
        regra2[26][1]="a";
        regra2[26][2]="";
        regra2[26][3]="qa";
        regra2[26][4]="";
        
        regra2[27][0]="q";
        regra2[27][1]="b";
        regra2[27][2]="";
        regra2[27][3]="qb";
        regra2[27][4]="";
        
        regra2[28][0]="q";
        regra2[28][1]="c";
        regra2[28][2]="";
        regra2[28][3]="qc";
        regra2[28][4]="";
        
        regra2[29][0]="q";
        regra2[29][1]="d";
        regra2[29][2]="";
        regra2[29][3]="qd";
        regra2[29][4]="";
        
        regra2[30][0]="q";
        regra2[30][1]="e";
        regra2[30][2]="";
        regra2[30][3]="qe";
        regra2[30][4]="";
        
        regra2[31][0]="q";
        regra2[31][1]="f";
        regra2[31][2]="";
        regra2[31][3]="qf";
        regra2[31][4]="";
        
        regra2[32][0]="q";
        regra2[32][1]="g";
        regra2[32][2]="";
        regra2[32][3]="qg";
        regra2[32][4]="";
        
        regra2[33][0]="q";
        regra2[33][1]="h";
        regra2[33][2]="";
        regra2[33][3]="qh";
        regra2[33][4]="";
       
        regra2[34][0]="q";
        regra2[34][1]="i";
        regra2[34][2]="";
        regra2[34][3]="qi";
        regra2[34][4]="";
        
        regra2[35][0]="q";
        regra2[35][1]="j";
        regra2[35][2]="";
        regra2[35][3]="qj";
        regra2[35][4]="";
        
        regra2[36][0]="q";
        regra2[36][1]="k";
        regra2[36][2]="";
        regra2[36][3]="qk";
        regra2[36][4]="";
       
        regra2[37][0]="q";
        regra2[37][1]="l";
        regra2[37][2]="";
        regra2[37][3]="ql";
        regra2[37][4]="";
        
        regra2[38][0]="q";
        regra2[38][1]="m";
        regra2[38][2]="";
        regra2[38][3]="qm";
        regra2[38][4]="";
        
        regra2[39][0]="q";
        regra2[39][1]="n";
        regra2[39][2]="";
        regra2[39][3]="qn";
        regra2[39][4]="";
        
        regra2[40][0]="q";
        regra2[40][1]="o";
        regra2[40][2]="";
        regra2[40][3]="qo";
        regra2[40][4]="";
        
        regra2[41][0]="q";
        regra2[41][1]="p";
        regra2[41][2]="";
        regra2[41][3]="qp";
        regra2[41][4]="";
        
        regra2[42][0]="q";
        regra2[42][1]="q";
        regra2[42][2]="";
        regra2[42][3]="qq";
        regra2[42][4]="";
        
        regra2[43][0]="q";
        regra2[43][1]="r";
        regra2[43][2]="";
        regra2[43][3]="qr";
        regra2[43][4]="";
        
        regra2[44][0]="q";
        regra2[44][1]="s";
        regra2[44][2]="";
        regra2[44][3]="qs";
        regra2[44][4]="";
        
        regra2[45][0]="q";
        regra2[45][1]="t";
        regra2[45][2]="";
        regra2[45][3]="qt";
        regra2[45][4]="";
       
        regra2[46][0]="q";
        regra2[46][1]="u";
        regra2[46][2]="";
        regra2[46][3]="qu";
        regra2[46][4]="";
        
        regra2[47][0]="q";
        regra2[47][1]="v";
        regra2[47][2]="";
        regra2[47][3]="qv";
        regra2[47][4]="";
        
        regra2[48][0]="q";
        regra2[48][1]="w";
        regra2[48][2]="";
        regra2[48][3]="qw";
        regra2[48][4]="";
        
        regra2[49][0]="q";
        regra2[49][1]="x";
        regra2[49][2]="";
        regra2[49][3]="qx";
        regra2[49][4]="";
        
        regra2[50][0]="q";
        regra2[50][1]="y";
        regra2[50][2]="";
        regra2[50][3]="qy";
        regra2[50][4]="";
        
        regra2[51][0]="q";
        regra2[51][1]="z";
        regra2[51][2]="";
        regra2[51][3]="qz";
        regra2[51][4]="";
        
        regra2[52][0]="q";
        regra2[52][1]=" ";
        regra2[52][2]="";
        regra2[52][3]="qEsp";
        regra2[52][4]="";
        
        regra2[53][0]="q";
        regra2[53][1]="#";
        regra2[53][2]="";
        regra2[53][3]="q#";
        regra2[53][4]="";
        
        regra2[54][0]="q";
        regra2[54][1]="lt";
        regra2[54][2]="";
        regra2[54][3]="qlt";
        regra2[54][4]="";
        
        //REGRA 3
        
        regra3[0][0] = "q(";
        regra3[0][1] = "";
        regra3[0][2] = "(";
        regra3[0][3] = "q";
        regra3[0][4] = "";
        
        regra3[1][0] = "q)";
        regra3[1][1] = "";
        regra3[1][2] = ")";
        regra3[1][3] = "q";
        regra3[1][4] = "";
        
        regra3[2][0] = "qdefun";
        regra3[2][1] = "";
        regra3[2][2] = "defun";
        regra3[2][3] = "q";
        regra3[2][4] = "";
        
        regra3[3][0] = "qif";
        regra3[3][1] = "";
        regra3[3][2] = "if";
        regra3[3][3] = "q";
        regra3[3][4] = "";
        
        regra3[4][0] = "q+";
        regra3[4][1] = "";
        regra3[4][2] = "+";
        regra3[4][3] = "q";
        regra3[4][4] = "";
        
        regra3[5][0] = "q-";
        regra3[5][1] = "";
        regra3[5][2] = "-";
        regra3[5][3] = "q";
        regra3[5][4] = "";
        
        regra3[6][0] = "q*";
        regra3[6][1] = "";
        regra3[6][2] = "*";
        regra3[6][3] = "q";
        regra3[6][4] = "";
        
        regra3[7][0] = "q/";
        regra3[7][1] = "";
        regra3[7][2] = "/";
        regra3[7][3] = "q";
        regra3[7][4] = "";
        
        regra3[8][0] = "qgt";
        regra3[8][1] = "";
        regra3[8][2] = "gt";
        regra3[8][3] = "q";
        regra3[8][4] = "";
        
        regra3[9][0] = "qgeq";
        regra3[9][1] = "";
        regra3[9][2] = "geq";
        regra3[9][3] = "q";
        regra3[9][4] = "";
        
        regra3[10][0] = "qleq";
        regra3[10][1] = "";
        regra3[10][2] = "leq";
        regra3[10][3] = "q";
        regra3[10][4] = "";
        
        regra3[11][0] = "qeq";
        regra3[11][1] = "";
        regra3[11][2] = "eq";
        regra3[11][3] = "q";
        regra3[11][4] = "";
        
        regra3[12][0] = "qand";
        regra3[12][1] = "";
        regra3[12][2] = "and";
        regra3[12][3] = "q";
        regra3[12][4] = "";
        
        regra3[13][0] = "qor";
        regra3[13][1] = "";
        regra3[13][2] = "or";
        regra3[13][3] = "q";
        regra3[13][4] = "";
        
        regra3[14][0] = "qneg";
        regra3[14][1] = "";
        regra3[14][2] = "neg";
        regra3[14][3] = "q";
        regra3[14][4] = "";
        
        regra3[15][0] = "qnot";
        regra3[15][1] = "";
        regra3[15][2] = "not";
        regra3[15][3] = "q";
        regra3[15][4] = "";
        
        regra3[16][0] = "q0";
        regra3[16][1] = "";
        regra3[16][2] = "0";
        regra3[16][3] = "q";
        regra3[16][4] = "";
        
        regra3[17][0] = "q1";
        regra3[17][1] = "";
        regra3[17][2] = "1";
        regra3[17][3] = "q";
        regra3[17][4] = "";
        
        regra3[18][0] = "q2";
        regra3[18][1] = "";
        regra3[18][2] = "2";
        regra3[18][3] = "q";
        regra3[18][4] = "";
        
        regra3[19][0] = "q3";
        regra3[19][1] = "";
        regra3[19][2] = "3";
        regra3[19][3] = "q";
        regra3[19][4] = "";
        
        regra3[20][0] = "q4";
        regra3[20][1] = "";
        regra3[20][2] = "4";
        regra3[20][3] = "q";
        regra3[20][4] = "";
        
        regra3[21][0] = "q5";
        regra3[21][1] = "";
        regra3[21][2] = "5";
        regra3[21][3] = "q";
        regra3[21][4] = "";
        
        regra3[22][0] = "q6";
        regra3[22][1] = "";
        regra3[22][2] = "6";
        regra3[22][3] = "q";
        regra3[22][4] = "";
        
        regra3[23][0] = "q7";
        regra3[23][1] = "";
        regra3[23][2] = "7";
        regra3[23][3] = "q";
        regra3[23][4] = "";
        
        regra3[24][0] = "q8";
        regra3[24][1] = "";
        regra3[24][2] = "8";
        regra3[24][3] = "q";
        regra3[24][4] = "";
        
        regra3[25][0] = "q9";
        regra3[25][1] = "";
        regra3[25][2] = "9";
        regra3[25][3] = "q";
        regra3[25][4] = "";
        
        regra3[26][0] = "qa";
        regra3[26][1] = "";
        regra3[26][2] = "a";
        regra3[26][3] = "q";
        regra3[26][4] = "";
        
        regra3[27][0] = "qb";
        regra3[27][1] = "";
        regra3[27][2] = "b";
        regra3[27][3] = "q";
        regra3[27][4] = "";
        
        regra3[28][0] = "qc";
        regra3[28][1] = "";
        regra3[28][2] = "c";
        regra3[28][3] = "q";
        regra3[28][4] = "";
        
        regra3[29][0] = "qd";
        regra3[29][1] = "";
        regra3[29][2] = "d";
        regra3[29][3] = "q";
        regra3[29][4] = "";
        
        regra3[30][0] = "qe";
        regra3[30][1] = "";
        regra3[30][2] = "e";
        regra3[30][3] = "q";
        regra3[30][4] = "";
        
        regra3[31][0] = "qf";
        regra3[31][1] = "";
        regra3[31][2] = "f";
        regra3[31][3] = "q";
        regra3[31][4] = "";
        
        regra3[32][0] = "qg";
        regra3[32][1] = "";
        regra3[32][2] = "g";
        regra3[32][3] = "q";
        regra3[32][4] = "";
        
        regra3[33][0] = "qh";
        regra3[33][1] = "";
        regra3[33][2] = "h";
        regra3[33][3] = "q";
        regra3[33][4] = "";
        
        regra3[34][0] = "qi";
        regra3[34][1] = "";
        regra3[34][2] = "i";
        regra3[34][3] = "q";
        regra3[34][4] = "";
        
        regra3[35][0] = "qj";
        regra3[35][1] = "";
        regra3[35][2] = "j";
        regra3[35][3] = "q";
        regra3[35][4] = "";
        
        regra3[36][0] = "qk";
        regra3[36][1] = "";
        regra3[36][2] = "k";
        regra3[36][3] = "q";
        regra3[36][4] = "";
        
        regra3[37][0] = "ql";
        regra3[37][1] = "";
        regra3[37][2] = "l";
        regra3[37][3] = "q";
        regra3[37][4] = "";
        
        regra3[38][0] = "qm";
        regra3[38][1] = "";
        regra3[38][2] = "m";
        regra3[38][3] = "q";
        regra3[38][4] = "";
        
        regra3[39][0] = "qn";
        regra3[39][1] = "";
        regra3[39][2] = "n";
        regra3[39][3] = "q";
        regra3[39][4] = "";
        
        regra3[40][0] = "qo";
        regra3[40][1] = "";
        regra3[40][2] = "o";
        regra3[40][3] = "q";
        regra3[40][4] = "";
        
        regra3[41][0] = "qp";
        regra3[41][1] = "";
        regra3[41][2] = "p";
        regra3[41][3] = "q";
        regra3[41][4] = "";
        
        regra3[42][0] = "qq";
        regra3[42][1] = "";
        regra3[42][2] = "q";
        regra3[42][3] = "q";
        regra3[42][4] = "";
        
        regra3[43][0] = "qr";
        regra3[43][1] = "";
        regra3[43][2] = "r";
        regra3[43][3] = "q";
        regra3[43][4] = "";
        
        regra3[44][0] = "qs";
        regra3[44][1] = "";
        regra3[44][2] = "s";
        regra3[44][3] = "q";
        regra3[44][4] = "";
        
        regra3[45][0] = "qt";
        regra3[45][1] = "";
        regra3[45][2] = "t";
        regra3[45][3] = "q";
        regra3[45][4] = "";
        
        regra3[46][0] = "qu";
        regra3[46][1] = "";
        regra3[46][2] = "u";
        regra3[46][3] = "q";
        regra3[46][4] = "";
        
        regra3[47][0] = "qv";
        regra3[47][1] = "";
        regra3[47][2] = "v";
        regra3[47][3] = "q";
        regra3[47][4] = "";
        
        regra3[48][0] = "qw";
        regra3[48][1] = "";
        regra3[48][2] = "w";
        regra3[48][3] = "q";
        regra3[48][4] = "";
        
        regra3[49][0] = "qx";
        regra3[49][1] = "";
        regra3[49][2] = "x";
        regra3[49][3] = "q";
        regra3[49][4] = "";
        
        regra3[50][0] = "qy";
        regra3[50][1] = "";
        regra3[50][2] = "y";
        regra3[50][3] = "q";
        regra3[50][4] = "";
        
        regra3[51][0] = "qz";
        regra3[51][1] = "";
        regra3[51][2] = "z";
        regra3[51][3] = "q";
        regra3[51][4] = "";
        
        regra3[52][0] = "qEsp";
        regra3[52][1] = "";
        regra3[52][2] = " ";
        regra3[52][3] = "q";
        regra3[52][4] = "";
        
        regra3[52][0] = "q#";
        regra3[52][1] = "";
        regra3[52][2] = "#";
        regra3[52][3] = "q";
        regra3[52][4] = "";
        
        // REGRA 4
        
        regra4[0][0] = "qσ";
        regra4[0][1] = "";
        regra4[0][2] = "<programa>";
        regra4[0][3] = "qσ";
        regra4[0][4] = "<lista-de-funcoes>";

        regra4[1][0] = "qσ";
        regra4[1][1] = "";
        regra4[1][2] = "<lista-de-funcoes>";
        regra4[1][3] = "qσ";
        regra4[1][4] = "<funcao><lf>";

        regra4[2][0] = "qσ";
        regra4[2][1] = "";
        regra4[2][2] = "<lf>";
        regra4[2][3] = "qσ";
        regra4[2][4] = "<funcao><lf>";

        regra4[3][0] = "qσ";
        regra4[3][1] = "";
        regra4[3][2] = "<lf>";
        regra4[3][3] = "qσ";
        regra4[3][4] = "";

        regra4[4][0] = "q(";
        regra4[4][1] = "";
        regra4[4][2] = "<funcao>";
        regra4[4][3] = "q(";
        regra4[4][4] = "(defun <id> (<params>) <corpo>))";

        regra4[5][0] = "q(";
        regra4[5][1] = "";
        regra4[5][2] = "<corpo>";
        regra4[5][3] = "q(";
        regra4[5][4] = "(if <cond> <corpo> <corpo>)";

        regra4[6][0] = "q(";
        regra4[6][1] = "";
        regra4[6][2] = "<corpo>";
        regra4[6][3] = "q(";
        regra4[6][4] = "(<id> <corpo>)";

        regra4[7][0] = "qσ";
        regra4[7][1] = "";
        regra4[7][2] = "<corpo>";
        regra4[7][3] = "qσ";
        regra4[7][4] = "<exp>";

        regra4[8][0] = "qσ";
        regra4[8][1] = "";
        regra4[8][2] = "<params>";
        regra4[8][3] = "qσ";
        regra4[8][4] = "<p>";

        regra4[9][0] = "qσ";
        regra4[9][1] = "";
        regra4[9][2] = "<p>";
        regra4[9][3] = "qσ";
        regra4[9][4] = "<id><p>";

        regra4[10][0] = "qσ";
        regra4[10][1] = "";
        regra4[10][2] = "<p>";
        regra4[10][3] = "qσ";
        regra4[10][4] = "";

        regra4[11][0] = "qσ";
        regra4[11][1] = "";
        regra4[11][2] = "<exp>";
        regra4[11][3] = "qσ";
        regra4[11][4] = "<num>";

        regra4[12][0] = "qσ";
        regra4[12][1] = "";
        regra4[12][2] = "<exp>";
        regra4[12][3] = "qσ";
        regra4[12][4] = "<id>";

        regra4[13][0] = "q(";
        regra4[13][1] = "";
        regra4[13][2] = "<exp>";
        regra4[13][3] = "q(";
        regra4[13][4] = "(+ <exp> <exp>)";

        regra4[14][0] = "q(";
        regra4[14][1] = "";
        regra4[14][2] = "<exp>";
        regra4[14][3] = "q(";
        regra4[14][4] = "(- <exp> <exp>)";

        regra4[15][0] = "q(";
        regra4[15][1] = "";
        regra4[15][2] = "<exp>";
        regra4[15][3] = "q(";
        regra4[15][4] = "(* <exp> <exp>)";

        regra4[16][0] = "q(";
        regra4[16][1] = "";
        regra4[16][2] = "<exp>";
        regra4[16][3] = "q(";
        regra4[16][4] = "(/ <exp> <exp>)";

        regra4[17][0] = "q(";
        regra4[17][1] = "";
        regra4[17][2] = "<cond>";
        regra4[17][3] = "q(";
        regra4[17][4] = "(gt <exp> <exp>)";

        regra4[18][0] = "q(";
        regra4[18][1] = "";
        regra4[18][2] = "<cond>";
        regra4[18][3] = "q(";
        regra4[18][4] = "(lt <exp> <exp>)";

        regra4[19][0] = "q(";
        regra4[19][1] = "";
        regra4[19][2] = "<cond>";
        regra4[19][3] = "q(";
        regra4[19][4] = "(geq <exp> <exp>)";

        regra4[20][0] = "q(";
        regra4[20][1] = "";
        regra4[20][2] = "<cond>";
        regra4[20][3] = "q(";
        regra4[20][4] = "(leq <exp> <exp>)";

        regra4[21][0] = "q(";
        regra4[21][1] = "";
        regra4[21][2] = "<cond>";
        regra4[21][3] = "q(";
        regra4[21][4] = "(eq <exp> <exp>)";

        regra4[22][0] = "q(";
        regra4[22][1] = "";
        regra4[22][2] = "<cond>";
        regra4[22][3] = "q(";
        regra4[22][4] = "(neq <exp> <exp>)";

        regra4[23][0] = "q(";
        regra4[23][1] = "";
        regra4[23][2] = "<cond>";
        regra4[23][3] = "q(";
        regra4[23][4] = "(not <exp> <exp>)";

        regra4[24][0] = "q(";
        regra4[24][1] = "";
        regra4[24][2] = "<cond>";
        regra4[24][3] = "q(";
        regra4[24][4] = "(and <exp> <exp>)";

        regra4[25][0] = "q(";
        regra4[25][1] = "";
        regra4[25][2] = "<cond>";
        regra4[25][3] = "q(";
        regra4[25][4] = "(or <exp> <exp>)";

        regra4[26][0] = "qσ";
        regra4[26][1] = "";
        regra4[26][2] = "<num>";
        regra4[26][3] = "qσ";
        regra4[26][4] = "<digito><nn>";

        regra4[27][0] = "qσ";
        regra4[27][1] = "";
        regra4[27][2] = "<nn>";
        regra4[27][3] = "qσ";
        regra4[27][4] = "<digito><nn>";

        regra4[28][0] = "qσ";
        regra4[28][1] = "";
        regra4[28][2] = "<nn>";
        regra4[28][3] = "qσ";
        regra4[28][4] = "";

        regra4[29][0] = "qσ";
        regra4[29][1] = "";
        regra4[29][2] = "<id>";
        regra4[29][3] = "qσ";
        regra4[29][4] = "<letra><n>";

        regra4[30][0] = "qσ";
        regra4[30][1] = "";
        regra4[30][2] = "<n>";
        regra4[30][3] = "qσ";
        regra4[30][4] = "<digito><n>";

        regra4[31][0] = "qσ";
        regra4[31][1] = "";
        regra4[31][2] = "<n>";
        regra4[31][3] = "qσ";
        regra4[31][4] = "<letra><n>";


        regra4[32][0] = "qσ";
        regra4[32][1] = "";
        regra4[32][2] = "<n>";
        regra4[32][3] = "qσ";
        regra4[32][4] = "";

        regra4[33][0] = "q0";
        regra4[33][1] = "";
        regra4[33][2] = "<digito>";
        regra4[33][3] = "q0";
        regra4[33][4] = "0";

        regra4[34][0] = "q1";
        regra4[34][1] = "";
        regra4[34][2] = "<digito>";
        regra4[34][3] = "q1";
        regra4[34][4] = "1";

        regra4[35][0] = "q2";
        regra4[35][1] = "";
        regra4[35][2] = "<digito>";
        regra4[35][3] = "q2";
        regra4[35][4] = "2";

        regra4[36][0] = "q3";
        regra4[36][1] = "";
        regra4[36][2] = "<digito>";
        regra4[36][3] = "q3";
        regra4[36][4] = "3";

        regra4[37][0] = "q4";
        regra4[37][1] = "";
        regra4[37][2] = "<digito>";
        regra4[37][3] = "q4";
        regra4[37][4] = "4";

        regra4[38][0] = "q5";
        regra4[38][1] = "";
        regra4[38][2] = "<digito>";
        regra4[38][3] = "q5";
        regra4[38][4] = "5";


        regra4[39][0] = "q6";
        regra4[39][1] = "";
        regra4[39][2] = "<digito>";
        regra4[39][3] = "q6";
        regra4[39][4] = "6";

        regra4[40][0] = "q7";
        regra4[40][1] = "";
        regra4[40][2] = "<digito>";
        regra4[40][3] = "q7";
        regra4[40][4] = "7";

        regra4[41][0] = "q8";
        regra4[41][1] = "";
        regra4[41][2] = "<digito>";
        regra4[41][3] = "q8";
        regra4[41][4] = "8";

        regra4[42][0] = "q9";
        regra4[42][1] = "";
        regra4[42][2] = "<digito>";
        regra4[42][3] = "q9";
        regra4[42][4] = "9";

        regra4[43][0] = "qa";
        regra4[43][1] = "";
        regra4[43][2] = "<letra>";
        regra4[43][3] = "qa";
        regra4[43][4] = "a";

        regra4[44][0] = "qb";
        regra4[44][1] = "";
        regra4[44][2] = "<letra>";
        regra4[44][3] = "qb";
        regra4[44][4] = "b";

        regra4[45][0] = "qc";
        regra4[45][1] = "";
        regra4[45][2] = "<letra>";
        regra4[45][3] = "qc";
        regra4[45][4] = "c";

        regra4[46][0] = "qd";
        regra4[46][1] = "";
        regra4[46][2] = "<letra>";
        regra4[46][3] = "qd";
        regra4[46][4] = "d";

        regra4[47][0] = "qe";
        regra4[47][1] = "";
        regra4[47][2] = "<letra>";
        regra4[47][3] = "qe";
        regra4[47][4] = "e";

        regra4[48][0] = "qf";
        regra4[48][1] = "";
        regra4[48][2] = "<letra>";
        regra4[48][3] = "qf";
        regra4[48][4] = "f";

        regra4[49][0] = "qg";
        regra4[49][1] = "";
        regra4[49][2] = "<letra>";
        regra4[49][3] = "qg";
        regra4[49][4] = "g";

        regra4[50][0] = "qh";
        regra4[50][1] = "";
        regra4[50][2] = "<letra>";
        regra4[50][3] = "qh";
        regra4[50][4] = "h";

        regra4[51][0] = "qi";
        regra4[51][1] = "";
        regra4[51][2] = "<letra>";
        regra4[51][3] = "qi";
        regra4[51][4] = "i";

        regra4[52][0] = "qj";
        regra4[52][1] = "";
        regra4[52][2] = "<letra>";
        regra4[52][3] = "qj";
        regra4[52][4] = "j";

        regra4[53][0] = "qk";
        regra4[53][1] = "";
        regra4[53][2] = "<letra>";
        regra4[53][3] = "qk";
        regra4[53][4] = "k";

        regra4[54][0] = "ql";
        regra4[54][1] = "";
        regra4[54][2] = "<letra>";
        regra4[54][3] = "ql";
        regra4[54][4] = "l";

        regra4[55][0] = "qm";
        regra4[55][1] = "";
        regra4[55][2] = " <letra>";
        regra4[55][3] = "qm";
        regra4[55][4] = "m";

        regra4[56][0] = "qn";
        regra4[56][1] = "";
        regra4[56][2] = " <letra>";
        regra4[56][3] = "qn";
        regra4[56][4] = "n";

        regra4[57][0] = "qo";
        regra4[57][1] = "";
        regra4[57][2] = " <letra>";
        regra4[57][3] = "qo";
        regra4[57][4] = "o";

        regra4[58][0] = "qp";
        regra4[58][1] = "";
        regra4[58][2] = " <letra>";
        regra4[58][3] = "qp";
        regra4[58][4] = "p";

        regra4[59][0] = "qq";
        regra4[59][1] = "";
        regra4[59][2] = " <letra>";
        regra4[59][3] = "qq";
        regra4[59][4] = "q";

        regra4[60][0] = "qr";
        regra4[60][1] = "";
        regra4[60][2] = " <letra>";
        regra4[60][3] = "qr";
        regra4[60][4] = "r";

        regra4[61][0] = "qs";
        regra4[61][1] = "";
        regra4[61][2] = " <letra>";
        regra4[61][3] = "qs";
        regra4[61][4] = "s";

        regra4[62][0] = "qt";
        regra4[62][1] = "";
        regra4[62][2] = " <letra>";
        regra4[62][3] = "qt";
        regra4[62][4] = "t";

        regra4[63][0] = "qu";
        regra4[63][1] = "";
        regra4[63][2] = " <letra>";
        regra4[63][3] = "qu";
        regra4[63][4] = "u";

        regra4[64][0] = "qv";
        regra4[64][1] = "";
        regra4[64][2] = " <letra>";
        regra4[64][3] = "qv";
        regra4[64][4] = "v";

        regra4[65][0] = "qw";
        regra4[65][1] = "";
        regra4[65][2] = " <letra>";
        regra4[65][3] = "qw";
        regra4[65][4] = "w";

        regra4[66][0] = "qx";
        regra4[66][1] = "";
        regra4[66][2] = " <letra>";
        regra4[66][3] = "qx";
        regra4[66][4] = "x";

        regra4[67][0] = "qy";
        regra4[67][1] = "";
        regra4[67][2] = " <letra>";
        regra4[67][3] = "qy";
        regra4[67][4] = "y";

        regra4[68][0] = "qz";
        regra4[68][1] = "";
        regra4[68][2] = " <letra>";
        regra4[68][3] = "qz";
        regra4[68][4] = "z";
        
        regra4[69][0] = "q#";
        regra4[69][1] = "";
        regra4[69][2] = "#";
        regra4[69][3] = "q#";
        regra4[69][4] = "#";
        
}
}
