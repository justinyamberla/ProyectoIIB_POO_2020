/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.iib;

/**
 *
 * @author Usuario
 */
public class Arquero extends Personaje{
    
    private int vida= 20;
    private int flechas= 50;
    
    public int LluviaFlechas(){
        int dañoCausado= (int) (Math.random()*6+3);
        flechas=flechas-1;
        return dañoCausado;
    }
    
    @Override
    public int Ataque(){
        int dañoCausado= (int) (Math.random()*6);
        flechas=flechas-1;
        return dañoCausado;
    }
    
    @Override
    public int Daño(){
        int dañoRecibido= (int) (Math.random()*6);
        vida=vida-dañoRecibido;
        return dañoRecibido;
    }

    public int getVida() {
        return vida;
    }

    public int getFlechas() {
        return flechas;
    }
    
    
}
