public class VADemo {

public static void add(){
    System.out.println("Nothing To Add");
}
public static void add(int a, int b){
    System.out.println("SUM : "+(a+b));
}
public static void add(String...v){
    String s="";
    for(String tmp:v){
        s=s+tmp;
    }
    System.out.println(s);
}    
public static void add(int...v){
    int sum=0;
    
    for(int tmp:v){
        sum=sum+tmp;
    }
    System.out.println(sum);
    
}    
public static void main(String args[]){
    add();
    add("aa","bb");
    add("xx","yy","zz");
    add(10,20);
    add(10,20,30);
    add(1,2,3,4,5);
    add(1,2,3,4,5,6,7,8,9,10);
    
}    
}
