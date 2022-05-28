package proyecto;

import javax.swing.JOptionPane;


public class ClaseP  {
    private String[] vectorTransacciones;  
    private String[] vectorTransaccionesA;
    private String[] vectorTransaccionesC;
    private String[] vectorTransaccionesG;
    private int indiceVector;
    private int indiceVectorA;
    private int indiceVectorC;
    private int indiceVectorG;
    
     public ClaseP(){
        vectorTransacciones= new String[10000000];
        this.indiceVector=0;
        vectorTransaccionesA= new String[10000000];
        this.indiceVectorA=0;
        vectorTransaccionesC= new String[10000000];
        this.indiceVectorC=0;
        vectorTransaccionesG= new String[10000000];
        this.indiceVectorG=0;
 
     }
     
      public String Input(String text){
      return JOptionPane.showInputDialog(text);
   }
     
      
    public String alumno (String codigo, String telefono, String nombre, String aleas, String correo){
        String resultado = "";
        this.registrarTransaccionA(" ",nombre,resultado, codigo, "", telefono,"",aleas,"",correo);
        return "";
    }
    
        private void registrarTransaccionA(String a_, String nombre, String resultado, String codigo, String string, String telefono, String string0, String aleas, String string1, String correo) {
         indiceVector= indiceVector+1;
         indiceVectorA= indiceVectorA+1;
        vectorTransacciones[indiceVector]="El alumno "+nombre+" con aleas "+aleas+" cuenta con el numero de codigo "+codigo +", numero telefonico "+telefono+" y su correo electronico es: " +correo+"\n";
        vectorTransaccionesA[indiceVectorA]="El alumno "+nombre+" con aleas "+aleas+" cuenta con el numero de codigo "+codigo +", numero telefonico "+telefono+" y su correo electronico es: " +correo+"\n";
    }
        
         public String curso (String nc, String cc){
        String resultado = "";
        this.registrarTransaccionC(" ", nc,"", cc,"", resultado);
        return "";
    }
    
             private void registrarTransaccionC(String a_, String nc, String string, String cc, String string0, String resultado) {
      indiceVector= indiceVector+1;
      indiceVectorC= indiceVectorC+1;
      vectorTransacciones[indiceVector]= "El curso tiene como nombre "+nc+" y el codigo de este es "+cc+"\n";
      vectorTransaccionesC[indiceVectorC]= "El curso tiene como nombre "+nc+" y el codigo de este es "+cc+"\n";
    }
             
        public String grado (String cg, String des){
        String resultado = "";
        this.registrarTransaccionG(" ", cg,""+des);
        return "";
    }
        
            private void registrarTransaccionG(String a_, String cg, String des) {
          indiceVector= indiceVector+1;
          indiceVectorG= indiceVectorG+1;
      vectorTransacciones[indiceVector]= "El codigo del grado es "+cg+" y la descripcion dada es "+des+"\n";
      vectorTransaccionesG[indiceVectorG]= "El codigo del grado es "+cg+" y la descripcion dada es "+des+"\n";
    }


    public void mostrarTransacciones(){
        try{       
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i] != null){
                    System.out.println(vectorTransacciones[i]);
                }
            }
            System.out.println("");
            for(String transaccion : vectorTransacciones){
                if(transaccion != null){
                   
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        
    }
    
        public void mostrarTransaccionesA(){
        try{       
            for (int i=1; i<vectorTransaccionesA.length;i++){
                if(vectorTransaccionesA[i] != null){
                    System.out.println(vectorTransaccionesA[i]);
                }
            }
            System.out.println("");
            for(String transaccion : vectorTransaccionesA){
                if(transaccion != null){
                   
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        
    }
          public void mostrarTransaccionesC(){
        try{       
            for (int i=1; i<vectorTransaccionesC.length;i++){
                if(vectorTransaccionesC[i] != null){
                    System.out.println(vectorTransaccionesC[i]);
                }
            }
            System.out.println("");
            for(String transaccion : vectorTransaccionesC){
                if(transaccion != null){
                   
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        
    }

           public void mostrarTransaccionesG(){
        try{       
            for (int i=1; i<vectorTransaccionesG.length;i++){
                if(vectorTransaccionesG[i] != null){
                    System.out.println(vectorTransaccionesG[i]);
                }
            }
            System.out.println("");
            for(String transaccion : vectorTransaccionesG){
                if(transaccion != null){
                   
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        
    }

   
}