import java.time.LocalDate;
import java.time.Period;

class Student{
    String stud_name;
    int usn;
    public Student(String stud_name,int usn){
        this.stud_name=stud_name;
        this.usn=usn;
    }
    public void display_Details(){
        System.out.println("The student Name:"+stud_name);
        System.out.println("The student USN:"+usn);
    }
    public void ageCalculator(){
        String dob="2004-05-22";
        LocalDate date=LocalDate.parse(dob);
        LocalDate currDate=LocalDate.now();
        Period age=Period.between(date, currDate);
        System.out.println("The Age of student is"+age.getYears()+"years");

    }
    public static void main(String[] args) {
        Student s1=new Student("Vijay", 207);
        s1.display_Details();
        s1.ageCalculator();
        StudentCourse s2=new StudentCourse("vijay",207);
        s2.semester01(80,90);
        s2.semester02(70,80);
        s2.semester03(90,70);
    }



}