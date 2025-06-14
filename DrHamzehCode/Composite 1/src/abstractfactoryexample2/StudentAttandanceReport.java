
package abstractfactoryexample2;


public class StudentAttandanceReport implements AttendanceReport {
    @Override
    public String title() {
        return "Student attendance report";
    }

    @Override
    public void Print() {
        System.out.println("Student attendance report");
    }
}
