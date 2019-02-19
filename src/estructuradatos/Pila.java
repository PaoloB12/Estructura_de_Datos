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
public class Pila {

    private Nodo cima;
    private int size;

    public Pila() {
        this.cima = null;
        this.size = 0;
    }

    public void push(int dato) {
        Nodo nodo = new Nodo(dato);
        if (this.size == 0) {
            this.cima = nodo;
        } else {
            nodo.setSiguiente(cima);
            this.cima = nodo;
        }
        this.size++;
    }

    public void pop() {
        this.cima = this.cima.getSiguiente();
        this.size--;

    }

    public void isEmpty() {
        if (this.size == 0) {
            System.out.println("\nPILA VACIA");
        } else {
            System.out.println("\nPILA LLENA");
        }
    }

    public void clean() {
        this.cima = null;
        this.size = 0;
    }

    public int getCima() {
        if(this.size==0){
            System.out.println("NO EXISTEN ELEMENTOS");
            return -1;
        }
        return this.cima.getDato();
    }

    public int getSize() {
        return this.size;
    }

    public void print() {
        if(this.size==0){
            System.out.println("NO EXISTEN ELEMENTOS");
            return;
        }
        Nodo aux = this.cima;
        System.out.println("");
        for (int i = 0; i < this.size; i++) {
            System.out.printf("%d ", aux.getDato());
            aux = aux.getSiguiente();
        }
    }

}
