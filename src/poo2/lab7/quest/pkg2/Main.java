/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab7.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PedidoOnline pedidoOnline = new PedidoOnline(3, 10.0);
        pedidoOnline.processarPedido();

        PedidoNaLoja pedidoNaLoja = new PedidoNaLoja(2, 15.0);
        pedidoNaLoja.processarPedido();

        PedidoCriptomoedas pedidoCriptomoedas = new PedidoCriptomoedas(4, 8.0);
        pedidoCriptomoedas.processarPedido();
    }
    
}

//b) A diferença entre o padrão de projeto Template e o Decorator é que o Template define uma estrutura básica de algoritmo em uma classe base, permitindo que as subclasses implementem partes específicas do algoritmo, enquanto o Decorator permite adicionar novos comportamentos a um objeto existente dinamicamente, envolvendo-o com objetos decoradores adicionais.
