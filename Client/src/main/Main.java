/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import client.Client;
import gui.ClientGui;

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
 * Classe Main criada para instanciar os objetos ClientGui e Client.
 * Por boas práticas acho que é legal toda aplicação ter uma main.
 */
public class Main {

    public static ClientGui clientGui;
    public static Client client;

    public static void main(String[] args) {
        /*estanciando objetos*/
        client = new Client();
        clientGui = new ClientGui();

        /*visualizar interface gráfica*/
        clientGui.setVisible(true);

    }
}
