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
public class Guerrero extends Personaje{
    
    private int vida = 50;
    
    private int stamina = 100;
    
    public int Berseker (){
        int dañoCausado= (int) (Math.random()*6+9);
        stamina=stamina-20;
        return dañoCausado;
    }
    
    @Override
    public int Ataque(){
        int dañoCausado= (int) (Math.random()*6+3);
        stamina=stamina-10;
        return dañoCausado;
    }
    
    @Override
    public int Daño(){
        int dañoRecibido= (int) (Math.random()*8);
        vida=vida-dañoRecibido;
        return dañoRecibido;
    }

    public int getVida() {
        return vida;
    }

    public int getStamina() {
        return stamina;
    }
    
    
}
