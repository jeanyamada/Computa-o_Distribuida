/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

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
 * Classe ControladorRmi é apenas uma classe intermediaria que tenho costume de fazer por boas praticas.
 * A interface gráfica ServerGui irá fazer uso desta classe.
 * 
 * A idéia é que tanto o objeto da interface gráfica ServerGui e o objeto ServerRmi estejam estanciados estaticamente na Main.
 * E então a invocação dos métodos do objeto ServerRmi irá ocorrer nesta classe por seus métodos estáticos.
 */

public class ControladorRmi {
    public static boolean start(){
        return Main.serverRmi.start();
    }
    
    public static boolean stop(){
        return Main.serverRmi.stop();
    }
    
    public static boolean addBind(String bind){
        return Main.serverRmi.addBind(bind);
    }
    
    public static Integer getPort() {
        return Main.serverRmi.getPort();
    }

    public static void setPort(Integer port) {
        Main.serverRmi.setPort(port);
    }

    public static String getBind() {
        return Main.serverRmi.getBind();
    }

    public static void setBind(String bind) {
        Main.serverRmi.setBind(bind);
    }
}
