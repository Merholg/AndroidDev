// Самостоятельная работа №4.
// Изучение официальной документации Kotlin (изучение глав: Введение, Основы, Классы и объекты, Функции и лямбды, Коллекции). 
// Выполнить задание: вывести в консоль каждую четную букву алфавита, используя циклы и коллекции.
//    ожидается: B D F H J L N P R T V X Z

fun main() 
{
    val EvenLetters: MutableList<Char> = mutableListOf()
    var c: Char

    c = 'A'
    while (c <= 'Z') 
    {
        EvenLetters.add(c)
        ++c
    }
    
    EvenLetters.forEachIndexed { i, e -> if ((i + 1) % 2 == 0 ) print("$e ") }

}
