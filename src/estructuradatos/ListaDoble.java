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
public class ListaDoble {

    private Nodo cabeza;
    private Nodo cola;
    private int size;

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
        this.size = 0;
    }

    public void add(int dato) {
        Nodo nodo = new Nodo(dato);
        if (this.size == 0) {
            this.cabeza = nodo;
            this.cola = nodo;
        } else {
            nodo.setAnterior(this.cola);
            this.cola.setSiguiente(nodo);
            this.cola = nodo;
        }
        this.size++;
    }

    public void remove(int dato) {
        Nodo aux = this.cabeza;
        for (int i = 0; i < this.size; i++) {
            if (aux.getDato() == dato) {
                if (i == 0) {
                    this.cabeza = this.cabeza.getSiguiente();
                    this.cabeza.setAnterior(null);
                    this.size--;
                    break;
                } else {
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                    aux.getSiguiente().setAnterior(aux.getAnterior());
                    this.size--;
                    break;
                }
            }else{
                aux = aux.getSiguiente();              
            }  
        }
    }
    public int search ( int dato){
        Nodo aux = this.cabeza;
        for (int i = 0; i < this.size; i++) {
            if(aux.getDato()==dato){
                return i;
            }else{
                aux = aux.getSiguiente();
            }
        }
        return -1;
    }
    public void print() {
        Nodo aux = this.cabeza;
        System.out.println("");
        for (int i = 0; i < this.size; i++) {
            System.out.printf("%d ", aux.getDato());
            aux = aux.getSiguiente();
        }
    }

}
