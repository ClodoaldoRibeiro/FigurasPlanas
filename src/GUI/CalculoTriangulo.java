package GUI;

import br.planas.Triangulo;
import javax.swing.JOptionPane;

public class CalculoTriangulo {
  final int TAMANNHO =10;
  int posicao=0;
    
  public static void main(String Args[]){
    
      
      Triangulo T1 = new Triangulo(10, 10 , 10);        
        Triangulo T2;
       
   //   JOptionPane.showMessageDialog (null, "Tipo : " + T1.getTipoT()); 
        
      
        T1.mostrarDados();  
        
        System.out.println("Tipo do Triangulo 1 : "+ T1.getTipoT());
        
        T2 = T1; // Aliasing         
        System.out.println("****************************************");
        
        T2.setLados(3,4,5);
        T2.mostrarDados();          
        
        T2.tipoTriangulo(T2.getLado1(),T2.getLado2(), T2.getLado3());
        System.out.println("Tipo do Triangulo 2 : "+ T2.getTipoT());
        


  }  
  
  }
