public class ResultProcessing {
public static void main(String[] args) {
   
    Student s1=new Student();
    Student s2=new Student();
    Student s3=new Student();
    Student s4=new Student();
    Student s5=new Student();
    
    s1.setData(111,"AAA", 90);
    s2.setData(112, "BBB",80);
    s3.setData(113, "CCC",20);
    s4.setData(114, "DDD",60);
    s5.setData(115, "EEE",30);
    
    s1.printReportCard();
    s2.printReportCard();
    s3.printReportCard();
    s4.printReportCard();
    s5.printReportCard();
    
    //Student.showTotal();
    
    //find out avg marks of s1, s5
    Student.showAvg(s1,s2);
    Student.showAvg(s1,s2,s3);
    Student.showAvg(s1,s2,s3,s4);
    
    
}
    
}
