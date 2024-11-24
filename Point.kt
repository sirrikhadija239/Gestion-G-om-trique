class Point(var x: Double, var y: Double) {
    constructor(p: Point) : this(p.x, p.y)
    fun afficher() = println("POINT($x, $y)")
    fun norme(p: Point): Double {
        return Math.sqrt((this.x - p.x).pow(2) + (this.y - p.y).pow(2))
    }
}
