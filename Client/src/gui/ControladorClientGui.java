/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import main.Main;

/**
 * @author Jean Carlo Massami Yamada
 *
 * Aplicação desenvolvida como trabalho final da disiciplina de Computação
 * Distrubuida ministrada por Dr.Prof. Milton Hirokazu Shimabukuro do curso de
 * Ciências da Computação da UNESP(Universidade Estadual Paulista) "Júlio
 * Mesquita Filho" - Câmpus de Presidente Prudente. Com o intuito de concretizar
 * o aprendizado da matéria, o bjetivo da aplicação é ter um servidor que irá
 * invocar métodos remotos (RMI (Remote Method Invocation)) para atender
 * requisições de seus clientes conectados via TCP.
 */

/**
 *  * @author Jean Carlo Massami Yamada
 *
 * Classe ControladorClientGui é apenas uma classe intermediaria que tenho costume de fazer por boas praticas.
 * A interface classe Client irá fazer uso desta classe.
 * 
 * A idéia é que tanto o objeto da interface gráfica ClientGui e o objeto Client estejam estanciados estaticamente na Main.
 * E então a invocação dos métodos do objeto ClientGui irá ocorrer nesta classe ControladorClientGui por seus métodos estáticos.
 * 
 * Por enquanto foi apenas utilizado métodos para inserfir informações na interface gráfica.
 */
public class ControladorClientGui {

    public static JFormattedTextField getjFormattedTextFieldResult() {
        return Main.clientGui.getjFormattedTextFieldResult();
    }
    
    public static JTextArea getTextArea(){
        return Main.clientGui.getjTextAreaClient();
    }
}
