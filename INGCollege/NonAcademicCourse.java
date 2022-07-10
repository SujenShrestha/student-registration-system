/** The NonAcademicCourse class is a subclass of the Course class
 * It inherits various methods from the parent class
 
 */
public class NonAcademicCourse extends Course
{
    //Instance Variable Declaration
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite) {
        super(courseID, courseName, duration);//super class constructor
        this.instructorName = instructorName;
        this.startDate = startDate;
        this.completionDate = completionDate;
        this.examDate = examDate;
        this.prerequisite = prerequisite;
        this.isRegistered = false;
        this.isRemoved = false;
    }
    
    public String getInstructorName()
    {
        return this.instructorName;
    }
    
    public String getStartDate()
    {
        return this.startDate;
    }
    
    public String getCompletionDate()
    {
        return this.completionDate;
    }
    
    public String getExamDate()
    {
        return this.examDate;
    }
    
    public String getPrerequisite()
    {
        return this.prerequisite;
    }
    
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
    
    public boolean getIsRemoved()
    {
        return this.isRemoved;
    }
    
    //Using mutator method to set the values of variables
    public void setInstructorName(String instructorName){
        if(this.isRegistered == false) {/*Method executes if the condition is false*/
            this.instructorName = instructorName;
        }
        else {/*Else this method gets executed*/
            System.out.println("The Course has already been registered. Instructor cannot change");
        }
    }
    
    //Method to register a course
    public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate) {
        if(this.isRegistered == false) {/*Method eecutes if isRegistered is true*/
            super.setCourseLeader(courseLeader);
            setInstructorName(instructorName);
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            isRegistered = true;
            System.out.println("The course has been registered.");
            System.out.println("Course leader: " + courseLeader + "\n" + "Instructor name: " + instructorName +"\n" + 
            "Start Date: " + startDate  + "\n" + "Completion Date: " + completionDate + "\n" + "Exam Date: " + examDate);
        }
        else{/*Else this method gets executed*/
            System.out.println("The course has already been registered.");
        }
    }
    
    //Method to remove a course
    public void remove(){
        super.setCourseLeader("");/*Calling setter from parent class*/
        this.instructorName = "";
        this.startDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = true;
        if (this.isRemoved == true){/* Method executes if isRemoved is true*/
            System.out.println("The course has been removed.");
        }
    }
    
    public void display(){
        super.display();/*Calling display method from parent class*/
        if(this.isRegistered == true){/*Method executes if the condition is true*/
            System.out.println("Instructor Name: " + instructorName + "\n" + "Start Date: " + startDate + 
            "\n" + "Completion Date: " + completionDate + "\n" + "Exam Date: " + examDate);
        }
    } 
}