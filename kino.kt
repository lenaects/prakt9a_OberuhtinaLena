package kinofilm
open class kino(var name:String,var seans:String,var money:Double,var zal:Double,var mest:Double)
{
    open fun movie()
    {
        println("фильм называеться $name")
    }
    open fun prise()
    {
        if(seans=="суббота"||seans=="воскресенье")
        {
            money=money+50
            println("стоимость за билет $money")
        }
        if(seans=="понедельник")
        {
            money=money-50
            println("стоимость за билет $money")
        }
        else println("стоимость за билет $money")
    }
    open fun info()
    {
        println("фильм называеться $name, в зале $zal , где $mest мест")
    }

}