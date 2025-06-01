package FacadePattern;

public class StudentRegistrationFacade {
  
    public void registerStudent(String name){
      
        var studentInfo = new StudnetInfoSystem();
        var data = studentInfo.getStudentInfo(name);
        
        var finance = new FinanceSystem();
        var financeData = finance.getPaymentsInfo(name);
        
        var elearning = new ElearningSystem();
        elearning.addStudentToSystem(name);
        
        var teams = new TeamsSystem();
        teams.addStudentToTeams(name);
       
   } 
    
}
