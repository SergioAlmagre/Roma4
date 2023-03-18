import Formaciones.*
import kotlin.random.Random

private fun factoriaNumero():Int{
    var numero=Random.nextInt(1,21)
    return numero
}

private fun factoriaNombeLegatus():String{
    var nom = arrayOf("Maximo Mario","Aliciorum Magna","Miriam Décima","Lucio Jaimorum" +
            "Escipión Alejandrus","Pompeya Isabelae","Khattari Optimus","Fernandux Sexto")

    var nombre : String = nom[Random.nextInt(0,nom.size-1)]
    return nombre
}


private fun factoriaNombreTribuno():String{
    var nom = arrayOf("Cayo magnus","Escipion Magna","Maximo decimo","Augusto meridio" +
            "Alejandro magno","Kratos ","Optimus","Trajano")

    var nombre : String = nom[Random.nextInt(0,nom.size-1)]
    return nombre
}

private fun factoriaNombreTribuno2():String{
    var nom = arrayOf("Cayo magnus","Escipion Magna","Maximo decimo","Augusto meridio" +
            "Alejandro magno","Kratos ","Optimus","Trajano")

    var nombre : String = nom[Random.nextInt(0,nom.size-1)]
    return nombre
}