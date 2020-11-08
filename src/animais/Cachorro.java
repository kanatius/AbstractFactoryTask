/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import java.util.List;

/**
 *
 * @author natan
 */
public class Cachorro implements Animal{

    private String nome;
    private List<String> cores;
    private String raca;

    public Cachorro(String nome, List<String> cores, String raca) {
        this.nome = nome;
        this.cores = cores;
        this.raca = raca;
    }
    
    public String getNome() {
        return this.nome;
    }

    @Override
    public List<String> getCores() {
        return this.cores;
    }

    @Override
    public String getRaca() {
        return this.raca;
    }

    @Override
    public String getAnimal() {
        return "Cachorro";
    }
    @Override
    public String getDetalhes(){
        
        String cores = "";
        
        for(String cor : this.cores){
            cores += cor + " ";
        }
        
        return "Animal: " + this.getAnimal() + "\n" + "Raça: " + this.getRaca() + "\nCores: " + cores;
    }
}
