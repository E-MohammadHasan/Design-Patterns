
package abstractfactoryexample2;


public class TeacherAttendanceReport implements AttendanceReport {
    @Override
    public String title() {
        return "Teacher attendance report";
    }

    @Override
    public void Print() {
        System.out.println("Teacher attendance report");
    }
}
