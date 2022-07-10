/**AcademicCourse class is a subclass of the Course class
 * It inherits various methods from the parent class
 
 */
public class AcademicCourse extends Course
{
    //Instance Variable Declaration
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;
    
    //Creating a parameterzed constructor
    AcademicCourse(String courseID, String courseName, int duration, String level, String credit,int numberOfAssessments) {
        super(courseID, courseName, duration);/*Calling Super Class Constructor*/
        this.lecturerName = "";
        this.level = level;
        this.credit = credit;
        this.startingDate = "";
        this.completionDate = "";
        this.numberOfAssessments = numberOfAssessments;
        this.isRegistered = false;
    }
    
    //Assigning accessor methods to return and initialize the values of variables
    public String getLecturerName()
    {
        return this.lecturerName;
    }
    
    public int getNumberOfAssessments()
    {
        return this.numberOfAssessments;
    }
    
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
    
    //Using mutator method to set the values of variables
    public void setLecturerName(String lecturer){
        this.lecturerName = lecturer;
    }
    
    public void setNumberOfAssessments(int assessments){
        this.numberOfAssessments = assessments;
    }
    
    //Method to register a course
    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate) {
        if(this.isRegistered == true){ /*method executes if the condtion is true*/
            System.out.println("The academic course has already been registered.");
            System.out.println("Lecturer name: " + lecturerName + "\n" + "Starting Date:  " + startingDate + "\n"
             + "Completion Date: " + completionDate);
        }
        else{/*else this method is executed*/
            super.setCourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.isRegistered = true; 
            System.out.println("The academic course has been registered successfully.");
            System.out.println("Course Leader: " + courseLeader + "\n"+ "Lecturer Name: " + lecturerName + "\n" + 
            "Starting Date: " + startingDate + "\n" + "Completion Date: " + completionDate);
        }
    }
    
    public void display(){
        super.display();/*Calling display method from parent class*/
        if(this.isRegistered == true){/*Method executes if the condition is true*/
            System.out.println("Lecturer Name: " + lecturerName + "\n" + "Level: " + level 
            + "\n" + "Credit: " + credit + "\n" + "Starting Date: " + startingDate + "\n" + "Completion Date: " + 
            completionDate + "\n" + "No. of assessments: " + numberOfAssessments);
        }
    } 
}