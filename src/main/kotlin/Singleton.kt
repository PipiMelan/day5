
 /*
 * Eager singleton
 * Lazy singleton
 * */


class Person private constructor(){
     //Eager singleton
     companion object{
         val instance = Person()
     }
 }
/*
* Lazy singleton
* */
 class Sqlite private constructor(){
    companion object{
        var dfault:Sqlite? = null
        fun getInstance():Sqlite{
            if(dfault == null){
                synchronized(this){
                    dfault = Sqlite()
                }
            }
            return dfault!!
        }
    }
    fun show(){
        println("Hello")
    }
}class Sqlite2 private constructor(){
    companion object{
        val dfault:Sqlite2 by lazy(LazyThreadSafetyMode.SYNCHRONIZED){
           Sqlite2()
        }

    }
    fun show(){
        println("Hello")
    }
}
 fun main() {
     //Eager singleton
     Person.instance

     //Lazy singleton
     Sqlite.getInstance().show()
     Sqlite2.dfault.show()
 }