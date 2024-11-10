
//BaseClass
abstract class Course{
    // Course(){

    // }
    private String courseName;
    private String courseCode;
    Course(String courseName, String courseCode){
        this.courseCode=courseCode;
        this.courseName=courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseCode(){
        return courseCode;
    }
    public abstract void startCourse();
}
//Interface
interface Interactive{
    public void conductLiveSession();
    public void giveQuiz();
}
//Sub Class
class ScienceCourse extends Course implements Interactive {
    ScienceCourse(String courseName,String courseCode){
        super(courseName, courseCode);
    }
    public void startCourse(){
        System.out.println("Starting Science course: " + getCourseName());
    }
    public void conductLiveSession(){
        System.out.println("Conducting Live session for Science Course.");
    }
    public void giveQuiz(){
        System.out.println("Giving quiz for Science Course.");
    }
}
class ArtsCourse extends Course implements Interactive{
    public ArtsCourse(String courseName, String courseCode){
        super(courseName,courseCode);
    }
    public void startCourse(){
        System.out.println("Starting Arts Course: " + getCourseName());
    }
    public void conductLiveSession(){
        System.out.println("Conducting Live session for Arts course.");
    }
    public void giveQuiz(){
        System.out.println("Giving quiz for Arts Course.");
    }
}
// TechnologyCourse
 class TechnologyCourse extends Course implements Interactive {
    // TechnologyCourse(){

    // }
     public TechnologyCourse(String courseName, String courseCode) {
         super(courseName, courseCode);
        } 
         public void startCourse() {
             System.out.println("Starting Technology course: " + getCourseName()); 
         } 
        public void conductLiveSession() { 
             System.out.println("Conducting live session for Technology course."); 
        }

         public void giveQuiz() {
         System.out.println("Giving quiz for Technology course.");
    }
}
final class ProgrammingCourse extends TechnologyCourse{
    public ProgrammingCourse(String courseName, String courseCode){
        super(courseName, courseCode);
    }
    public void startCourse(){
        System.out.println("Starting Programming Course:" + getCourseName());
        System.out.println("Providing Specific Programming Materials.");
    }
}
 public class Education{
    public static void main(String[] args) {
        ScienceCourse sc=new ScienceCourse("Mathematics","MA28005");
        ArtsCourse ac=new ArtsCourse("History","HIS1024");
        TechnologyCourse tc=new TechnologyCourse("Information Technology", "IT2027");
        ProgrammingCourse pc=new ProgrammingCourse("JavaProgramming", "IT28402");
        sc.startCourse();
        sc.conductLiveSession();
        sc.giveQuiz();
        ac.startCourse();
        ac.conductLiveSession();
        ac.giveQuiz();
        tc.startCourse();
        tc.conductLiveSession();
        tc.giveQuiz();
        pc.startCourse();
    }
}