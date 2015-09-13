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
public class InheritanceChildDemo1 extends InheritanceParentDemo
{
    private String saveShot;
    
    public InheritanceChildDemo1()
    {
        super();
        saveShot = "saves shots at goal";
    }
    
    @Override
    public String toString()
    {
        return kickBall() + " and " + saveShot;
    }
    
    public static void main (String [] args)
    {
        InheritanceChildDemo1 goalKeeper = new InheritanceChildDemo1();
        System.out.println(goalKeeper.toString());
    }        
}
