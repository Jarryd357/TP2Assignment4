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
public class InheritanceChildDemo2 extends InheritanceParentDemo
{
    private String crossBall;
    
    public InheritanceChildDemo2()
    {
        super();
        crossBall = "crosses football into box";
    }
    
    @Override
    public String toString()
    {
        return kickBall() + " and " + crossBall;
    }
    
    public static void main (String [] args)
    {
        InheritanceChildDemo2 winger = new InheritanceChildDemo2();
        System.out.println(winger.toString());
    }
}
