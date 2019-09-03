/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import gui.ControladorClientGui;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Jean Carlo Massami Yamada
 *
 * Aplicação desenvolvida como trabalho final da disiciplina de Computação Distrubuida ministrada 
 * por Dr.Prof. Milton Hirokazu Shimabukuro do curso de Ciências da Computação da 
 * UNESP(Universidade Estadual Paulista) "Júlio Mesquita Filho" - Câmpus de Presidente Prudente.
 * Com o intuito de concretizar o aprendizado da matéria, o bjetivo da aplicação é ter
 * um servidor que irá invocar métodos remotos (RMI (Remote Method Invocation))
 * para atender requisições de seus clientes conectados via TCP.
 */
/**
 *  * @author Jean Carlo Massami Yamada
 *
 * Classe client, a qual é responsavel por toda interação de cliente para
 * servidor. Desde a requisição de uma conexão com um servidor, a troca de
 * dados com o servidor e então a desconexão com o servidor.
 */
public class Client {
    
    /*atributo ip foi inserido apenas por padrão, 
    pois sempre será usado o ip 127.0.0.1 (localhost), ou seja sempre será um conexão local. 
    No entanto pode ser que em um upgrade futuro tenha como objetivo ter uma conexão remota com um servidor.*/
    private String ip;
    
    private Integer port;
    private Socket socket;
    
    /*atributos de entrada e saída do socket*/
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;

    public Client() {

    }
    
    /*método que faz uma requisição de de conexão com um servidor*/
    public boolean connect() {
        try {
            /*requisitando conexão com um servidor*/
            socket = new Socket(InetAddress.getByName(ip), port);
            
            /*instanciando objetos de entrada e saída do socket*/
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            
            return true;
        } catch (UnknownHostException ex) {
            System.err.println(ex);
            ControladorClientGui.getTextArea().append(ex + "\n\n");
            return false;
        } catch (IOException ex) {
            System.err.println(ex);
            ControladorClientGui.getTextArea().append(ex + "\n\n");
            return false;
        }

    }
    
    /*método que encerra um conexão com o sevidor*/
    public boolean disconnect() {
        try {
            /*encerrando conexão com o servidor*/
            socket.close();
            return true;
        } catch (IOException ex) {
            System.err.println(ex);
            ControladorClientGui.getTextArea().append(ex + "\n\n");
            return false;
        }
    }

    /*método que envia uma operação e recebe o resultado, ou seja  uma comunicação síncrona*/
    public boolean start(String operation) {
        
        try {
            
            /*enviando dados*/
            dataOutputStream.writeUTF(operation);
            
            /*recebendo dados*/
            String data = dataInputStream.readUTF();	    
            System.out.println(data);
            
            /*inserindo resultado na interface gráfca*/
            ControladorClientGui.getjFormattedTextFieldResult().setText(data);
            return true;
        } catch (IOException ex) {
            System.err.println(ex);
            ControladorClientGui.getTextArea().append(ex + "\n\n");
            return false;
        }

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getServerPort() {
        return port;
    }

    public void setServerPort(Integer serverPort) {
        this.port = serverPort;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public DataInputStream getDataInputStream() {
        return dataInputStream;
    }

    public void setDataInputStream(DataInputStream dataInputStream) {
        this.dataInputStream = dataInputStream;
    }

    public DataOutputStream getDataOutputStream() {
        return dataOutputStream;
    }

    public void setDataOutputStream(DataOutputStream dataOutputStream) {
        this.dataOutputStream = dataOutputStream;
    }

}
