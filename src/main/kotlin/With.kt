class With {

    lateinit var name: String
    lateinit var type: String
    lateinit var bowl: String
}
  fun main(){


    val wt = With().apply {
        name = "nIKS"
        type = "tyt"
        bowl="gsp"
    }

    with(wt){
        print("$name")
    }
}