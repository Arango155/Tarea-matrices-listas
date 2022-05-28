/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author jdara
 */
public class ClaseM {
    
    
    ClaseP calculador=new ClaseP();
    Byte opcion;
    int op2;
    Byte op;
    ClaseC obj = new ClaseC();
    Scanner scanner = new Scanner(System.in);
    double c,cc,t,cg;
    String n,a,co,nc,d;
    int se;


     public void mostrarMenu(){
     op = Byte.parseByte(JOptionPane.showInputDialog(
    "PROGRAMA PARA EL REGISTRO DE ALUMNOS, CURSOS Y GRADOS\n"
    +"----Menu de registros----\n"
    +"1. VECTORES\n"
    +"2. LISTAS\n"
    +"Ingrese en base a que tipo de registro quiere que funcione el programa: "
     ));
     
    }

   public void desicion() {
       
        
       
        
        switch(op) {
            
            case 1:{
                
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
                 
               case 0 -> {
            System.out.println("Gracias por haber usado el progra");
    
            break;
                 } 
            
      }
       
       
       }  while (opcion !=0); 
           
           break;
            }
            
            
            
           case 2:{
           
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
               +"8. ELIMINAR LOS DATOS GUARDADOS\n"
               +"0. Salir"));
       
       
       switch(opcion){
           
          case 1:
              obj.Tabla_Alumno();
             break;
             
             case 2:
              obj.Tabla_Curso();
             break;
             
             case 3:
              obj.Tabla_Grado();
             break;
             
              case 4:
             obj.mostrarTransacciones();
             break; 
               
          case 5:
             obj.mostrarTransaccionesA();
             break; 
             
              case 6:
             obj.mostrarTransaccionesC();
             break; 
             
             case 7:
             obj.mostrarTransaccionesG();
             break; 
             
             case 8:
             obj.clearListBook();
             break;
        
          case 0:
             JOptionPane.showMessageDialog(null, "Gracias por haber usado el programa");
             break;
             
          default:
             JOptionPane.showMessageDialog(null, "Opcion invalida");
             break;
             
       }
       
       
    }while(opcion!=0);
    
           break;
           
           
           }
           
           
           
            default: System.out.println("\nOpcion invalida");

        }
        
   
}

}
   
