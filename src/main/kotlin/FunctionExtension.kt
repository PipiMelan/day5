/*
* Extension
* Add methods and attributes to existing class
*
* 1.inheritance
* 2.Decorator-装饰模式（Decorator）是以对客户端透明的方式对对象功能的一种扩展，是基础方式的一种更好的替代方案
* Composite Pattern（组合模式） - 是将对象组合成树形结构以表示“部分--整体”的层次结构。使得用户对单个对象和组合对象的使用具有一致性
* open class Car{

}

class Audi:Car(){

}
class Dazhong:Car(){
    val car = Car()
    val color:String = "白色"
}
*
* 3.Extension
* */

//Extension
/*
* fun - add new methods
* var/val - add new attributes
* */
class Student(var name:String){
    fun work(){
        println("working")
    }
    // Didn't add  this to this class(Dynamic addition动态的添加)
    // When two methods are the same,the priority of original method is higher
    fun Student.eat(){
        println("eating")
    }
    fun Student.work(){
        println("enjoy your job")
    }
}

fun main() {
    val s = Student("xw")
    s.work()
}