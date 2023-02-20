import students.*
class programer(var term:String,var group:Int,var studying:String,empname:String,empsurname:String,empfamilia:String,empfloor:String,empfbirth:String,empheight:Double,empves:Double): Student(empname,empsurname,empfamilia,empfloor,empfbirth,empheight,empves)
{
    open fun date()
    {
        println("студент $name $surname $familia проходит обучение $term")
    }
    open fun groups()
    {
        if(group==11||group==12||group==13||group==13||group==21||group==22||group==23||group==24||group==31||group==32||group==33||group==34||group==41||group==42||group==43)
        {
            println("студент $name $surname $familia в $group группе")
        }

            else println("не сушествует такой группы")
    }
    open fun studings()
    {
        println("студент $name $surname $familia в $group группе,основной язык програмирования $studying")
    }

}
