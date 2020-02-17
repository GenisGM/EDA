package librerias.estructurasDeDatos.lineales;

public class LEGListaConPIOrdenada<E extends Comparable<E>> extends LEGListaConPI<E> implements librerias.estructurasDeDatos.modelos.ListaConPI<E> {
    public void insertar(E e) {
         inicio();
         while(!esFin()){
             if(e.compareTo(recuperar())>0){
                 siguiente();
             }
         }
         super.insertar(e);
         
    }
}
