import java.io.File
import java.io.FileWriter
import java.io.InputStream

fun main()
{
    val inputStream: InputStream = File("words.txt").inputStream()
    val lineList = mutableListOf<String>()

    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    val chosenOne = lineList[(0..lineList.size).random()]

    println("Нужно составить слова из букв слова **$chosenOne**")
    println("Когда закончаяться силы, фантазия или слова напишите {}")

    val userInput: MutableList<String> = mutableListOf()
    var currentInput = readLine()
    while (currentInput != "{}")
    {
        userInput.add(currentInput.toString().toLowerCase())
        currentInput = readLine()
    }

    println("Проверяем буквы...")
    val output: MutableList<String> = mutableListOf()
    val checklist = chosenOne.toCharArray()
    userInput.forEach()
    {
        var currentWord = it.toCharArray()
        var check = it.indexOfAny(checklist) >= 0
        if(check)
        {
            output.add(it)
        }
    }

    var score = 0
    println("Проверяем слова...")
    output.forEach()
    {
        if (lineList.contains(it))
        {
            score++
        }
    }

    println("Правильно составленно $score слов. Слова выписываются в файл result.txt")

    val outFile = FileWriter("result.txt")
    outFile.use { writer ->
        output.forEach { writer.write(it + '\n') }
    }

}