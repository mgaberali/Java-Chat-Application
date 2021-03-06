/***********************************************************************
 * Module:  Advertisement.java
 * Author:  Mohamed
 * Purpose: Defines the Class Advertisement
 ***********************************************************************/

package datatypes;

import java.awt.Image;
import java.io.Serializable;
import java.util.*;


public class Advertisement implements Serializable{

   private String title;
   private Image image;
   
  
   public Image getImage() {
      return image;
   }
   
   /** @param newImage
    **/
   public void setImage(Image newImage) {
      image = newImage;
   }
   
   /**
    */
   public String getTitle() {
      return title;
   }
   
   /** @param newTitle
    * */
   public void setTitle(String newTitle) {
      title = newTitle;
   }

}