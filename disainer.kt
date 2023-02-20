import students.*
class disainer(var eterm:String,var egroup:Int,var direction:String,ename:String,esurname:String,efamilia:String,efloor:String,efbirth:String,eheight:Double,eves:Double):Student(ename,esurname,efamilia,efloor,efbirth,eheight,eves)
{
    open fun dates()
    {
        println("студент $name $surname $familia проходит обучение $eterm")
    }
    open fun grouhss()
    {
        if(egroup==11||egroup==12||egroup==13||egroup==13||egroup==21||egroup==22||egroup==23||egroup==24||egroup==31||egroup==32||egroup==33||egroup==34||egroup==41||egroup==42||egroup==43)
        {
            println("студент $name $surname $familia в $egroup группе")
        }

        else println("не сушествует такой группы")
    }
    open fun directions()
    {
        println("студент $name $surname $familia в $egroup группе,основное направление дизайна $direction")
    }

}