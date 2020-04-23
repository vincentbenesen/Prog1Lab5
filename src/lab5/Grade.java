/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 * Grade class which contains two attributes; the name of the subject and the grade 
 * of the student.
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class Grade {
    
    private String subject;
    private char gradeLetter;
    
    public Grade (String subject, char gradeLetter){
        this.subject = subject;
        this.gradeLetter = gradeLetter;
        
    }
    
    public String getSubject(){
        return subject;
    }
    
    public char getGradeLetter(){
        return gradeLetter;
    }
    
    public void setSubject(String newSubject){
        subject = newSubject;
    }
    
    public void setGradeLetter(char newGradeLetter){
        gradeLetter = newGradeLetter;
    }
    
    @Override
    public String toString(){
        return "Subject: " + subject + "\n" + "grade: " 
               + gradeLetter;
    }
    
    public boolean equals(Grade newGrade){
        return subject.equals(newGrade.subject);
    }
}
