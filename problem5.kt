class mathTeacher(val name: String = "", var age: Int){
    fun talk (){            // talk function
        println ("My name is $name. ")

    }
    fun walk (){            // walk function
        println ("My age is $age. ")
    }
    fun teachMath(){
        println("I teach math at CSUSB. ")
    }
}
// Football player
class footballPlayer(val name: String = "", var age: Int){
    fun talk (){            // talk function
        println ("My name is $name. ")

    }
    fun walk (){            // walk function
        println ("My age is $age. ")
    }
    fun playFootball(){
        println("I play for the LA Rams. ")
    }
}


// Business man class
class Businessman(val name: String = "", var age: Int){
    fun talk (){            // talk function
        println ("My name is $name. ")

    }
    fun walk (){            // walk function
        println ("My age is $age. ")
    }
    fun runBusiness(){
        println("I work for FB ")
    }
}

// open class person
open class person(var profession: String = ""){
    var name: String = ""
    var age: Int = 0

    fun talk(){
        println("Howdy my name is $name.  ")
    }
    fun walk(){
        println("I'm $age years old and I'm a $profession. ")
    }
    fun eat(){
        println("Lets eat go out to eat! ")
    }
}

// inheritance, Math teacher
class math_Teacher:person("Math Teacher"){
    fun teachMath(){
        println("I love to teach Math!")
    }
}

// inheritance, football player
class football_Player:person("Football Player"){
    fun playFootball(){
        println("Lets go get this win!")
    }
}

// inheritance, business man
class businessMan:person("Business man"){
    fun runBusiness(){
        println("I need a vacation.")
    }
}
// main function
fun main (){

    val p4 = businessMan()
    p4.age = 45
    p4.name = "Mike"

    p4.talk()
    p4.walk()
    p4.eat()
    p4.runBusiness()
    println("")

    //inheritance - mathTeacher1:person
    val p5 = math_Teacher()
    p5.name = "Mark"
    p5.age = 32

    p5.talk()
    p5.walk()
    p5.eat()
    p5.teachMath()
    println("")

    //inheritance - footballPlayer1:person
    val p6 = football_Player()
    p6.name = "Travis"
    p6.age = 21

    p6.talk()
    p6.walk()
    p6.eat()
    p6.playFootball()
    println("")
}