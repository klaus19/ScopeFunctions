class Also {


}

fun main(){
    val list = mutableListOf<Int>(1,2,3)

    list.also {
        list.add(0,6)
        list.remove(3)
        println(list)
    }
}