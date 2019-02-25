public class CDemo {

    private int x, y, z;
    
    void f1(){
    }
            
    public CDemo(){
        f1();
    }
    public CDemo(int a, int b){
        this();
        x=a; 
        y=b;
    }
    public CDemo(int p, int q, int r){
        //calling two arg constructor
        this(p,q);
        z=r;
    }
    public void showData(){
        System.out.println(x+","+y+","+z);
    }
    
public static void main(String args[]){
    CDemo ob1=new CDemo(4,5,6);
    CDemo ob2=new CDemo(11,12);
    ob1.showData();
    ob2.showData();
    
}    
}
