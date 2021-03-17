import java.util.*

fun main() {
    counties("Kisumu","Nairobi","Nakuru","Mombasa")
    choosing()
    numbers()


    var days=days("monday","tuesday","wednesday")
    println(Arrays.toString(days))

}

fun counties(county1:String,county2:String,county3:String,county4:String){
    var countiesArray=arrayOf(county1, county2,county3,county4)
    println(Arrays.toString(countiesArray))
}
fun choosing() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println(cities[0].capitalize() + "," + cities[1].capitalize() + "," + cities[2].capitalize() + "," + cities[3].capitalize())
}
fun numbers() {
    var num = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var numbers3=num[1]+num[2]
    println(numbers3)
    var item= num.indexOf(158)
    println(item)

    var sort=num.sortedArray()
    println(Arrays.toString(sort))
}


fun days(monday:String,tuesday:String,wednesday:String):Array<String>{
    var weeksArray=arrayOf(monday,tuesday,wednesday)
    return weeksArray

}


