/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JTextArea;
import main.Main;

/**
 *  * @author Jean Carlo Massami Yamada
 *
 * Classe ControladorServerGui é apenas uma classe intermediaria que tenho costume de fazer por boas praticas.
 * As classes Server e Connection iram fazer uso desta classe.
 * 
 * A idéia é que tanto o objeto da interface gráfica ServerGui e o objeto Server estejam estanciados estaticamente na Main.
 * E então a invocação dos métodos do objeto ServerGui irá ocorrer nesta classe ControladorServerGui por seus métodos estáticos.
 * 
 * Por enquanto foi apenas utilizado métodos para inserfir informações na interface gráfica.
 */
public class ControladorServerGui {

    public static JTextArea getjTextAreaConnection() {
        return Main.serverGui.getjTextAreaConnection();
    }

    public static JTextArea getTextAreaRmi(){
        return Main.serverGui.getjTextAreaRmi();
    }
}
