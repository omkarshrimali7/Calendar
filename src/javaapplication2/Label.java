/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.awt.Point;

/**
 *
 * @author Abhinav
 */
public class Label  extends  javax.swing.JLabel{
     private static final String uiClassID = "LabelUI";
     private String text = ""; 
      private int verticalTextPosition = CENTER;
    private int horizontalTextPosition = CENTER;
     public Label(String text,Point P) {
        settext(text);
     position(P);
     }
     public void position(Point P){
     Point older=this.getLocation();
   older=P;
  
     
  
     }
      public String gettext() {
        return text;
    }
  public void settext(String text){
       String oldValue = this.text;
        this.text = text;
        firePropertyChange("text", oldValue, text);
    
    }
      
}
