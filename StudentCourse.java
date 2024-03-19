class StudentCourse extends Student{
  
    public StudentCourse(String stud_name, int usn) {
        super(stud_name, usn);
        //TODO Auto-generated constructor stub
    }
    int cprogram;
    int web;
    int cplus;
    int os;
    int java;
    int cn;
    public void semester01(int cprogram,int web){
        System.out.println("The first semester course and marks");
        System.out.println("i.Cprogramming:"+cprogram);
        System.out.println("ii.Webtechnoogy:"+web);
    }
    public void semester02(int cplus, int os){
        System.out.println("The second semester course and marks");
        System.out.println("i.C++ Programming:"+cplus);
        System.out.println("ii.OperatingSystem:"+os);
    }
    public void semester03(int java,int cn){
        System.out.println("The third semester course and marks");
        System.out.println("i.Javaprogramming:"+java);
        System.out.println("ii.Computer network:"+cn);
    }


    
}
