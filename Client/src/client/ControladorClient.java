/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.Socket;
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
 * Classe ControladorClient é apenas uma classe intermediaria que tenho costume de fazer por boas praticas.
 * A interface gráfica ClientGui irá fazer uso desta classe.
 * 
 * A idéia é que tanto o objeto da interface gráfica ClientGui e o objeto Client estejam estanciados estaticamente na Main.
 * E então a invocação dos métodos do objeto Client irá ocorrer nesta classe ControladorClient por seus métodos estáticos.
 */

public class ControladorClient {

    public static boolean connect() {
        return Main.client.connect();
    }

    public static boolean disconnect() {
        return Main.client.disconnect();
    }

    public static boolean start(String operation) {
        return Main.client.start(operation);
    }

    public static String getIp() {
        return Main.client.getIp();
    }

    public static void setIp(String ip) {
        Main.client.setIp(ip);
    }

    public static Integer getServerPort() {
        return Main.client.getServerPort();
    }

    public static void setServerPort(Integer serverPort) {
        Main.client.setServerPort(serverPort);
    }

    public static Socket getSocket() {
        return Main.client.getSocket();
    }

    public static void setSocket(Socket socket) {
        Main.client.setSocket(socket);
    }

}
