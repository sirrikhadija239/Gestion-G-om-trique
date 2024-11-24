fun main() {
    val p1 = Point(0.0, 0.0)
    val p2 = Point(3.0, 4.0)
    val c = Cercle(p1, 5.0)
    p2.afficher()
    println("la distance entre p1 et p2 : ${p1.norme(p2)}")
    c.afficher()
    println("surface: ${c.surface()}")
    println("perimetre: ${c.perimetre()}")
    if (c.appartient(p2))
        println("p2 appartient au cercle c")
    else
        println("p2 n'appartient pas au cercle c")
}
