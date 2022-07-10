import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * The INGCollege class is created for developing a GUI that stores the details of Course , AcademicCourse and NonAcademicCourse classes.
   It contains a main method which accesses the functions and methods of every other classes within the project.

 * @author (Sujen Shrestha)
 * @Group N4
 * @ID (20049250)
 */
public class INGCollege
{
    public static void main (String[] args)
    {
        //Top level Container storing UI elements
        JFrame f = new JFrame ();
        f.setTitle("ING College");
        f.setBounds(40,5,1280,720);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        //Jpanel for storing other panels
        JPanel p = new JPanel ();
        p.setBounds(0,0,1265,658);
        p.setBorder(BorderFactory.createLineBorder(Color.decode("#143D59")));
        p.setBackground(Color.decode("#143D59"));
        p.setLayout(null);
        f.add(p);

        //Jpanel for sidebar
        JPanel pHome = new JPanel ();
        pHome.setBounds(0,0,425,658);
        pHome.setBorder(BorderFactory.createLineBorder(Color.decode("#143D59")));
        pHome.setBackground(Color.decode("#143D59"));
        pHome.setLayout(null);
        p.add(pHome);

        //Jlabel for sidebar
        JLabel lblWelcome = new JLabel ("ING College Registration");
        lblWelcome.setBounds(90,150,450,80);
        lblWelcome.setFont(new Font("helvetica", Font.BOLD, 20));
        lblWelcome.setForeground(Color.decode("#FAD744"));
        pHome.add(lblWelcome);

        JLabel lblMessage = new JLabel ("Please select a course to register");
        lblMessage.setBounds(67,300,450,80);
        lblMessage.setFont(new Font("helvetica", Font.BOLD, 18));
        lblMessage.setForeground(Color.decode("#FAD744"));
        pHome.add(lblMessage);

        //JButton for sidebar
        JButton btnAcademic = new JButton("Academic Course");
        btnAcademic.setBounds(112,420,200,30);
        btnAcademic.setFont(new Font("HELVETICA", Font.BOLD, 14));
        btnAcademic.setBackground(Color.decode("#EF5455"));
        btnAcademic.setForeground(Color.decode("#000000"));
        pHome.add(btnAcademic);

        JButton btnNonAcademic = new JButton("Non Academic Course");
        btnNonAcademic.setBounds(112,520,200,30);
        btnNonAcademic.setFont(new Font("HELVETICA", Font.BOLD, 14));
        btnNonAcademic.setBackground(Color.decode("#EF5455"));
        btnNonAcademic.setForeground(Color.decode("#000000"));
        pHome.add(btnNonAcademic);

        //JPanel for Academic Course
        JPanel pAc = new JPanel ();
        pAc.setBounds(425,0,840,690);
        pAc.setBorder(BorderFactory.createLineBorder(Color.decode("#2B3252")));
        pAc.setBackground(Color.decode("#EF5455"));
        pAc.setLayout(null);
        p.add(pAc);

        //JLabels for academic course
        JLabel lblTitle = new JLabel ("ACADEMIC COURSE");
        lblTitle.setFont(new Font("Courier New", Font.BOLD, 40));
        lblTitle.setForeground(Color.decode("#FAD744"));
        lblTitle.setBounds(240,40,400,40);
        pAc.add(lblTitle);

        JLabel lblCourseID = new JLabel ("Course ID : ");
        lblCourseID.setBounds(50,150,200,30);
        lblCourseID.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblCourseID.setForeground(Color.decode("#143D59"));
        pAc.add(lblCourseID);

        JLabel lblCourseName = new JLabel ("Course Name : ");
        lblCourseName.setBounds(440,150,200,30);
        lblCourseName.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblCourseName.setForeground(Color.decode("#143D59"));
        pAc.add(lblCourseName);

        JLabel lblDuration = new JLabel ("Duration : ");
        lblDuration.setBounds(50,200,200,30);
        lblDuration.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblDuration.setForeground(Color.decode("#143D59"));
        pAc.add(lblDuration);

        JLabel lblLevel = new JLabel ("Level : ");
        lblLevel.setBounds(440,200,200,30);
        lblLevel.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblLevel.setForeground(Color.decode("#143D59"));
        pAc.add(lblLevel);

        JLabel lblCredit = new JLabel ("Credit : ");
        lblCredit.setBounds(50,250,200,30);
        lblCredit.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblCredit.setForeground(Color.decode("#143D59"));
        pAc.add(lblCredit);

        JLabel lblAssessments = new JLabel ("No. of Assessments : ");
        lblAssessments.setBounds(440,250,200,30);
        lblAssessments.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblAssessments.setForeground(Color.decode("#143D59"));
        pAc.add(lblAssessments);

        JLabel lblCourseLeader = new JLabel ("Course Leader : ");
        lblCourseLeader.setBounds(50,400,200,30);
        lblCourseLeader.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblCourseLeader.setForeground(Color.decode("#143D59"));
        pAc.add(lblCourseLeader);

        JLabel lblLecturer = new JLabel ("Lecturer Name : ");
        lblLecturer.setBounds(440,400,200,30);
        lblLecturer.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblLecturer.setForeground(Color.decode("#143D59"));
        pAc.add(lblLecturer);

        JLabel lblStartDate = new JLabel ("Starting Date : ");
        lblStartDate.setBounds(50,450,200,30);
        lblStartDate.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblStartDate.setForeground(Color.decode("#143D59"));
        pAc.add(lblStartDate);

        JLabel lblCompletionDate = new JLabel ("Completion Date : ");
        lblCompletionDate.setBounds(440,450,200,30);
        lblCompletionDate.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblCompletionDate.setForeground(Color.decode("#143D59"));
        pAc.add(lblCompletionDate);

        //JTextFields for academic course
        JTextField txtCourseID = new JTextField();
        txtCourseID.setBounds(220,150,150,30);
        pAc.add(txtCourseID);

        JTextField txtCourseName = new JTextField();
        txtCourseName.setBounds(640,150,150,30);
        pAc.add(txtCourseName);

        JTextField txtDuration = new JTextField();
        txtDuration.setBounds(220,200,150,30);
        pAc.add(txtDuration);

        JTextField txtLevel = new JTextField();
        txtLevel.setBounds(640,200,150,30);
        pAc.add(txtLevel);

        JTextField txtCredit = new JTextField();
        txtCredit.setBounds(220,250,150,30);
        pAc.add(txtCredit);

        JTextField txtAssessments = new JTextField();
        txtAssessments.setBounds(640,250,150,30);
        pAc.add(txtAssessments);

        JTextField txtCourseLeader = new JTextField();
        txtCourseLeader.setBounds(220,400,150,30);
        pAc.add(txtCourseLeader);

        JTextField txtLecturer = new JTextField();
        txtLecturer.setBounds(640,400,150,30);
        pAc.add(txtLecturer);

        JTextField txtStartDate = new JTextField();
        txtStartDate.setBounds(220,450,150,30);
        pAc.add(txtStartDate);

        JTextField txtCompletionDate = new JTextField();
        txtCompletionDate.setBounds(640,450,150,30);
        pAc.add(txtCompletionDate);

        //JButtons for academic course

        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(375,320,100,30);
        btnAdd.setFont(new Font("HELVETICA", Font.BOLD, 14));
        btnAdd.setBackground(Color.decode("#143D59"));
        btnAdd.setForeground(Color.decode("#FAD744"));
        pAc.add(btnAdd);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(375,520,100,30);
        btnRegister.setFont(new Font("HELVETICA", Font.BOLD, 14));
        btnRegister.setBackground(Color.decode("#143D59"));
        btnRegister.setForeground(Color.decode("#FAD744"));
        pAc.add(btnRegister);

        JButton btnDisplay = new JButton("Display");
        btnDisplay.setBounds(280,590,100,30);
        btnDisplay.setFont(new Font("HELVETICA", Font.BOLD, 14));
        btnDisplay.setBackground(Color.decode("#143D59"));
        btnDisplay.setForeground(Color.decode("#FAD744"));
        pAc.add(btnDisplay);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(470,590,100,30);
        btnClear.setFont(new Font("HELVETICA", Font.BOLD, 14));
        btnClear.setBackground(Color.decode("#143D59"));
        btnClear.setForeground(Color.decode("#FAD744"));
        pAc.add(btnClear);

        pAc.setVisible(true);

        //Panel for Non Academic Course
        JPanel pNac = new JPanel ();
        pNac.setBounds(425,0,840,690);
        pNac.setBorder(BorderFactory.createLineBorder(Color.decode("#2B3252")));
        pNac.setBackground(Color.decode("#EF5455"));
        pNac.setLayout(null);
        p.add(pNac);

        //JLabels for non academic
        JLabel lblTitleNac = new JLabel ("NON ACADEMIC COURSE");
        lblTitleNac.setFont(new Font("Courier New", Font.BOLD, 40));
        lblTitleNac.setForeground(Color.decode("#FAD744"));
        lblTitleNac.setBounds(200,40,550,40);
        pNac.add(lblTitleNac);

        JLabel lblCourseIDNac = new JLabel ("Course ID : ");
        lblCourseIDNac.setBounds(50,150,200,30);
        lblCourseIDNac.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblCourseIDNac.setForeground(Color.decode("#143D59"));
        pNac.add(lblCourseIDNac);

        JLabel lblCourseNameNac = new JLabel ("Course Name : ");
        lblCourseNameNac.setBounds(440,150,200,30);
        lblCourseNameNac.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblCourseNameNac.setForeground(Color.decode("#143D59"));
        pNac.add(lblCourseNameNac);

        JLabel lblDurationNac = new JLabel ("Duration : ");
        lblDurationNac.setBounds(50,200,200,30);
        lblDurationNac.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblDurationNac.setForeground(Color.decode("#143D59"));
        pNac.add(lblDurationNac);

        JLabel lblPrerequisiteNac = new JLabel ("Prerequisites : ");
        lblPrerequisiteNac.setBounds(440,200,200,30);
        lblPrerequisiteNac.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblPrerequisiteNac.setForeground(Color.decode("#143D59"));
        pNac.add(lblPrerequisiteNac);

        JLabel lblCourseLeaderNac = new JLabel ("Course Leader : ");
        lblCourseLeaderNac.setBounds(50,350,200,30);
        lblCourseLeaderNac.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblCourseLeaderNac.setForeground(Color.decode("#143D59"));
        pNac.add(lblCourseLeaderNac);

        JLabel lblInstructorNac = new JLabel ("Instructor Name : ");
        lblInstructorNac.setBounds(440,350,200,30);
        lblInstructorNac.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblInstructorNac.setForeground(Color.decode("#143D59"));
        pNac.add(lblInstructorNac);

        JLabel lblStartDateNac = new JLabel ("Start Date : ");
        lblStartDateNac.setBounds(50,400,200,30);
        lblStartDateNac.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblStartDateNac.setForeground(Color.decode("#143D59"));
        pNac.add(lblStartDateNac);

        JLabel lblCompletionDateNac = new JLabel ("Completion Date : ");
        lblCompletionDateNac.setBounds(440,400,200,30);
        lblCompletionDateNac.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblCompletionDateNac.setForeground(Color.decode("#143D59"));
        pNac.add(lblCompletionDateNac);

        JLabel lblExamDateNac = new JLabel ("Exam Date : ");
        lblExamDateNac.setBounds(50,450,200,30);
        lblExamDateNac.setFont(new Font("helvetica", Font.PLAIN, 20));
        lblExamDateNac.setForeground(Color.decode("#143D59"));
        pNac.add(lblExamDateNac);

        //JTextFields for non academic
        JTextField txtCourseIDNac = new JTextField();
        txtCourseIDNac.setBounds(220,150,150,30);
        pNac.add(txtCourseIDNac);

        JTextField txtCourseNameNac = new JTextField();
        txtCourseNameNac.setBounds(640,150,150,30);
        pNac.add(txtCourseNameNac);

        JTextField txtDurationNac = new JTextField();
        txtDurationNac.setBounds(220,200,150,30);
        pNac.add(txtDurationNac);

        JTextField txtPrerequisiteNac = new JTextField();
        txtPrerequisiteNac.setBounds(640,200,150,30);
        pNac.add(txtPrerequisiteNac);

        JTextField txtCourseLeaderNac = new JTextField();
        txtCourseLeaderNac.setBounds(220,350,150,30);
        pNac.add(txtCourseLeaderNac);

        JTextField txtInstructorNac = new JTextField();
        txtInstructorNac.setBounds(640,350,150,30);
        pNac.add(txtInstructorNac);

        JTextField txtStartDateNac = new JTextField();
        txtStartDateNac.setBounds(220,400,150,30);
        pNac.add(txtStartDateNac);

        JTextField txtCompletionDateNac = new JTextField();
        txtCompletionDateNac.setBounds(640,400,150,30);
        pNac.add(txtCompletionDateNac);

        JTextField txtExamDateNac = new JTextField();
        txtExamDateNac.setBounds(220,450,150,30);
        pNac.add(txtExamDateNac);

        //JButtons for Non Academic Course

        JButton btnAddNac = new JButton("Add");
        btnAddNac.setBounds(375,270,100,30);
        btnAddNac.setFont(new Font("HELVETICA", Font.BOLD, 14));
        btnAddNac.setBackground(Color.decode("#143D59"));
        btnAddNac.setForeground(Color.decode("#FAD744"));
        pNac.add(btnAddNac);

        JButton btnRegisterNac = new JButton("Register");
        btnRegisterNac.setBounds(280,520,100,30);
        btnRegisterNac.setFont(new Font("HELVETICA", Font.BOLD, 14));
        btnRegisterNac.setBackground(Color.decode("#143D59"));
        btnRegisterNac.setForeground(Color.decode("#FAD744"));
        pNac.add(btnRegisterNac);

        JButton btnRemoveNac = new JButton("Remove");
        btnRemoveNac.setBounds(470,520,100,30);
        btnRemoveNac.setFont(new Font("HELVETICA", Font.BOLD, 14));
        btnRemoveNac.setBackground(Color.decode("#143D59"));
        btnRemoveNac.setForeground(Color.decode("#FAD744"));
        pNac.add(btnRemoveNac);

        JButton btnDisplayNac = new JButton("Display");
        btnDisplayNac.setBounds(280,590,100,30);
        btnDisplayNac.setFont(new Font("HELVETICA", Font.BOLD, 14));
        btnDisplayNac.setBackground(Color.decode("#143D59"));
        btnDisplayNac.setForeground(Color.decode("#FAD744"));
        pNac.add(btnDisplayNac);

        JButton btnClearNac = new JButton("Clear");
        btnClearNac.setBounds(470,590,100,30);
        btnClearNac.setFont(new Font("HELVETICA", Font.BOLD, 14));
        btnClearNac.setBackground(Color.decode("#143D59"));
        btnClearNac.setForeground(Color.decode("#FAD744"));
        pNac.add(btnClearNac);

        pHome.setVisible(true);
        pNac.setVisible(false);
        p.setVisible(true);
        f.setVisible(true);

        //button actions
        btnAcademic.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    pAc.setVisible(true);
                    pNac.setVisible(false);
                }
            });

        btnNonAcademic.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    pAc.setVisible(false);
                    pNac.setVisible(true);
                }
            });

        ArrayList <Course> academicCourseList = new ArrayList<Course>();

        btnAdd.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent add)
                {
                    if (txtCourseID.getText().isEmpty() || txtCourseName.getText().isEmpty() || txtDuration.getText().isEmpty()
                    || txtLevel.getText().isEmpty() || txtCredit.getText().isEmpty() || txtAssessments.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(f, "Please fill up all the fields.","Alert",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else
                    {
                        String courseID = txtCourseID.getText();
                        String courseName = txtCourseName.getText();
                        String courseLeader = txtCourseLeader.getText();
                        int duration = 0;
                        try
                        {
                            duration = Integer.parseInt(txtDuration.getText());
                        }
                        catch (NumberFormatException n)
                        {
                            JOptionPane.showMessageDialog(f, "Please enter a valid number for duration.","Alert",JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        String level = txtLevel.getText();
                        String credit = txtCredit.getText();
                        int assessments = 0;
                        try
                        {
                            assessments = Integer.parseInt(txtAssessments.getText());
                        }
                        catch (NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(f, "Please enter a valid number for No. of assessments.","Alert",JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        String id = txtCourseID.getText();
                        for (Course c : academicCourseList)// Extract objects of arraylist and create and store them in object of Course  c
                        { 
                            if (c.getCourseID().equals(id))// Comparing courseID in Course object with id
                            {
                                JOptionPane.showMessageDialog(f, "The id already exists, Enter a new ID","Alert",JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                        }

                        AcademicCourse obj = new AcademicCourse(courseID, courseName, duration, level, credit, assessments);
                        academicCourseList.add(obj);
                    }
                }
            });

        btnRegister.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent register)
                {
                    if (txtCourseID.getText().isEmpty() || txtCourseName.getText().isEmpty() || txtDuration.getText().isEmpty()
                    || txtLevel.getText().isEmpty() || txtCredit.getText().isEmpty() || txtAssessments.getText().isEmpty() || 
                    txtCourseLeader.getText().isEmpty() || txtLecturer.getText().isEmpty() || 
                    txtStartDate.getText().isEmpty() || txtCompletionDate.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(f, "Please fill up all the fields.");
                        return;
                    }
                    else
                    {
                        String courseLeader = txtCourseLeader.getText();
                        String lecturerName = txtLecturer.getText();
                        String startDate = txtStartDate.getText();
                        String completionDate = txtCompletionDate.getText();

                        // Extract objects from arraylist according to the index value
                        for (int i = 0; i<academicCourseList.size(); i++) 
                        {
                            //Comparing courseID of arraylist with courseID given by the user
                            if (academicCourseList.get(i).getCourseID().equals(txtCourseID.getText()))
                            {
                                //Get objects from arraylist and downcast into AcademicCourse
                                AcademicCourse ac = (AcademicCourse)(academicCourseList.get(i));
                                if(! ac.getIsRegistered())
                                {
                                    //Accessing the method from AcademicCourse class
                                    ac.register(courseLeader, lecturerName, startDate, completionDate);
                                    JOptionPane.showMessageDialog(f, "The Academic Course has been registered successfuly.");
                                    return;
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(f, "The Academic Course has already been registered.","Alert",JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            }
                        }
                    }
                }
            });

        btnDisplay.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent display)
                {
                    if (txtCourseID.getText().isEmpty() || txtCourseName.getText().isEmpty() || txtDuration.getText().isEmpty()
                    || txtLevel.getText().isEmpty() || txtCredit.getText().isEmpty() || txtAssessments.getText().isEmpty() || 
                    txtCourseLeader.getText().isEmpty() || txtLecturer.getText().isEmpty() || 
                    txtStartDate.getText().isEmpty() || txtCompletionDate.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(f,"The Academic Course has not been registered.","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(f, "ACADEMIC COURSE" + "\n\n" + 
                            "The Course ID of the course is: " + txtCourseID.getText() + "\n" + 
                            "The Course Name of the course is: " + txtCourseName.getText() + "\n" + 
                            "The Duration of the course is: " + txtDuration.getText() + "\n" + 
                            "The Level of the coursee is: " + txtLevel.getText() + "\n" + 
                            "The Credit present in the course is: "+ txtCredit.getText() + "\n" + 
                            "The No. of Assessments in the course: " + txtAssessments.getText() + "\n" + 
                            "The Course Leader of the course is: " + txtCourseLeader.getText() + "\n" + 
                            "The Lecturer of the course is: " + txtLecturer.getText()+"\n" + 
                            "The Starting Date of course is: " + txtStartDate.getText() + "\n" + 
                            "The Completion Date of the course is: " + txtCompletionDate.getText());
                    }
                }
            });

        btnClear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent clear)
                {
                    txtCourseID.setText("");
                    txtCourseName.setText("");
                    txtDuration.setText("");
                    txtLevel.setText("");
                    txtCredit.setText("");
                    txtAssessments.setText("");
                    txtCourseLeader.setText("");
                    txtLecturer.setText("");
                    txtStartDate.setText("");
                    txtCompletionDate.setText("");
                }
            });

        ArrayList <Course> nonAcademicCourseList = new ArrayList<Course>();

        btnAddNac.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent addNac)
                {
                    if (txtCourseIDNac.getText().isEmpty() || txtCourseNameNac.getText().isEmpty() || 
                    txtDurationNac.getText().isEmpty() || txtPrerequisiteNac.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(f, "Please fill up all the fields.","Alert",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else
                    {
                        String courseIDNac = txtCourseIDNac.getText();
                        String courseNameNac = txtCourseNameNac.getText();
                        int durationNac = 0;
                        try
                        {
                            durationNac = Integer.parseInt(txtDurationNac.getText());
                        }
                        catch (NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(f, "Please enter a valid number for duration.","Alert",JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        String prerequisiteNac = txtPrerequisiteNac.getText();

                        String idNac = txtCourseIDNac.getText();
                        for (Course cNac : nonAcademicCourseList)// Extract objects of arraylist and create and store them in object of Course  cNac
                        { 
                            if (cNac.getCourseID().equals(idNac))// Comparing courseID in Course object with id
                            {
                                JOptionPane.showMessageDialog(f, "The id already exists, Enter a new ID","Alert",JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                        }

                        NonAcademicCourse objNac = new NonAcademicCourse(courseIDNac, courseNameNac, durationNac, prerequisiteNac);
                        nonAcademicCourseList.add(objNac);
                    }
                }
            });

        btnRegisterNac.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent registerNac)
                {
                    if (txtCourseIDNac.getText().isEmpty() || txtCourseNameNac.getText().isEmpty() || 
                    txtDurationNac.getText().isEmpty() || txtPrerequisiteNac.getText().isEmpty() || 
                    txtCourseLeaderNac.getText().isEmpty() || txtInstructorNac.getText().isEmpty() || 
                    txtStartDateNac.getText().isEmpty() || txtCompletionDateNac.getText().isEmpty() || txtExamDateNac.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(f, "Please fill up all the fields.","Alert",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else
                    {
                        String courseLeaderNac = txtCourseLeaderNac.getText();
                        String instructorNac = txtInstructorNac.getText();
                        String startDateNac = txtStartDateNac.getText();
                        String completionDateNac = txtCompletionDateNac.getText();
                        String examDateNac = txtExamDateNac.getText();

                        // Extract objects from arraylist according to the index value
                        for (int i = 0; i<nonAcademicCourseList.size(); i++)
                        {
                            //Comparing courseID of arraylist with courseID given by the user
                            if (nonAcademicCourseList.get(i).getCourseID().equals(txtCourseIDNac.getText()))
                            {
                                //Get objects from arraylist and downcast into NonAcademicCourse
                                NonAcademicCourse nac = (NonAcademicCourse)(nonAcademicCourseList.get(i));
                                if(! nac.getIsRegistered())
                                {
                                    //Accessing the method from NonAcademicCourse class
                                    nac.register(courseLeaderNac, instructorNac, startDateNac, completionDateNac, examDateNac);
                                    JOptionPane.showMessageDialog(f, "The Non Academic Course has been registered successfuly.");
                                    return;
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(f, "The Non Academic Course has already been registered.","Alert",JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            }
                        }
                    }
                }
            });

        btnRemoveNac.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent removeNac)
                {
                    if (txtCourseIDNac.getText().isEmpty() || txtCourseNameNac.getText().isEmpty() || 
                    txtDurationNac.getText().isEmpty() || txtPrerequisiteNac.getText().isEmpty() || 
                    txtCourseLeaderNac.getText().isEmpty() || txtInstructorNac.getText().isEmpty() || 
                    txtStartDateNac.getText().isEmpty() || txtCompletionDateNac.getText().isEmpty() || txtExamDateNac.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(f, "Please fill up all the fields.","Alert",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else
                    {
                        // Extract objects from arraylist according to the index value
                        for (int i = 0; i<nonAcademicCourseList.size(); i++)
                        {
                            //Comparing courseID of arraylist with courseID given by the user
                            if (nonAcademicCourseList.get(i).getCourseID().equals(txtCourseIDNac.getText()))
                            {
                                //Get objects from arraylist and downcast into NonAcademicCourse type
                                NonAcademicCourse nac = (NonAcademicCourse)(nonAcademicCourseList.get(i));
                                if(! nac.getIsRemoved())
                                {
                                    //Accessing the method from NonAcademicCourse class
                                    nac.remove();
                                    JOptionPane.showMessageDialog(f, "The Non Academic Course has been removed successfuly.");
                                    return;
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(f, "The id does not exists, Enter a valid ID","Alert",JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            }
                        }
                    }
                }
            });

        btnDisplayNac.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent displayNac)
                {
                    if (txtCourseIDNac.getText().isEmpty() || txtCourseNameNac.getText().isEmpty() || 
                    txtDurationNac.getText().isEmpty() || txtPrerequisiteNac.getText().isEmpty() || 
                    txtCourseLeaderNac.getText().isEmpty() || txtInstructorNac.getText().isEmpty() || 
                    txtStartDateNac.getText().isEmpty() || txtCompletionDateNac.getText().isEmpty() || txtExamDateNac.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(f, "The Non Academic Course has not been registered.","Alert",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else{
                        // Extract objects from arraylist according to the index value
                        for(int i = 0; i<nonAcademicCourseList.size(); i++)
                        {
                            //Get objects from arraylist and downcast into NonAcademicCourse
                            NonAcademicCourse nac = (NonAcademicCourse)(nonAcademicCourseList.get(i));
                            if(! nac.getIsRemoved())
                            {
                                JOptionPane.showMessageDialog(f,"NON ACADEMIC COURSE" + "\n\n" + 
                                    "The Course ID of the course is: " + txtCourseIDNac.getText() + "\n" + 
                                    "The Course Name of the course is: " + txtCourseNameNac.getText() + "\n" + 
                                    "The Duration of the course is: " + txtDurationNac.getText() + "\n" + 
                                    "The Prerequisites of the course is: " + txtPrerequisiteNac.getText() + "\n" + 
                                    "The Course Leader of the course is: " + txtCourseLeaderNac.getText() + "\n" + 
                                    "The Instructor of the course is: " + txtInstructorNac.getText() + "\n" + 
                                    "The Starting Date of course is: " + txtStartDateNac.getText() + "\n" + 
                                    "The Completion Date of the course is: " + txtCompletionDateNac.getText() + "\n" + 
                                    "The Exam Date of the course is: " + txtExamDateNac.getText());
                            }
                            else{
                                JOptionPane.showMessageDialog(f,"The course has been removed!","Alert",JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            });

        btnClearNac.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent clearNac)
                {
                    // Setting the values of all the text fields to empty
                    txtCourseIDNac.setText("");
                    txtCourseNameNac.setText("");
                    txtDurationNac.setText("");
                    txtPrerequisiteNac.setText("");
                    txtCourseLeaderNac.setText("");
                    txtInstructorNac.setText("");
                    txtStartDateNac.setText("");
                    txtCompletionDateNac.setText("");
                    txtExamDateNac.setText("");
                }
            });
    }
}