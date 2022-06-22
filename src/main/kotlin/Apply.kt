class Company {

    lateinit var name:String
    lateinit var objective:String
    lateinit var founder:String
}

   fun main() {

       //scope function "apply"
       val ctx=Company().apply {

           // don't need to use object
           // name to refer members
           name="Geek"
           objective="te"
           founder="yu"
       }
       print(ctx.name)
   }