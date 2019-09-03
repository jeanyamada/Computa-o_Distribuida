/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

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
 * A classe ImplCalculator é onde está implementado a interface Calculator.
 * A classe herda UnicastRemoteObject pois no momento de insrerir o stub no registro é necessário que o stub seja um objeto remoto.
 */

public class ImplCalculator extends UnicastRemoteObject implements Calculator {

    public ImplCalculator() throws RemoteException {
        super();
    }

    @Override
    public Double sum(Double n1, Double n2) throws RemoteException {
        return n1 + n2;
    }

    @Override
    public Double subtraction(Double n1, Double n2) throws RemoteException {
        return n1 - n2;
    }

    @Override
    public Double multiplication(Double n1, Double n2) throws RemoteException {
        return n1 * n2;
    }

    @Override
    public Double division(Double n1, Double n2) throws RemoteException {
        if (n2 != 0) {
            return n1 / n2;
        }
        return Double.NaN;
    }

}
