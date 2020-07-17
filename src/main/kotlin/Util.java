
/*
*  class Utile invoked -> load into memory-Util->The class object(类对象) and static contents are created in the mean time
*  -> Use this object to invoke the attributes and methods
* */
 public class Util {
    public static String URL = "www.baidu.com";

    //static method
    public static void loadData(){
        System.out.println("Loading pictures");
    }
    //instance method
//We must instantiate the object of this class and use this object to create
    public void show(){

    }
}

class Util1{
     public static Util1 instance = new Util1();

     private Util1(){
        Util2.getInstance();
     }
}

class Util2{
     private static Util2 dfault;
     private Util2(){}
     public static Util2 getInstance(){
         if(dfault == null){
            synchronized (Util2.class){
                if(dfault == null){
                    dfault = new Util2();
                }
            }
         }
         return dfault;
     }
}
