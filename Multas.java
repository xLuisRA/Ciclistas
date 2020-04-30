/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multas;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Luis_2
 */
public class Multas {

    
    public static void main(String[] args) {
        LeerArchivo prueba = new LeerArchivo();
        prueba.lee();
        String dividiendo []= new String[100];
        dividiendo[].separar(prueba);
        for (int i = 0; i < dividiendo.length; i++) {
            System.out.println(dividiendo[i]);
        }
    }
    
    
    
    
    
    
    
    
    
}    
    class LeerArchivo{ 
        

                    //leemos el archivo
        public String lee(){
            String dato="";
            try {
                FileReader archivo = new FileReader("E:\\PROJECTOS_JAVA\\GITHUB\\Ciclistas\\Multas\\MULTAS5.txt");
                
                int linea =archivo.read();
                
                while(linea!=-1){
                       char letra=(char)linea; //lo convierot en String
                       linea=archivo.read();
                       dato = String.valueOf(letra);
                       System.out.print(dato);
                        
                
                        
                        
                        
                }
                archivo.close();
            } catch (IOException ex) { // encaso de haber un error nos mostrara este mensaje
                Logger.getLogger(Multas.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(" Archivo no encontrado");
            }
            return dato;
        }
        
        public String[] separar(String aaa ){
            
            String[] division = aaa.split(" ");
         
         return division;   
        }
    }

        


    class EscribirArchivo{
        
        public void escribir(){
            
            String linea2 ="Escribir es importante";
            
            try {
                FileWriter escribiendo = new FileWriter("E:\\PROJECTOS_JAVA\\GITHUB\\Ciclistas\\Multas\\Escribiendo.txt");
                for (int i = 0; i < linea2.length(); i++) {
                    escribiendo.write(linea2.charAt(i));
                    
                }escribiendo.close();
            } catch (IOException ex) {
                Logger.getLogger(EscribirArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }
