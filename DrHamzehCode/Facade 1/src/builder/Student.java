
package builder;


public class Student {
    public int Id;
    public String Name;
    public String Major;
    public double GPA;
    
    private Student(StudentBuilder builder){
        this.Id = builder.Id;
        this.Name = builder.Name;
        this.GPA = builder.GPA;
        this.Major = builder.Major;
    }
    public static class StudentBuilder {
        private int Id;
        public StudentBuilder setId(int id){
            this.Id = id;
            return this;
        }
        private String Name;
        public StudentBuilder setName(String name){
            this.Name = name;
            return this;
        }
        private String Major;
        public StudentBuilder setMajor(String major){
            this.Major = major;
            return this;
        }
        private double GPA;
        public StudentBuilder setGPA(double gpa){
            this.GPA = gpa;
            return this;
        }
        
        public Student build(){
            return new Student(this);
        }
        
    }
    
}
