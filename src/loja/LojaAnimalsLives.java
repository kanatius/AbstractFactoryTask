/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import animais.Peixe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natan
 */
public class LojaAnimalsLives implements LojaDeAnimais{

    @Override
    public Animal comprarGato() {
        List<String> cores = new ArrayList<String>();
        cores.add("preto");
        return (Animal) new Gato("", cores, "Bombaim");
    }

    @Override
    public Animal comprarCachorro() {
        List<String> cores = new ArrayList<String>();
        cores.add("preto");
        cores.add("branco");
        return (Animal) new Cachorro("", cores, "Husky Siberiano");
    }

    @Override
    public Animal comprarPeixe() {
        List<String> cores = new ArrayList<String>();
        cores.add("laranja");
        cores.add("branco");
        return (Animal) new Peixe("", cores, "Kinguio", "Fria - Ph alcalino - doce");
    }
    
}
