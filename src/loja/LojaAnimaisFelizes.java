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
public class LojaAnimaisFelizes implements LojaDeAnimais{

    @Override
    public Animal comprarGato() {
        List<String> cores = new ArrayList<String>();
        cores.add("laranja");
        cores.add("branco");
        return (Animal) new Gato("", cores, "Siberiano");
    }

    @Override
    public Animal comprarCachorro() {
        List<String> cores = new ArrayList<String>();
        cores.add("preto");
        cores.add("laranja");
        return (Animal) new Cachorro("", cores, "Pastor Alemão");
    }

    @Override
    public Animal comprarPeixe() {
        List<String> cores = new ArrayList<String>();
        cores.add("vermelho");
        cores.add("azul");
        return (Animal) new Peixe("",cores, "Tetra Neon", "ph ácido(4.0 - 5.0) - doce - 24º a 30º");
    }
    
}
