/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

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
 * No caso da interface Calculator ela é a mesma para local quanto remoto, 
 * pois tive alguns problemas que está relatado na documentação. 
 */

public interface Calculator extends Remote {

    /*metodos de operações matemática básica*/
    
    Double sum(Double n1, Double n2) throws RemoteException;

    ;
    Double subtraction(Double n1, Double n2) throws RemoteException;

    ;
    Double multiplication(Double n1, Double n2) throws RemoteException;

    ;
    Double division(Double n1, Double n2) throws RemoteException;
;
}
