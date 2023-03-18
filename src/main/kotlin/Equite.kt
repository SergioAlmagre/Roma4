class Equite :Tropa{
    private var numCaballos : Int

    constructor(numHombres: Int, numCaballos: Int) : super(numHombres) {
        this.numCaballos = numCaballos
    }

    fun getCaballos():Int{
        return this.numCaballos
    }

    fun setCaballos(c:Int){
        this.numCaballos=c
    }


    override fun diezmar(): String {
        this.setNumHombres((this.getNumHombres()*0.1).toInt())
        this.recalculaOficialesTropa()
        return "Equites diezmado ${this.getNumHombres()}"
    }

    override fun toString(): String {
        return "Equite(numCaballos=$numCaballos)"
    }
}