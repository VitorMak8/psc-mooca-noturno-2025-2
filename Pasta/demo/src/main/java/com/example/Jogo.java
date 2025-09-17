package com.example;

public class Jogo {
    public static void main(String[] args) {
        Personagem cacador = new  Personagem("Danilo" ,1,1,1);
        Personagem soneca = new Personagem("Marcos" ,2,2,1);

        
      

        while(true){
        cacador.cacar();
        soneca.dormir();
        cacador.comer();
        soneca.dormir();
        cacador.dormir();
        soneca.dormir();
        cacador.cacar();
        cacador.cacar();
        soneca.comer();
        cacador.cacar();
        soneca.cacar();

        System.out.println("----------------------");
        try {
            Thread.sleep(2000);

        }   catch (InterruptedException ex) {

        }
        
    }

}
}       
