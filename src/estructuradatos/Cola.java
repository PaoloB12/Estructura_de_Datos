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
public class Cola {

    private int size;
    private Nodo frente;
    private Nodo fin;

    public Cola() {
        this.size = 0;
        this.frente = null;
        this.fin = null;
    }

    public void insertar(int dato) {
        Nodo nodo = new Nodo(dato);
        if (this.size == 0) {
            this.frente = nodo;
            this.fin = nodo;
        } else {
            this.fin.setSiguiente(nodo);
            this.fin = nodo;
        }
        this.size++;
    }

    public void quitar() {
        this.frente = this.frente.getSiguiente();
        this.size--;
    }

    public void isEmpty() {
        if (this.size == 0) {
            System.out.println("\nCOLA VACIA");
        } else {
            System.out.println("\nCOLA LLENA");
        }
    }
    public int getFrente(){
        return this.frente.getDato();
    }
    public int getSize(){
        return this.size;
    }

    public void print() {
        Nodo aux = this.frente;
        System.out.println("");
        for (int i = 0; i < this.size; i++) {
            System.out.printf("%d ", aux.getDato());
            aux = aux.getSiguiente();
        }

    }
}
