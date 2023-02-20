package students
open class Student(var name:String,var surname:String,var familia:String,var floor:String,var fbirth:String,var height:Double,var ves:Double)
{
    open fun place()
    {
        println("студент $name $surname $familia проходит обучение в городе екатеренбург, в колеедже Транспортного строительства,по адресу ул.первомайская, д.73")
    }
    open fun information()
    {
        println("$name $surname $familia,$floor пола,родился-$fbirth,ростом $height и весит $ves ")
    }
    open fun appereanse()
    {
        if(height>300&&height<90&&ves<0&&ves>300)println("не может быть такого роста или веса")
        else println("студент $name $surname $familia роста $height ил веса $ves")
    }

}