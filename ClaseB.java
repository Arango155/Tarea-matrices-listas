package proyecto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClaseB {
    static  Scanner scanner=new Scanner (System.in);
    List<String> lis_alumno = new ArrayList<>();
    
       public String Input(String text){
      return JOptionPane.showInputDialog(text);
   }
       
    public static void main(String[] args) {
         ClaseP calculador=new ClaseP();
         Byte opcion;
         
         
       do{
           opcion = Byte.parseByte(JOptionPane.showInputDialog(
               "----Menu de tablas de datos basado en listas----\n"
               +"1. TABLA-ALUMNO\n"
               +"2. TABLA-CURSO\n"
               +"3. GRADO\n"
               +"4. MOSTRAR RESULTADOS GENERALES\n"  
               +"5. MOSTRAR RESULTADOS DE TABLA-ALUMNO \n"
               +"6. MOSTRAR RESULTADOS DE TABLA-CURSO \n"
               +"7. MOSTRAR RESULTADOS DE LA TABLA GRADO \n"
               +"0. Salir"));
       
             
       switch(opcion){
               
         case 1 -> { 
             
              
             String nombre= JOptionPane.showInputDialog("\nNombre del alumno: ");
             String aleas=JOptionPane.showInputDialog("\nAleas del alumno (si tuviera, en caso contrario escribirlo como inexistente): ");
             String codigo= JOptionPane.showInputDialog("\nNumero del codigo del alumno: ");
             String telefono=JOptionPane.showInputDialog( "\nNumero de telefono del alumno: ");
             String correo=JOptionPane.showInputDialog("\nCorreo electronico del alumno: ");
             System.out.println();
             System.out.print(calculador.alumno(codigo, telefono, nombre,aleas,correo));
               }
          
         case 2 -> {
        
               String nc =  JOptionPane.showInputDialog("\nIngrese el nombre del curso: ");
                  
                String cc = JOptionPane.showInputDialog("\nIngrese el codigo del curso: "); 
                  
                  System.out.println();
             System.out.print(calculador.curso(nc,cc));
             
               }
           case 3 -> {
            
               String cg =  JOptionPane.showInputDialog("\nIngrese el codigo del grado: "); 
    
                 String des =  JOptionPane.showInputDialog("\nIngrese la descripcion: ");
                  
                   System.out.println();
             System.out.print(calculador.grado(cg,des));
               }
         
                 case 4 -> {
            calculador.mostrarTransacciones();
    
            break;
                 }
                 
                 case 5 -> {
            calculador.mostrarTransaccionesA();
    
            break;
                 }
                 
                 case 6 -> {
            calculador.mostrarTransaccionesC();
    
            break;
                 }
                 
                 case 7 -> {
            calculador.mostrarTransaccionesG();
    
            break;
                 }
                 
            
      }
       
       
       }  while (opcion !=0); 
          
        }
        

}
