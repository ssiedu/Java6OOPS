public class Demo {

    private int x, y;
    
    public Demo(int x, int y){
        this.x=x; 
        this.y=y;
    }
    
    public boolean isEquals(Demo tmp){
        
       if(x==tmp.x && y==tmp.y){
           return true;
       }else{
           return false;
       }
    }

    public void show(){
        System.out.println(x);
        System.out.println(y);
        System.out.println("__________");
    }
    
public static void main(String args[]){
    
    Demo d1=new Demo(10,20);
    Demo d2=new Demo(30,40);
    d1.show();
    d2.show();
    /*
    String s1=new String("indore");
    String s2=new String("indore");
    
    boolean b1=(s1==s2);
    System.out.println(b1);
   
    boolean b2=s1.equals(s2);
    System.out.println(b2);
    */
    
    /*
    Demo d1=new Demo(10,20);
    Demo d2=new Demo(10,20);
   
    boolean b1=(d1==d2);
    System.out.println(b1);
   
    boolean b2=d1.isEquals(d2);
    System.out.println(b2);
    */
}
    
}
