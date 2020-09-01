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
public class SimuladorBatalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje[] arregloPersonaje = new Personaje[2];
        arregloPersonaje[0] = new Arquero();
        arregloPersonaje[1] = new Guerrero();
        int vidaMonstruo=60;
        
        while(vidaMonstruo>0){
       for(Personaje character: arregloPersonaje){
           if (character instanceof Arquero &&((Arquero)character).getVida()>0 &&  ((Arquero)character).getFlechas()>0){
               int daño1=((Arquero)character).Ataque();
               int daño2=((Arquero)character).LluviaFlechas();
               System.out.println("\nEl arquero hace "+daño1+" de daño con ataque normal");
               System.out.println("El arquero hace "+daño2+" de daño con Lluvia de Flechas");
               vidaMonstruo=vidaMonstruo-daño1-daño2;
               System.out.println("El arquero recibe "+((Arquero)character).Daño()+" de daño");
               System.out.println("El arquero tiene "+((Arquero)character).getVida()+" de vida");
               System.out.println("El arquero tiene "+((Arquero)character).getFlechas()+" flechas");
               System.out.println("\nEl monstruo tiene "+ vidaMonstruo +" de vida");
           } 
           
           if (character instanceof Guerrero &&((Guerrero)character).getVida()>0 &&  ((Guerrero)character).getStamina()>0) {
               int daño1 =((Guerrero)character).Ataque();
               int daño2 =((Guerrero)character).Berseker();
               System.out.println("\nEl guerrero hace "+daño1+" de daño con ataque normal");
               System.out.println("El guerrero hace "+daño2+" de daño con Berseker");
               vidaMonstruo=vidaMonstruo-daño1-daño2;
               System.out.println("El guerrero recibe "+((Guerrero)character).Daño()+" de daño");
               System.out.println("El guerrero tiene "+((Guerrero)character).getVida()+" de vida");
               System.out.println("El guerrero tiene "+((Guerrero)character).getStamina()+" de Stamina");
               System.out.println("\nEl monstruo tiene "+ vidaMonstruo +" de vida");
           } 
                   
       }
       
    }
     System.out.println("El monstruo ha muerto\n VICTORIA");
}
    
}
