
/*
* Companion object
* HttpRequest class -> load into memory class object
* Class (static attributes , static methods) -> object (member property成员属性 instance method)
* */

fun main() {
    //we must instantiate the class to invoke the method
//    HttpRequest.Url ->Error
//    HttpRequest().URL
    HttpRequest.url
    HttpRequest.loadData()
}

/*
  replace the utility class(工具类)
* static class  with static attributes and methods
* */
object ImageUtil{
    fun scale(){}
    fun saveBitmapToFile(){    }
    fun Obfuscation(){}
}

class HttpRequest{
//    val URL:String = "http://www.baidu.com"
    companion object{
        var url:String = "www.baidu.com"
    fun loadData(){
        println("load Data")
        }
    }
}