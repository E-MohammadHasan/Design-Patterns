
package abstractfactoryexample2;


public class StudentPerformanceReport implements PerformanceReport {

    @Override
    public String title() {
        return "Student performance report";
    }

    @Override
    public void Print() {
        System.out.println("Student performance report");
    }
    
}
