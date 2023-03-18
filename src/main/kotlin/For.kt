fun main(){

    val arrayName = arrayOf("Renan", "Sergio", "Renanzera")

    for (index in 0..2){
        println(arrayName[index])
    }

    for (index in 0..arrayName.size -1){
        println(arrayName[index])
    }

    for (element in arrayName){
        println(element)
    }

    for (index in 0 until arrayName.size){
        println(arrayName[index])
    }
}