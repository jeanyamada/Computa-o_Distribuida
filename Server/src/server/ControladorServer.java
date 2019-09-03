/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.ServerSocket;
import java.util.concurrent.atomic.AtomicBoolean;
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
 * Classe ControladorServer é apenas uma classe intermediaria que tenho costume de fazer por boas praticas.
 * A interface gráfica ServerGui irá fazer uso desta classe.
 * 
 * A idéia é que tanto o objeto da interface gráfica ServerGui e o objeto Server estejam estanciados estaticamente na Main.
 * E então a invocação dos métodos do objeto Server irá ocorrer nesta classe ControladorServer por seus métodos estáticos.
 */
public class ControladorServer {

    /*método onde é startado um novo servidor*/
    public static void start() {
        
        /*o servidor será rodado em outra thread*/
        Thread thread = new Thread(Main.server);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
    }

    /*método onde é interronpido o servidor*/
    public static void stop() {
        Main.server.stop();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
    }

    public static Integer getServerPort() {
        return Main.server.getServerPort();
    }

    public static void setServerPort(Integer serverPort) {
        Main.server.setServerPort(serverPort);
    }

    public static ServerSocket getServerSocket() {
        return Main.server.getServerSocket();
    }

    public static void setServerSocket(ServerSocket serverSocket) {
        Main.server.setServerSocket(serverSocket);
    }

    public static String getLookup() {
        return Main.server.getLookup();
    }

    public static void setLookup(String lookup) {
        Main.server.setLookup(lookup);
    }

    public static String getIp() {
        return Main.server.getIp();
    }
   
    public static void setIp(String ip) {
        Main.server.setIp(ip);
    }

    public static Integer getPortRmi() {
        return Main.server.getPortRmi();
    }

    public static void setPortRmi(Integer portRmi) {
        Main.server.setPortRmi(portRmi);
    }

    public static AtomicBoolean getRuning() {
        return Main.server.getRuning();
    }

    public static void setRuning(AtomicBoolean runing) {
        Main.server.setRuning(runing);
    }

}
