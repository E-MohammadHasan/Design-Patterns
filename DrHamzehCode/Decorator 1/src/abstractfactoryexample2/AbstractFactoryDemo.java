
package abstractfactoryexample2;


public class AbstractFactoryDemo {
    public static void ShowCase(ReportsFactory factory){
        var attendance = factory.getAttendanceReport();
        attendance.Print();
        
        var performance = factory.getPerformanceReport();
        performance.Print();
    }
    
    public static void main(String [] args){
        ShowCase(new TeacherReportsFactory());
    }
}
