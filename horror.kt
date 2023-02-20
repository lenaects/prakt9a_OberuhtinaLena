import kinofilm.*
class horror(var time:String, var positiv:String, var negativ:String, var cast:String, empname:String, empseans:String, empmoney:Double, empzal:Double, empmest:Double): kino(empname,empseans,empmoney,empzal,empmest)
{
    open fun characteristic()
    {
        println("ужастик под названием $name в зале $zal продолжительностью $time")
    }
    open fun  custs()
    {
        println(" в главнфх ролях $cast")
    }
    open fun heros ()
    {
        println(" положительный герой $positiv")
        println(" отрицательный герой $negativ")
    }

}