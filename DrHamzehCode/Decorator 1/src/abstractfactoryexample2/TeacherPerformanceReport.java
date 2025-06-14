
package abstractfactoryexample2;


public class TeacherPerformanceReport implements PerformanceReport {
    @Override
    public String title() {
        return "Teacher performance report";
    }

    @Override
    public void Print() {
        System.out.println("Teacher performance report");
    }
}
