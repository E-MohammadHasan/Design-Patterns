
package abstractfactoryexample2;


public class StudentReportsFactory implements ReportsFactory {

    @Override
    public AttendanceReport getAttendanceReport() {
        return new StudentAttandanceReport();
    }

    @Override
    public PerformanceReport getPerformanceReport() {
        return new StudentPerformanceReport();
    }
    
}
