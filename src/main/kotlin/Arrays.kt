fun main(){

    val arrayNumbers = arrayOf(1,2,3,4,5,6,7,8,9)
    val arrayName = arrayOf("Renan", "Sergio", "Renanzera")
    val dynamicArray = arrayOf("Renan", 23, "Sergio", 28)

    println(arrayNumbers.contentToString())
    println(arrayName.contentToString())
    println(dynamicArray.contentToString())
    println(dynamicArray.size)
}