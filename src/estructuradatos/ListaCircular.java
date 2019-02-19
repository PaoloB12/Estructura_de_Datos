/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradatos;

/**
 *
 * @author pbeni
 */
public class ListaCircular {

    private Nodo lc;
    private int size;

    public ListaCircular() {
        this.lc = null;
        this.size = 0;
    }

    public void add(int dato) {
        Nodo nodo = new Nodo(dato);
        if (this.size == 0) {
            this.lc = nodo;
            nodo = this.lc;
        } else {
            nodo.setSiguiente(this.lc.getSiguiente());
            this.lc.setSiguiente(nodo);
        }
        this.size++;
    }

    public void remove(int dato) {
        Nodo aux = this.lc;
        Nodo auxAnterior = this.lc;
        for (int i = 0; i < this.size; i++) {
            if (aux.getDato() == dato) {
                if (i == 0) {
                    for (int j = 0; j < this.size - 1; j++) {
                        auxAnterior = auxAnterior.getSiguiente();
                    }
                    auxAnterior.setSiguiente(this.lc.getSiguiente());
                    this.lc = this.lc.getSiguiente();
                    this.size--;
                    break;
                } else {
                    auxAnterior.setSiguiente(aux.getSiguiente());
                    this.size--;
                    break;
                }
            } else {
                auxAnterior = aux;
                aux = aux.getSiguiente();
            }
        }
    }

    public void print() {
        Nodo aux = this.lc;
        System.out.println("");
        for (int i = 0; i < this.size; i++) {
            System.out.printf("%d ", aux.getDato());
            aux = aux.getSiguiente();
        }
    }

}
