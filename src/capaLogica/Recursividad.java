
package capaLogica;


public class Recursividad {
//      public static int restar(int x, int y){  //Para números positivos
//        if(x < y) {
//            return 0;
//        }else{
//           // return 1+ restar(x,y+1);
//            return 1+ restar(x,y+1);
//        }
////         return 0;
//        
//    }
    
    public static int restar(int x, int y){
    if(x == y) {
        return 0;
    }
    if(x > y) {
        return 1 + restar(x-1, y);
    }
       System.out.println("Error: x debe ser mayor o igual que y.");
    return -1; 
}
}