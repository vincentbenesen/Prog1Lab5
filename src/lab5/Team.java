/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 * Team class with one attribute, which is the name of the team.
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class Team {
    
    private String teamName;
    
    public Team (String teamName){
        this.teamName = teamName;
    }
    
    public String getTeamName(){
        return teamName;
    }
    
    public void setTeamName(String newTeamName){
        teamName = newTeamName;
    }
    
    @Override
    public String toString(){
        return "The name of the team is " + teamName;
    }
    
    public boolean equals(Team newName){
        return teamName.endsWith(newName.teamName);
    }
}
