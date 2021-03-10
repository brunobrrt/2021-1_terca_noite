package br.uninove.poo;

public class Principal {
    
    public static void main(String[] args) {
        //System.out.println("Palavra \"1\"");
        //System.out.println("Palavra \\ \"2\"");
        
        //Declaração de variáveis:
//        int x;
//        boolean y = true;
//        char c = 'S';
//        float numeroReal;
//        long longo;
//        double d;
//        String texto = "Oi eu sou um texto";
        Pessoa p1 = new Pessoa();
        p1.nome = "Josefino";
        p1.idade = 33;
       
        System.out.println("Olá " + p1.nome);
        System.out.println("Vi que você tem " + p1.idade + " anos! Da hora!");
        
    }
}

/*
TODO objeto tem três coisas: 
 - Nome, --> Nome da classe
 - Carcterístias, --> Atributos
 - Comportmanetos --> Métodos
*/