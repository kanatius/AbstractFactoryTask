/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorytak_arquiteturadesoftware;

import animais.Animal;
import loja.LojaAnimaisFelizes;
import loja.LojaAnimalsLives;
import loja.LojaDeAnimais;

/**
 *
 * @author natan
 */
public class Main {
    public static void main(String[] args) {
        
        LojaDeAnimais lojaAF = new LojaAnimaisFelizes();
        LojaDeAnimais lojaAL = new LojaAnimalsLives();
        
        Animal peixe1 = lojaAF.comprarPeixe();
        Animal gato1 = lojaAF.comprarGato();
        Animal cachorro1 = lojaAF.comprarCachorro();
                
        Animal peixe2 = lojaAL.comprarPeixe();
        Animal gato2 = lojaAL.comprarGato();
        Animal cachorro2 = lojaAL.comprarCachorro();
        
        System.out.println("--------------------------");
        System.out.println(peixe1.getDetalhes() + "\n");
        System.out.println(gato1.getDetalhes() + "\n");
        System.out.println(cachorro1.getDetalhes() + "\n");
        
        System.out.println("--------------------------");
        System.out.println(peixe2.getDetalhes() + "\n");
        System.out.println(gato2.getDetalhes() + "\n");
        System.out.println(cachorro2.getDetalhes() + "\n");
    }
}
