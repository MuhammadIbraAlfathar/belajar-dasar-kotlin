package kotlin_pzn

fun main() {
    val name : Array<String> = arrayOf("Ibraa", "Joko", "Anwar")
//    name.get(0)
//    name.set(2,"Zakaria")

    name[2] = "Zakaria"

    println(name[2])


    val age = arrayOf(1,3,4,5)
    println(age[2])

    val members : Array<String?> = arrayOfNulls(6)
    members[0] = "Eko"
    members[1] = "Eko"
    members[2] = "Eko"
    members[3] = "Eko"
    members[4] = null
    members[5] = "Eko"

    println(members[4])
    println(members.size)
}