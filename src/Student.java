public class Student {
    private int rno;
    private String name;
    private int marks;
    private static int totalPass;
    private static int totalFail;
    public static void showAvg(Student tmp1, Student tmp2){
        System.out.println("Avg of 2 : "+(tmp1.marks+tmp2.marks)/2);
    }    
    public static void showAvg(Student tmp1, Student tmp2, Student tmp3){
        System.out.println("Avg of 3 : "+(tmp1.marks+tmp2.marks+tmp3.marks)/3);
    }
    public static void showAvg(Student tmp1, Student tmp2, Student tmp3, Student tmp4){
        System.out.println("Avg of 4 : "+(tmp1.marks+tmp2.marks+tmp3.marks+tmp4.marks)/4);
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
    public Student(int x, String y){
        rno=x;
        name=y;
    }
    public  Student(int a, String b, int c){
        this(a,b);
        marks=c;
    }
}
