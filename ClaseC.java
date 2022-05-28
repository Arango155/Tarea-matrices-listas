/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;


import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ClaseC {
 
   ArrayList<ClaseCe> listaA = new ArrayList();
   ArrayList<ClaseCe> listaC = new ArrayList();
   ArrayList<ClaseCe> listaG = new ArrayList();
   ArrayList<ClaseCe> lista = new ArrayList();
   
   
   public String Input(String text){
      return JOptionPane.showInputDialog(text);
   }
   
   
   public void Tabla_Alumno(){
     String nombre = Input("Nombre del alumno ");
     String aleas = Input("Aleas del alumno ");
     String codigo = Input("Codigo del alumno ");
     String telefono = Input("Numero de telefono ");
     String correo = Input("Correo electronico ");
     
     ClaseCe book = new ClaseCe();
     
     book.setNombre(nombre);
     book.setAleas(aleas);
     book.setCodigo(codigo);
     book.setTelefono(telefono);
     book.setCorreo(correo);
     listaA.add(book);
     lista.add(book);
   }
   
      public void Tabla_Curso(){
     String nombrec = Input("Nombre del curso ");
     String codigoc = Input("Codigo del curso ");
     
     ClaseCe book2 = new ClaseCe();
     
     book2.setCodigoC(codigoc);
     book2.setNombreC(nombrec);
     listaC.add(book2);
     lista.add(book2);
   }
      
      public void Tabla_Grado(){
     String codigog = Input("Codigo del grado ");
     String des = Input("Descripcion ");
     
     ClaseCe book3 = new ClaseCe();
     
     book3.setCodigoG(codigog);
     book3.setDes(des);
     listaG.add(book3);
     lista.add(book3);
   }
   
    
   
    public void mostrarTransacciones(){
      String string="";
      for(int i=0;i<lista.size();i++){
         string+="\nDatos Generales\n";
         string+="Nombre: "+lista.get(i).getNombre()+"\n";
         string+="Aleas: "+lista.get(i).getAleas()+"\n";
         string+="Codigo: "+lista.get(i).getCodigo()+"\n";
         string+="Telefono: "+lista.get(i).getTelefono()+"\n";
         string+="Correo: "+lista.get(i).getCorreo()+"\n";
          string+="Nombre del curso: "+lista.get(i).getNombreC()+"\n";
         string+="Codigo del curso: "+lista.get(i).getCodigoC()+"\n";
         string+="Codigo del grado: "+lista.get(i).getCodigoG()+"\n";
         string+="Descripcion: "+lista.get(i).getDes()+"\n";
      }
      
      JOptionPane.showMessageDialog(null, string);
   }
      
      
   
   public void mostrarTransaccionesA(){
      String string="";
      for(int i=0;i<listaA.size();i++){
         string+="\nTabla_Alumno\n";
         string+="Nombre: "+listaA.get(i).getNombre()+"\n";
         string+="Aleas: "+listaA.get(i).getAleas()+"\n";
         string+="Codigo: "+listaA.get(i).getCodigo()+"\n";
         string+="Telefono: "+listaA.get(i).getTelefono()+"\n";
         string+="Correo: "+listaA.get(i).getCorreo()+"\n";
         
      }
      
      JOptionPane.showMessageDialog(null, string);
   }
   
   public void mostrarTransaccionesC(){
      String string="";
      for(int i=0;i<listaC.size();i++){
         string+="\nTabla_Curso\n";
         string+="Nombre del curso: "+listaC.get(i).getNombreC()+"\n";
         string+="Codigo del curso: "+listaC.get(i).getCodigoC()+"\n";

      }
      
      JOptionPane.showMessageDialog(null, string);
   }
   
    public void mostrarTransaccionesG(){
      String string="";
      for(int i=0;i<listaG.size();i++){
         string+="\nTabla_Curso\n";
         string+="Codigo del grado: "+listaG.get(i).getCodigoG()+"\n";
         string+="Descripcion: "+listaG.get(i).getDes()+"\n";

      }
      
      JOptionPane.showMessageDialog(null, string);
   }
   
   
   
   
   
   
   
   
   
   public void clearListBook(){
      listaA.clear();
   }
   
}