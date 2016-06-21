/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author luisza
 */
public class InformacionEstadistica {
   
    public int masculino;
    public int femenino;
    public int total;

    public InformacionEstadistica() {
        masculino = femenino = total = 0;
    }

    public void agregar(int masculino, int femenino, int total) {
        this.masculino += masculino;
        this.femenino += femenino;
        this.total += total;
    }
    
    public void agregar1(int genero){
        if(genero == 2 ){
            femenino += 1;
        }else{
            masculino +=1;
        }
        
        total += 1;
    }
  
}
