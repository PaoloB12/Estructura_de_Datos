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
public class Lista {

    private Nodo cabeza;
    private Nodo cola;
    private int size;

    public Lista() {
        this.cabeza = null;
        this.cola = null;
        this.size = 0;
    }

    public void add(int dato) {
        Nodo nodo = new Nodo(dato);
        if (this.size == 0) {
            this.cabeza = nodo;
        } else {
            this.cola.setSiguiente(nodo);
        }
        this.cola = nodo;
        this.size = this.size + 1;
    }

    public int getIndexOf(int dato) {
        Nodo aux;
        aux = this.cabeza;
        for (int i = 0; i < this.size; i++) {
            if (aux.getDato() == dato) {
                return i;
            }
            aux = aux.getSiguiente();
        }
        return -1;
    }

    public void remove(int dato) {
        Nodo aux;
        Nodo auxAnterior;
        aux = this.cabeza;
        auxAnterior = this.cabeza;
        for (int i = 0; i < this.size; i++) {
            if (aux.getDato() == dato) {
                this.size--;
                if (i == 0) {                    
                    this.cabeza = this.cabeza.getSiguiente();
                    break;
                } else {
                    auxAnterior.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(null);
                    break;
                }
            } else {
                auxAnterior = aux;
                aux = aux.getSiguiente();
            }
        }

    }
    public boolean isEmpty(){
        if(this.size==0){
            return true;
        }else{
            return false;
        }
    }

    public void print() {
        Nodo aux;
        aux = this.cabeza;
        System.out.println("");
        for (int i = 0; i < this.size; i++) {
            System.out.printf("%d ", aux.getDato());
            aux = aux.getSiguiente();
        }
    }

}
