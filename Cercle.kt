class Cercle(var centre: Point, var rayon: Double) {
    constructor(centre: Point, p: Point) : this(centre, centre.norme(p))
    constructor(cercle: Cercle) : this(cercle.centre, cercle.rayon)
    fun surface() = PI * rayon.pow(2)
    fun perimetre() = 2 * PI * rayon
    fun appartient(p: Point) = centre.norme(p) == rayon
    fun afficher() = println("CERCLES(${centre.x}, ${centre.y}, $rayon)")
}
