/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import gui.ControladorServerGui;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.Calculator;


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
 * Classe Connection é onde ocorre a troca de dados entre cliente e servidor, ou seja é onde o servidor irá 
 * invocar métodos remotos de um objeto remóto para atender as requisições do cliente.
 * A classe tanbém implementa Runnable, pois irá rodar em outra thread, ou seja o objetivo é ter vários clientes conectados a um
 * único servidor.
 * Para cada conexão avera uma referência ao objeto remoto.
 *
 */

public class Connection implements Runnable {
    /*objetos de entrada e saída*/
    private DataInputStream in;
    private DataOutputStream out;
    
    private Socket socket;
    
    /*objeto que iram referênciar ao objeto remoto*/
    private Calculator calculator;
    
    /*objeto que irá obter registro ativo*/
    private Registry registry;
    
    private Integer portRmi;
    private String lookup;

    /*obtendo o socket de conexão com o cliente*/
    public Connection(Socket clienteSocket, Integer portRmi, String lookup) {
        try {
            socket = clienteSocket;
            this.portRmi = portRmi;
            this.lookup = lookup;
            
            /*estanciando objetos de entrada e saída*/
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

        } catch (IOException e) {
            System.err.println(e);
            ControladorServerGui.getjTextAreaConnection().append(e+"\n\n");
        }
    }
    
    /*método onde irá a ocorrer comunicação entre cliente e servidor, servidor e objeto remoto*/
    @Override
    public void run() {

        try {

            String data;

            while (true) {
                
                /*recebendo requisição do cliente*/
                data = in.readUTF();
                
                /*obtendo registro ativo*/
                registry = LocateRegistry.getRegistry(portRmi);

                try {
                    
                    /*referênciando objeto remoto apartir do registro*/
                    calculator = (Calculator) registry.lookup(lookup);
                    
                    /*inserindo informações na interface gráfica*/
                    ControladorServerGui.getjTextAreaConnection().append("cliente request " + socket.toString()+": " +data+ "\n\n");
                    
                    /*obtendo equação matemática básica enviada pelo cliente*/
                    String[] aux = data.split(" ");
                    
                    Double n1 = Double.parseDouble(aux[0]);
                    Double n2 = Double.parseDouble(aux[1]);
                    String opCode = aux[2];

                    Double result = 0.0;

                    /*verificando tipo de operação matemática e invocando os metódos remotos*/
                    switch (opCode) {

                        case "sum":
                            result = calculator.sum(n1, n2);
                            break;
                        case "sub":
                            result = calculator.subtraction(n1, n2);
                            break;
                        case "mult":
                            result = calculator.multiplication(n1, n2);
                            break;
                        case "div":
                            result = calculator.division(n1, n2);
                            break;
                    }
                    
                    data = result.toString();
                    
                    ControladorServerGui.getjTextAreaConnection().append("cliente send " + socket.toString()+": " +data+ "\n\n");
                    
                    /*enviando ao cliente resultado*/
                    out.writeUTF(data);
                } catch (RemoteException | NotBoundException ex) {
                    System.err.println(ex);
                    ControladorServerGui.getjTextAreaConnection().append(ex+"\n\n");
                    out.writeUTF("");
                }
                
            }

        } catch (IOException ex) {
            System.err.println(ex);
            ControladorServerGui.getjTextAreaConnection().append("cliente desconectado " + socket.toString() + "\n\n");
        }
    }

    public DataInputStream getIn() {
        return in;
    }

    public void setIn(DataInputStream in) {
        this.in = in;
    }

    public DataOutputStream getOut() {
        return out;
    }

    public void setOut(DataOutputStream out) {
        this.out = out;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Registry getRegistry() {
        return registry;
    }

    public void setRegistry(Registry registry) {
        this.registry = registry;
    }

}
