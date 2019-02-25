public class ResultProcessing {
public static void main(String[] args) {
   
    Student s1=new Student(111,"AAA",90);
    Student s2=new Student(112,"BBB",80);
    Student s3=new Student(113,"CCC",20);
    Student s4=new Student(114,"DDD",60);
    Student s5=new Student(115,"EEE");
    s1.printReportCard();
    s2.printReportCard();
    s3.printReportCard();
    s4.printReportCard();
    s5.printReportCard();
    
    Student.showTotal();
    
    //find out avg marks of s1, s5
    //Student.showAvg(s1,s2);
    //Student.showAvg(s1,s2,s3);
    //Student.showAvg(s1,s2,s3,s4);
    
    
}
    
}
