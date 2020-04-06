package hello

fun vars(vararg v:Int){
    for(vt in v){
        print(vt)
    }
}

enum class Color{
    RED,BLACK,BLUE,GREEN,WHITE
}

data class User(val name: String, val age: Int)

open class Person(var name : String, var age : Int){// 基类

}

class Student(name : String, age : Int, var no : String, var score : Int) : Person(name, age) {

}

//constructor
class Book constructor(var name:String ,var price:Int){
	init{
		println("name=$name,price=price");	
	}
    fun print(){
        println("name=$name,price=price");	
    }
}


//common class declare
class Greeter(val name: String) {
   fun greet() { 
      println("Hello, $name")
   }
}

//data class
//类的参数 declare name:Type
data class Students(var a:Int,var b:String)

//static class declare, singleton default
object Utils{
    fun print(){
        println("sss")
    }
    //函数参数：name:Type
    fun getString( str:String){ 
        "String:$str"
    }
}

interface MyInterface {
    fun bar()    // 未实现
    fun foo() {  //已实现
      // 可选的方法体
      println("foo")
    }
}

class Child : MyInterface {
    override fun bar() {
        // 方法体
    }
}

fun add(a:Int, b:Int)=a+b

fun show(a:String):String{
     return "return $a"
}

val a:Int =100
val b:Int =90

fun main() {
    println("Hello World")
   Greeter("ss").greet()          // 创建一个对象不用 new 关键字
   Book("helloworld",23).print()
   Utils.print()
   Utils.getString("nihao")
   println("a+b="+add(5,6))
   println(show("aaa"))
   
   var c=if(a>b){"a>b"}else{"a<=b"}
   println(c)
   
   var se:Int=1
   var sel= when(se){
         1,2->  "1 or 2"
         3->"3"
       else ->"other"
   }
   
   println(sel)
   
    for (i in 1..4) print("$i,") 
    vars(1,2,3,4,5,6)
    
    for (i in 1 until 10) {   // i in [1, 10) 排除了 10
     println(i)
    }
    
    var a=100
    var b =1000
    print(a==b)
    var cc="aaa"
    var dd="aaa"
    print(cc===dd)
    
    print(a.toString())
    print(a.toChar())
    
    val max = if (a > b) a else b
    print(max)
    
    var x=1
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // 注意这个块
            print("x 不是 1 ，也不是 2")
        }
    }
    
    val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    
    var p = Person("asdf",11)
	print(p.name)
   
    val s =  Student("Runoob", 18, "S12346", 89)
    println("学生名： ${s.name}")
    println("年龄： ${s.age}")
    println("学生号： ${s.no}")
    println("成绩： ${s.score}")
    
    var u=User("dafa",111)
    println(u.name)
    println(u.age)
    println(Color.valueOf("RED"))
}
