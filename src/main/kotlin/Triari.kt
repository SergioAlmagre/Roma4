class Triari : Tropa {

    private var MediaEdad : Int

    constructor(){
        this.MediaEdad=0
    }

    constructor(numHombres: Int, MediaEdad: Int) : super(numHombres) {
        this.MediaEdad = MediaEdad
    }

    override fun diezmar(): String {
        this.setNumHombres((this.getNumHombres()*0.9).toInt())
        this.recalculaOficialesTropa()
        return "Triari diezmado ${this.getNumHombres()}"
    }

    override fun toString(): String {
        return "Triari(MediaEdad=$MediaEdad)"
    }
}