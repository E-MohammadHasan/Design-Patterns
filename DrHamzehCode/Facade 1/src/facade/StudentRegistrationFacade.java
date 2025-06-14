
package facade;


public class StudentRegistrationFacade {
    public void registerStudent(String name){
        var studentInfo = new StudentInfoSystem();
        var data = studentInfo.getStudentInfo(name);
        var finance = new FinanceSystem();
        var findata = finance.getPaymentInfo(name);
        var elearning = new ELearningSystem();
        elearning.addStudentToSystem(name);
        var teams = new TeamsSystem();
        teams.addStudentToTems(name);
    }
}
