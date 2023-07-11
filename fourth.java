import java.util.Scanner;

import java.util.Random;

// public class fourth {
//     public static void main(String[] args) {
//         employee e1=new employee();
//         employee e2=new employee(); 
//         e1.setName("abc");
//         System.out.println(e1.getName());
//         e1.id=10;
//         System.out.println(e1.id);
//         e1.salary=5000;
//         e1.getsalary();

//     }
    
// }
// class employee{
//     int id;
//     String name;
//     int salary;

//     public void printinf(){
//         System.out.println(id);
//         System.out.println(name);
//         System.out.println(salary);

//     }
//     public int getsalary(){
//         System.out.println(salary);
//         return salary;
//     } 
//     public String getName(){
//         return name;
//     } 
//     public void setName(String n){
//         name=n;

//     }
// }
//getters and setters

// public class fourth{
//     public static void main(String[] args) {
//         employee e1= new employee();
// //         Scanner sc=new Scanner(System.in);
// //         int id1=sc.nextInt();
// //         String name=sc.next();
// //         e1.setId(id1);
// //         e1.setName(name);
//         System.out.println(e1.getId());
//         System.out.println(e1.getName());


        
//     }
// }
// class  employee{
//     private int id;
//     private String name;
//     public int getId() {
//         return id;
//     }
//     public void setId(int id) {
//         this.id = id;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public employee(){
//         name="harry";
//         id=1;

//     }

   
// }
//guess a num game
// class fourth{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         boolean b=false;
//         game g=new game();
//         while(!b){
//         g.takeuserip();
//        b= g.isnumcorr();
       

//         }
        
//     }
// }
// class game{
//     int num;
//     int guss;
//     int ipnum;
//     public int getNum() {
//         return num;
//     }
//     public void setNum(int num) {
//         this.num = num;
//     }
//     public int getGuss() {
//         return guss;
//     }
//     public void setGuss(int guss) {
//         this.guss = guss;
//     }
//     game(){
//         Random r =new Random();
//         this.num=r.nextInt(10);

//     }
//     int takeuserip(){
//         System.out.println("guess the num");
//         Scanner sc=new Scanner(System.in);

//         ipnum=sc.nextInt();
//         return ipnum;

//     }
//     boolean isnumcorr(){
//         guss++;

//         if(num==ipnum){
//             System.out.println("guessed in " +guss+" attempts");

//             return true;
//         }
        
//         else if(ipnum<num){
//             System.out.println("too less");
//         }
//         else if(ipnum>num){
//             System.out.println("too high");
//         }
//         return false;
        

//     }



// }
// area of cyl
// public class fourth{
//     public static void main(String[] args) {
//          cyl c=new cyl();
//         System.out.println("enter r and h");
//         Scanner sc=new Scanner(System.in);
//         int r1=sc.nextInt();
//         int h1=sc.nextInt();
//         c.setRadius(r1);
//         c.setH(h1);
//         System.out.println(c.getRadius());
//         System.out.println(c.getH());
//         System.out.println(c.sa());

       
        
//     }
// }
// class cyl{
//     private int  radius;
//     private int  h;
//     public int getRadius() {
//         return radius;
//     }
//     public void setRadius(int radius) {
//         this.radius = radius;
//     }
//     public int getH() {
//         return h;
//     }
//     public void setH(int h) {
//         this.h = h;
//     }
//     float sa(){
//         return 2*3.14f*radius*radius;

//     }
// }
// overridding
public class fourth{
    public static void main(String[] args) {
        one o=new one();
        two t=new two();
        o.method1();
        o.method2();
        t.method1();
        
    }
}
class one{
    public void method1(){
        System.out.println(" method 1 pf class1");
    }
    public void method2(){
        System.out.println(" method 2 pf class1");
    }
}
class two extends one{
    public void method1(){
        System.out.println(" method 1 pf class2");
    }
    

}