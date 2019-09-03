/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import gui.ControladorServerGui;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicBoolean;

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
 * A Classe Server é onde o servidor irá aceitar requisições  de conexão dos clientes via TCP.
 * Foi implementado Runnable no servidor rodar em uma thread diferente da interface gráfica, deichando a interface gráfica independente.
 */

public class Server implements Runnable {
    
    private String lookup;
    
    /*atributo ip foi inserido apenas por padrão, 
    pois sempre será usado o ip 127.0.0.1 (localhost), ou seja sempre será um conexão local. 
    No entanto pode ser que em um upgrade futuro tenha como objetivo ter uma conexão remota com clientes.*/
    private String ip;
    
    private Integer serverPort, portRmi;
    private ServerSocket serverSocket;
    
    /*atributo runing serve para parar o servidor.*/
    private AtomicBoolean runing;

    public Server() {
        /*servidor não ativo.*/
        runing = new AtomicBoolean(false);
    }
    
    /*método que starta o servidor, com o atributo serverPort e o ip*/    
    public void start() {

        try {
            /*istanciando servidor*/
            serverSocket = new ServerSocket(serverPort, 50, InetAddress.getByName(ip));

        } catch (UnknownHostException ex) {
            System.err.println(ex);
            ControladorServerGui.getjTextAreaConnection().append(ex+"\n\n");
            return;
        } catch (IOException ex) {
            System.err.println(ex);
            ControladorServerGui.getjTextAreaConnection().append(ex+"\n\n");
            return;
        }

        System.out.println("Server Start");

        runing.set(true);
        
        /*loop no aguardo de requisições de conexões*/
        while (runing.get()) {

            try {
                /*istanciando uma nova conexão*/
                Connection connection = new Connection(serverSocket.accept(), portRmi, lookup);
                Thread thread = new Thread(connection);
                
                /*iniciando troca de dados entre servidor e client em outra thread*/
                thread.start();

                ControladorServerGui.getjTextAreaConnection().append("cliente conectado " + connection.getSocket().toString() + "\n\n");

            } catch (IOException ex) {
                ControladorServerGui.getjTextAreaConnection().append(ex+"\n\n");
            }

        }

        System.out.println("Server Stop");

    }
    
    /*método onde o servidor é parado*/
    public void stop() {
        runing.set(false);
        try {
            /*parando o servidor*/
            serverSocket.close();
        } catch (IOException ex) {
            System.err.println(ex);
            ControladorServerGui.getjTextAreaConnection().append(ex+"\n\n");
        }

    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public void setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public String getLookup() {
        return lookup;
    }

    public void setLookup(String lookup) {
        this.lookup = lookup;
    }

    public AtomicBoolean getRuning() {
        return runing;
    }

    public void setRuning(AtomicBoolean runing) {
        this.runing = runing;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


    @Override
    public void run() {
        start();
    }

    public Integer getPortRmi() {
        return portRmi;
    }

    public void setPortRmi(Integer portRmi) {
        this.portRmi = portRmi;
    }

}
