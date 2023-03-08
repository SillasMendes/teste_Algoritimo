import jdk.jshell.execution.Util;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {

       String entrada = showInputDialog("DIGITE UMA FRASE");

       id saida = new id();
       saida.frase(entrada);

       /**Teste logico 01 - Remover preposições "a", "ante", "ate", "apos", "com", "contra", "de", "desde", "desde", "em", "entre",
        "para", "pra", "perante", "por", "per", "sem", "sob", "sobre", "tras", "da", "do" */
        String[] preposicao = new String[]{entrada.replaceAll("a,ante,ate,apos,com,contra,de,desde,desde,em,entre,para,pra,perante,por,per,sem,sob,sobre,tras,da,do", "")};
        for (String prepo : preposicao){
            JOptionPane.showMessageDialog(null,prepo,"RESULTADO - REMOVER PREPOSIÇÃO",1);
        };

        /**Teste logico 02 - Remover artigos "o", "os", "a", "as", "um", "uns", "uma", "umas"*/
        String[] artigo = new String[]{entrada.replaceAll("o,os,a,as,um,uns,uma,umas","-")};
        for (String art : artigo){
            JOptionPane.showMessageDialog(null,art,"RESULTADO - REMOVER ARTIGOS",1);
        };

        /**Teste logico 03 - Remover conjução 'e'*/
        String[] conjucao = new String[]{entrada.replaceAll("e","***")};
        for (String prepo : conjucao){
            JOptionPane.showMessageDialog(null,prepo,"RESULTADO - REMOVER CONJUÇÃO 'e':",1);
        };

        /**Teste logico 05 - primeira letra de todas as palavras após a primeira deve ser maiúscula */
        String SemEspacoo = entrada.replaceAll(" ","");
        System.out.println((SemEspacoo.toUpperCase())); /** nao consegui usar o método do WordUtils.capitalize*/

        /**Teste logico 06 - Remover espaço e concatenar _t */
        String sufixo = "_t";
        String SemEspaco = entrada.replaceAll(" ","");
        JOptionPane.showMessageDialog(null,SemEspaco+sufixo, "Remover espaço e concatenar _t",3);




        /**Teste logico 08 e 09 - retornar vazio*/
        if (entrada==null) {
            JOptionPane.showMessageDialog(null,"","MESAGEM EM BRANCO",3);
        }else{
            System.out.println("");
        }

       }


}