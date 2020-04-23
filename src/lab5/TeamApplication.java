/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class TeamApplication {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
       
        Team team1 = new Team("Lakers");
        
        System.out.println("The name of the team is " + team1.getTeamName());
        team1.setTeamName("Clippers");
        System.out.println("The new name of the team is " + team1.getTeamName());
        System.out.println(team1);
        
        Team team2 = new Team("Clippers");
        if (team1.equals(team2)) {
            System.out.println("The name of both teams are the same ");
        } else {
            System.out.println("The two teams has different name");
        }
    }
}