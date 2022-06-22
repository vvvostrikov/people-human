const val likes = 11
const val People = "людям"
const val Human = "человеку"

fun main() {
    val peopleLikes = if ((likes % 10 == 1) && (likes % 100 != 11)) Human else People
            println("Понравилось $likes $peopleLikes")
}


