
fun main(){

    var int:Int?=null

    int?.let {
        // statement(s) will
        // not execute as a is null
        print(it)

    }



}