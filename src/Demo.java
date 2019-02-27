public class Demo {

    private int x, y;
    
    public Demo(int a, int b){
        x=a; y=b;
    }
    public void show(){
        System.out.println(x+","+y);
    }
    
public static void main(String args[]){
    
    String s1=new String("indore");
    String s2=new String("indore");
    String s3=s2;
    
    System.out.println(s1);
    System.out.println(s2);
    boolean b1=(s1==s2);
    System.out.println(b1);
    
    boolean b2=(s2==s3);
    System.out.println(b2);
    
    /*
    Demo d1=new Demo(10,20);
    Demo d2=new Demo(10,20);
    Demo d3=d1;
    
    boolean b1 = (d1==d2);
    System.out.println(b1);
    
    boolean b2 = (d1==d3);
    System.out.println(b2);
    */
    
    /*
    Demo d1;
    new Demo(10,20);
    Demo d2=new Demo(30,40);
    Demo d3=d2;
    d1=d2;
    d1.show();
    d2.show();
    d3.show();
    System.out.println("_______________________");
    
    d3=new Demo(50,60);
    d1.show();
    d2.show();
    d3.show();
    System.out.println("_______________________");
    d2=d3;
    d1.show();
    d2.show();
    d3.show();
    System.out.println("_______________________");
    d1=new Demo(70,80);
    d1.show();
    d2.show();
    d3.show();
    System.out.println("_______________________");
    d3=new Demo(90,100);
    d1.show();
    d2.show();
    d3.show();
    System.out.println("_______________________");
    */
    
}
    
}
