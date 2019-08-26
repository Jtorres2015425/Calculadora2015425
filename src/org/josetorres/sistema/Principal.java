
package org.josetorres.sistema;

import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Principal extends Application {
    
    

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculadoraView.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("calculadoraestilos2.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);}}
    
    
   
    
    
    
  /*  public static void main(String[] args) {
     
        int opcion;
        opcion = 0;
        int opcion2;
        opcion2 = 0;
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Elija una opcion"
                + " \n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division \n 5.Salir"));
        switch(opcion){
                case 1:
           do{
        Suma suma;
        suma = new Suma (0,0);
        suma.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer Valor"));
        suma.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo Valor"));
        JOptionPane.showMessageDialog(null,"El total de la sumatoria es " + (suma.valor1 + suma.valor2));
         opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea Continuar?"
                + " \n 1. Si"+"      "+"2. No"));}
           while (opcion2 == 1);
          break;
                case 2:
        Resta resta;
        resta = new Resta (0,0);
        resta.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer Valor"));
        resta.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo Valor"));
        JOptionPane.showMessageDialog(null,"El total de la sumatoria es " +(resta.valor1 - resta.valor2));
          break;   
                case 3:
        Multiplos multiplo;
        multiplo = new Multiplos (0,0);
        multiplo.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer Valor"));
        multiplo.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo Valor"));
        JOptionPane.showMessageDialog(null,"El total de la sumatoria es " +(multiplo.valor1 * multiplo.valor2));            
                    break;
       }}
    while (opcion != 5);}
}
    */

        
 
 


    
    
    

