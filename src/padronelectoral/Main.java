/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padronelectoral;

import Models.MapaCodigoElectoral;
import control.Lock;
import controlador.Estadisticas;
import controlador.Iterador;
import controlador.Procesador;
import vista.Impresor;

/**
 *
 * @author luisza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MapaCodigoElectoral est = MapaCodigoElectoral.getInstance();
        est.cargar_codigo_electoral("Distelec.txt");
        Lock lockEst = new Lock();
        
        Iterador iter = new Iterador("PADRON_COMPLETO.txt");
        Estadisticas estadistica = new Estadisticas(lockEst);
        Procesador procesa = new Procesador(iter, estadistica, 10);
        procesa.start();
        procesa.join();
        Impresor imprime = new Impresor();
        imprime.imprimir_estadisticas(estadistica,
                "resultado.txt");
        
        
    }
    
}
