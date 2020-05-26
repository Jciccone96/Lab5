fun main(){
    println("Please enter age: ")       // Ask user input
    val age = Integer.valueOf(readLine())   // Creates age variable

    ageCategory(age)     // Calls the age function

}
// The age function that displays the category of age inputted.
fun ageCategory(x: Int ){
    when (x){
        // Displays the age in the correspondig category.
        in 0..20 -> println("$x is in Family age.")
        in 29..59 -> println("$x is in the Normal age.")
        in 60..100 -> println("$x is in Senior age.")
    }
}