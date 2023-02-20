import kinofilm.*
class fantasy (var etime:String, var fantasyanimals :String,var voiced :String, ename:String, eseans:String, emoney:Double, ezal:Double, emest:Double): kino(ename,eseans,emoney,ezal,emest)
{
    open fun characteristics()
    {
        println("фантези под нозванием $name в зале $zal продолжительностью $etime")
    }
    open fun animal()
    {
        println(" мифическое сушество $fantasyanimals озвучил $voiced")
    }open fun infoo()
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
        println("в $seans стоимостью $money в $zal зале, мест в зале $mest")
    }
}