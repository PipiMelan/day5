
// app starts -> login -> load user information
//                     -> store user information
//                          ...
/*/*
        function name is just the name of this function
        But :: with it declares it a object of this function
    */
    var funA = ::loadHomeData
    var funB = ::storeUserInfo

    //Invoke function through variable
    funA(10).also{
        println(it)
    }
    funB(20).also {
        println(it)
    }


    //invoke function through object
    (::loadHomeData)(10).also {
        println(it)
    }
    (::storeUserInfo)(20).also { println(it) }*/



 fun login(name:String,funParam:(Int)->String){
     //...login
     val id = 1

     // further operation
     funParam(1).also {
         println(it) }

//     val result = loadHomeData(id)
     val result = storeUserInfo(id)
 }

fun loadHomeData(id:Int):String{
    println("load MainInterface Data")
    return "loaded successfully"
}

fun storeUserInfo(id:Int):String{
    println("Storing Info")
    return "return Info Successfully"
}

/*
* How to define a function variable
* */

fun main() {
//    A defined function ,you just assign a value to variable
//    var funA = ::loadHomeData
    /*var funA = fun loadHomeData(id:Int):String{
    println("load MainInterface Data")
    return "loaded successfully"
    }*/
    // Anonymous function
    var funA = fun(id:Int):String{
        println("load MainInterface Data")
        return "loaded successfully"
    }

//    Lambda -> Anonymous function
//    If function has return value ->return is not allowed to use -> return the contents of last line by default
//      Use { }
//    The parameter of function -> the type of return value
//    函数体body

    //() ->Unit
    var funB = {
    }

    //(Int,Int) -> Int
    var funD ={a:Int,b:Int -> Int
        a+b
    }
    //(Int) ->String
    var funC = {id :Int -> String
        println("load MainInterface Data")
        "$id loaded successfully"
    }

    var funE = {id:Int -> String
        "$id STORED SUCCESSFULLY"
    }
    login("jack",funC)

    // Make functions as parameters
    login("jk",{id:Int -> String
        "get the id: $id, "
    })
    //If the function is a parameeter and the last parameter如果参数为函数 并且是最后一个参数
    login("jack1"){id:Int -> String
        "get the id: $id, "
    }
    //如果表达式中只有一个参数 该参数可省略
    //默认提供名字为it
    login("jack2"){
        "get the id: $it, "
    }
}