package boletin7.pkg2;

import javax.swing.JOptionPane;


/**
 *
 * @author julianlinux
 */
public class SumaResta {
    
    
    private short num1;
    private short num2;
    
    // Constructores
    public SumaResta(){}
    
    
    public SumaResta(short n1,short n2){
        this.num1=n1;
        this.num2=n2;
           
    }
   
   //Métodos
    
    public short getNumero(){
        String respuesta= JOptionPane.showInputDialog("Introduce el valor del numero 1: ");
                short valor= Short.parseShort(respuesta);
                return valor;
    }
    
    public void comparar(short n1,short n2){
       
        
        if (n1>= n2){
            JOptionPane.showMessageDialog(null,"Resta :"+(n1-n2));
            
        }
        
        JOptionPane.showMessageDialog(null, "Suma : "+(n1+n2));
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
