package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	//Rela��o 1 para n: 1 compra tem muitos itens;
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	//metodo para saber o valor total da compra
	double obterValorTotal () {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
		
	}
	
	
	

}
