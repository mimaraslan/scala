package _016_object_class

class Student2(id:Int, name:String){     // Primary constructor
  def show(){
    println(id+" "+name)
  }
}

object _002_Constructor{
  def main(args:Array[String]){
    var s = new Student2(100,"Martin")   // Passing values to constructor
    s.show()   // Calling a function by using an object
  }
}
