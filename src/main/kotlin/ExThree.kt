fun main(){
    val sideFirst = readln().toInt()
    val sideSecond = readln().toInt()
    val diagonalRectangle = (sideFirst * sideFirst) + (sideSecond * sideSecond)
    println(diagonalRectangle)
}