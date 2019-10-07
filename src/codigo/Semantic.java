/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Vector;
import arbol.*;
import java.awt.Color;
import javax.swing.JTextArea;

/**
 *
 * @author kvnsnchz
 */
public class Semantic {
    private Vector<String> errores;
    static int numSent;
    public Semantic() {
        errores = new Vector<String>();
        numSent = 0;
    }
    
    public void analizar(NodoBase raiz, TablaSimbolos tablaS) {
        errores.clear();
        
        while (raiz != null) {
            
            if (raiz instanceof  NodoAsignacion){
                ElementoTablaS elem = tablaS.buscar(((NodoAsignacion)raiz).getIdentificador());
                if(!(elem != null && elem.getNumSent() <= numSent)){
                    errores.add("La variable "+((NodoAsignacion)raiz).getIdentificador()+" no ha sido definida.");
                }
            }
                          
            numSent++;
            
            if (raiz instanceof  NodoPrograma){
              analizar(((NodoPrograma)raiz).getSegmento(), tablaS);
            }
            
            raiz = raiz.getHermanoD();
        }
    }
    
    public void imprimir(JTextArea txt){
        txt.setText("");
        
        if(errores.size() == 0){
            txt.setText("Analisis Realizado con Exito");
            txt.setForeground(new Color(25, 111, 61));
        }
        else{
            for(int i=0; i<errores.size(); i++){
                txt.append(errores.get(i));
            }
            
            txt.setForeground(Color.red);
        }
    }
}
