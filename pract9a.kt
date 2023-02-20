import kinofilm.kino
import students.Student

fun main()
{
    //student
    println("введите груупу програмиста")
    var group = readln()!!.toInt()

    var Lena=programer("4 года",group,"C#","Лена","Сергеевна","Оберюхтина","женский","20 июня 2005",158.0,55.0)
    Lena.date()
    Lena.groups()
    Lena.studings()
    println("введите груупу дизайнера")
    group = readln()!!.toInt()
    var Daha=disainer("4 года",group,"архитектура","Даша","Анатольевна","Соколова","женский","21 января 2005",170.0,55.0)
    Daha.dates()
    Daha.grouhss()
    Daha.directions()

    println("введите рост студента")
    var height = readln()!!.toDouble()
    println("введите вес студента")
    var ves = readln()!!.toDouble()
    var Student1=Student("вася","Дмитриев","Королев","мужской","25 июля2003",height,ves)
    Student1.place()
    Student1.information()
    Student1.appereanse()
    //kino
    var horro1=horror("2 часа 15 минут","люси","маньяк","Джорден Уотесен и Крис Фабратц","Заложник","вторник",400.0,3.0,40.0)
    horro1.characteristic()
    horro1.custs()
    horro1.heros()
    var fantasy1=fantasy("2 часа 44 минуты","жарптица","Валерия Крылова","Путешествие в сказку","суббота",350.0,2.0,50.0)
    fantasy1.characteristics()
    fantasy1.animal()
    fantasy1.infoo()
    var film=kino("Последний","понедельник",300.0,1.0,45.0)
    film.movie()
    film.prise()
    film.info()
}