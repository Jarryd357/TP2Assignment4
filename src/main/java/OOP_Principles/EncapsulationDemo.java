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
public class EncapsulationDemo 
{
    private String studName;
    private int studAge;
    private double studHeightMetres;
    
    public EncapsulationDemo(String studName, int studAge, double studHeightMetres)
    {
        this.studName = studName;
        this.studAge = studAge;
        this.studHeightMetres = studHeightMetres;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getStudAge() {
        return studAge;
    }

    public void setStudAge(int studAge) {
        this.studAge = studAge;
    }

    public double getStudHeightMetres() {
        return studHeightMetres;
    }

    public void setStudHeightMetres(double studHeightMetres) {
        this.studHeightMetres = studHeightMetres;
    }
    
    @Override
    public String toString()
    {
        return "Name: " + studName + ", Age :" + studAge + ", Height in Metres : " + studHeightMetres;
    }
    
    public static void main (String [] args)
    {
        EncapsulationDemo student =  new EncapsulationDemo("F.Flintstone",34,1.3);
        System.out.println(student.toString());
    }        
    
}
