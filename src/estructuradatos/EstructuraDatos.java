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
public class EstructuraDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Lista lista1 = new Lista();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.print();
        lista1.remove(1);;
        lista1.print();
        lista1.remove(3);
        lista1.print();
        
        if(lista1.isEmpty()){
            System.out.println("\nVACIO\n");
        }else{
            System.out.println("\nLLENO\n");
        }
       
       Pila pila1 = new Pila();
       pila1.push(1);
       pila1.push(3);
       pila1.push(2);
       pila1.print();
       pila1.isEmpty();
       pila1.print();
       pila1.pop();
       pila1.print();
       pila1.pop();
       pila1.clean();
       pila1.isEmpty();
      
       pila1.getCima();
       pila1.print();
       
       Cola cola1 = new Cola ();
       cola1.insertar(2);
       cola1.insertar(1);
       cola1.insertar(4);
        cola1.print();
        cola1.quitar();
        cola1.print();
        cola1.isEmpty();
        cola1.getFrente();
        cola1.print();
        System.out.printf("\n%d\n",cola1.getSize());
         
        
        ListaDoble listadoble1 = new ListaDoble();
        listadoble1.add(1);
        listadoble1.add(2);
        listadoble1.add(4);
        listadoble1.add(3);
        listadoble1.add(5);
        listadoble1.add(6);
        listadoble1.print();
        listadoble1.remove(3);
        listadoble1.print();
        System.out.printf("\n%d\n",listadoble1.search(2)); 
       
        ListaCircular listacircular1 = new ListaCircular();
        listacircular1.add(1);
        listacircular1.add(2);
        listacircular1.add(3);
        listacircular1.print();
        listacircular1.remove(2);
        listacircular1.print();
         */
        ListaCircularDoble listacirculardoble1 = new ListaCircularDoble();
        listacirculardoble1.add(1);
        listacirculardoble1.add(2);
        listacirculardoble1.add(3);
        listacirculardoble1.print();
        listacirculardoble1.remove(1);
        listacirculardoble1.print();
        System.out.printf("\n%d\n", listacirculardoble1.search(2));
        listacirculardoble1.clean();
        listacirculardoble1.isEmpty();
        System.out.printf("%d\n", listacirculardoble1.getSize());

    }

}
