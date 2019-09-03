/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import gui.ControladorServerGui;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

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
 * A Classe ServerRmi é responsavel por criar um registro e então inserir um objeto remoto no registro e oferecer um link para este objeto.
 */

public class ServerRmi {

    private Registry registry;
    private Integer port;
    private String bind;

    public ServerRmi() {
        /*setando o gerenciamento de segurança na aplicação, não estudei profundamente este assunto*/
        System.setSecurityManager(new SecurityManager());
        
    }

    /*método onde é criado um registro em determinada porta*/
    public boolean start() {

        try {
            /*criando registro*/
            registry = LocateRegistry.createRegistry(port);
            
            /*inserindo informações na interface gráfica*/
            ControladorServerGui.getTextAreaRmi().append("Registry created in port: "+port+"\n\n");
            return true;
        } catch (RemoteException ex) {
            System.err.println(ex);
             /*inserindo informações na interface gráfica*/
            ControladorServerGui.getTextAreaRmi().append(ex+"\n\n");
            return false;
        }

    }

    /*método que adiciona um objeto remoto no registro já criado*/
    public boolean addBind(String bind) {
        try {
            /*estanciando objeto*/
            Calculator stub = new ImplCalculator();
            
            /*inserindo objeto no registro*/
            registry.rebind(bind, stub);
            
             /*inserindo informações na interface gráfica*/
            ControladorServerGui.getTextAreaRmi().append("add in register:"+bind+"\n\n");
            return true;
        } catch (RemoteException ex) {
            System.err.println(ex);
             /*inserindo informações na interface gráfica*/
            ControladorServerGui.getTextAreaRmi().append(ex+"\n\n");
            return false;
        }
    }
    
    
    public boolean stop() {
    
        registry = null;
        
        return   true;

    }

    public Registry getRegistry() {
        return registry;
    }

    public void setRegistry(Registry registry) {
        this.registry = registry;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind;
    }

}
