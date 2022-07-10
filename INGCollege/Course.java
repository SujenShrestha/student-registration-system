
/**Course class is a parent of the AcademicCourse and NonAcademicCourse class
 * It's various methods can be called from the child classes.
 
 */
public class Course
{
    //Instance Variable Declaration
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
    
    //Creating a parameterized constructor
    public Course(String courseID, String courseName, int duration){
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseLeader = "";
        this.duration = duration;
        }
    
    //Assigning accessor methods to return and initialize the values of variables
    public String getCourseID()
    {
        return this.courseID;
    }
    
    public String getCourseName()
    {
        return this.courseName;
    }
    
    public String getCourseLeader()
    {
        return this.courseLeader;
    }
    
    public int getDuration()
    {
        return this.duration;
    }
    
    //Using mutator method to set the values of variables
    public void setCourseLeader(String courseLeader){
        this.courseLeader = courseLeader;
    }
    
    public void display(){
        if(this.courseLeader.equals("")){ /*method executes if the courseLeader is empty String*/
            System.out.println("The Course details are:");
            System.out.println("Course ID: " + courseID + "\n" + "Course Name: " + courseName + "\n" + "Duration: " 
            + duration);
        }
        else{/*method executes when courseLeader is not empty*/
            System.out.println("The Course details are:");
            System.out.println("Course ID: " + courseID + "\n" + "Course Name: " + courseName + "\n" + "Duration: " 
            + duration + "\n" + "Course Leader: " + courseLeader);
        }
    }
}