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
public class ListaCircularDoble {

    private Nodo lc;
    private int size;

    public ListaCircularDoble() {
        this.lc = null;
        this.size = 0;
    }

    public void add(int numero) {
        Nodo nodo = new Nodo(numero);
        if (this.size == 0) {
            this.lc = nodo;
            lc.setAnterior(this.lc);
            lc.setSiguiente(this.lc);
        } else {
            nodo.setSiguiente(lc.getSiguiente());
            nodo.setAnterior(this.lc);
            this.lc.getSiguiente().setAnterior(nodo);
            this.lc.setSiguiente(nodo);
        }
        this.size++;
    }

    public void remove(int dato) {
        Nodo aux = this.lc;
        for (int q = 0; q < this.size; q++) {
            if (aux.getDato() == dato) {
                if (q == 0) {
                    this.lc = this.lc.getSiguiente();
                    aux.getAnterior().setSiguiente(this.lc);
                    this.lc.setAnterior(aux.getAnterior());
                    this.size--;
                    break;
                } else {
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                    aux.getSiguiente().setAnterior(aux.getAnterior());
                    this.size--;
                    break;
                }
            } else {
                aux = aux.getSiguiente();
            }
        }
    }

    public int search(int dato) {
        Nodo aux = this.lc;
        for (int i = 0; i < this.size; i++) {
            if (aux.getDato() == dato) {
                return i;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return -1;
    }

    public void isEmpty() {
        if (this.size == 0) {
            System.out.println("ESTA VACIO");
        } else {
            System.out.println("ESTA LLENO");
        }
    }
    public void clean (){
        this.lc=null;
        this.size=0;
    }

    public int getSize() {
        return this.size;
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
