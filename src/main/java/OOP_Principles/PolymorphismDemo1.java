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
public class PolymorphismDemo1 
{
   //Football Player Class 
    
   protected String playerName;
   protected int playerNumber;
   
   public PolymorphismDemo1(String playerName, int playerNumber)
   {
      this.playerName = playerName;
      this.playerNumber = playerNumber;
   }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
   
}
