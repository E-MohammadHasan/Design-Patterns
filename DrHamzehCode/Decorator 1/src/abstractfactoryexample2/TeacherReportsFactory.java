/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactoryexample2;

/**
 *
 * @author MAXHUB
 */
public class TeacherReportsFactory implements ReportsFactory {
    @Override
    public AttendanceReport getAttendanceReport() {
        return new TeacherAttendanceReport();
    }

    @Override
    public PerformanceReport getPerformanceReport() {
        return new TeacherPerformanceReport();
    }
}
