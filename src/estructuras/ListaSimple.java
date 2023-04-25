package estructuras;

import nodos.Nodo;

public class ListaSimple {

    //atributos
    private Nodo inicio;

    //Constructores
    public ListaSimple() {
        inicio = null;
    }

    public boolean estaVacia() {
        return this.inicio == null;
    }
    public void insertarFinal(Object dato){
        Nodo nuevo = new Nodo(dato);
        Nodo actual;
        if(estaVacia()){
            inicio = nuevo;
        }
        else{
            actual = inicio;
            while(actual.getSig() != null){
                actual = actual.getSig();
            }
            actual.setSig( nuevo);
        }
    }
    

     public int longitudLista() {
        Nodo actual = inicio;
        int cont = 0;
        while (actual != null) {
            cont++;
            actual = actual.getSig();
        }
        return cont;
    }

     
    public void llenarLista(String hilera) {
      Nodo actual = new Nodo("");
      inicio=actual;
        for (int i = 0; i < hilera.length(); i++) {
            Nodo nuevo= new Nodo(hilera.charAt(i));
            actual.setSig(nuevo);
            actual=actual.getSig();
        }
        
        
    }
    
   
 public String eliminarNodos() {
        Pila pila = new Pila();
        Nodo actual = inicio;
        String hilera = "";
        
        while (actual != null) {
            pila.push(actual.getDato());
            actual = actual.getSig();
        }
        
        while (!pila.isEmpty()) {
            hilera += pila.pop();
        }
        
        inicio = null;
        
        return hilera;
    }

//    public String eliminarNodos() {
//
//        int munti=1;
//        String hilera="";
//        Nodo actual = inicio;
//        if(!estaVacia()) {
//             while(actual.getSig().getSig() != null) {
//                 actual= actual.getSig();
//             }
//             hilera+=actual.getSig().getDato();
//             Pila pila = new Pila();
//             for (int i = hilera.length() - 1; i >= 0; i--) {
//                pila.push(hilera.charAt(i));
//                
//            }
//             while(!pila.isEmpty()) {
//                 int num = (Character)pila.pop();
//                 hilera+= Character.getNumericValue(num) * munti;
//                 munti= munti * 10;
//             }
//             actual.setSig(null);
//        }
//           
//       
//        return hilera;
//    }

 public String subHilera(int n1, int n2) {
    Nodo actual = inicio;
    String hilera = "";
    int posicion = 1;

    while (actual != null && posicion <= n2) {
        if (posicion >= n1) {
            hilera += actual.getDato();
        }
        actual = actual.getSig();
        posicion++;
    }

    return hilera;
}
//    public String subHilera(int n1, int n2) {
//       Nodo actual= inicio;
//       String hilera="";
//       while(actual != null) {
//          for (int i = 1; i < longitudLista(); i++) {
//               if(n1 > i && (int)n2 < i) {
//                  // hilera+=actual.getDato();
//          // if((int)actual.getDato() == n1) {
//               //for (int i = n1; i < n2; i++) {
//                   Nodo nuevo = new Nodo(actual.getDato());
//                   hilera+=nuevo;
//                   //actual.setSig(nuevo);
//                   actual=actual.getSig();
//               }
//           }
//       }
//        
//        return hilera;
//    }

 // Nuevo
 public int contarMayúsculas() {
    Nodo actual = inicio;
    int cont = 0;
    while (actual != null) {
        String dato = String.valueOf(actual.getDato());
        for (int i = 0; i < dato.length(); i++) {
            if (Character.isUpperCase(dato.charAt(i))) {
                cont++;
            }
        }
        actual = actual.getSig();
    }
    return cont;
}
//    public int contarMayúsculas() {
//        Nodo actual= inicio;
//        int cont=0;
//        char c= (Character)actual.getDato();
////        char dato= (Character)actual.getDato();
////        for (int i = 0; i < longitudLista(); i++) {
////            
////        }
//        while(actual != null) {
//            if(Character.isUpperCase( c)  == true) {
//                cont++;
//           // actual.setSig(dato);
//           // actual= actual.getSig();
//            }
//        actual=actual.getSig();
//        }
//        return cont;
//    }

   
    public String toString() {
        Nodo actual = inicio;
        String hilera = "Contenido de la lista\n";
        while (actual != null) {
            hilera += actual.toString();
            actual = actual.getSig();
        }
        return hilera;
    }

}
