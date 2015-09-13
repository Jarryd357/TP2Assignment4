/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP_Principles;

/**
 *
 * @author user
 */
public class PolymorphismDemo2 extends PolymorphismDemo1
{
    //Football Jersey Class 
    
   private String jerseyColour;
   private String sleeveLength;
   
   public PolymorphismDemo2(String playerName, int playerNumber, String jerseyColour, String sleeveLength)
   {
      super(playerName,playerNumber); 
      this.jerseyColour = jerseyColour;
      this.sleeveLength = sleeveLength;
   }

    public String getJerseyColour() {
        return jerseyColour;
    }

    public void setJerseyColour(String jerseyColour) {
        this.jerseyColour = jerseyColour;
    }

    public String getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(String sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    @Override
    public String toString() 
    {
        return "Player Name is" + playerName + ", and Number is " + playerNumber + "and jersey colour is" + jerseyColour + "and sleeve length is" + sleeveLength;
    }
       
}
