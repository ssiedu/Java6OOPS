public class Student {
    
    private int rno;
    private String name;
    private int marks;
    private static int totalPass;
    private static int totalFail;

    public Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    public Student(int rno, String name, int marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    public Student() {
    }

    public static void showAvg(Student...s){
        
        int totalMarks=0;
        int n=s.length;
        for(Student tmp:s){
            totalMarks=totalMarks+tmp.marks;
        }
        
        System.out.println("Avg of "+n+" : "+(totalMarks/n));
        
    }    
    
    
    public static void showTotal(){
        System.out.println("==========================================");
        System.out.println("Total Passed Candidates : "+totalPass);
        System.out.println("Total Failed Candidates : "+totalFail);
        System.out.println("==========================================");
    }
    public  void printReportCard(){
        System.out.println("Roll No   : "+rno);
        System.out.println("Stud Name : "+name);
        System.out.println("Marks Scr : "+marks);
        if(marks>=33){
            System.out.println("Result :  PASSED");
            totalPass++;
        }else{
            System.out.println("Result :  FAILED");
            totalFail++;
        }
        System.out.println("___________________________________");
    }
}
