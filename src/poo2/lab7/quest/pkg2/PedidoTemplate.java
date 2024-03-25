/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab7.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public abstract class PedidoTemplate {
    
    protected int quantidadeItens;
    protected double valorItem;

    public PedidoTemplate(int quantidadeItens, double valorItem) {
        this.quantidadeItens = quantidadeItens;
        this.valorItem = valorItem;
    }

    public final void processarPedido() {
        processarPagamento();
        decidirEntrega();
    }

    protected abstract void processarPagamento();

    protected abstract void decidirEntrega();
}
