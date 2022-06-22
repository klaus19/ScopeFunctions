class Run {

    lateinit var name:String
    lateinit var fox:String
    lateinit var dam:String
}

fun main(){

    println("Company Name")
    var company:Run?=null

    company?.run {
        print(name)
    }

    print("Company Name:")

    company = Run().apply {
        name ="Niks"
        fox = "bana"
        dam = "eyes"
    }

    company?.run {
        print(name)
    }

}