/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab7.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class PedidoOnline extends PedidoTemplate {
    
    public PedidoOnline(int quantidadeItens, double valorItem) {
        super(quantidadeItens, valorItem);
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento online...");
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Entrega via transporte.");
    }
}
