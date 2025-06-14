/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;


public class School {
    public static void main(String [] args){
        var builder = new Student.StudentBuilder()
                .setId(1)
                .setMajor("SE")
                .setName("Ahmad")
                .setGPA(67);
        Student s = builder.build();
        
        System.out.println("Name = " + s.Name);
        
        var student2 = new Student.StudentBuilder();
        
        student2.setId(5).setMajor("CS").setName("Jalal").setGPA(99);
        var studentObj = student2.build();
        
    }
}
