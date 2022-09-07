fun main(){
    //CELSIUS A FAHRENHEIT
    val iniC=27.0
    val uniC="Celsius"
    val fUniC="Fahrenheit"
    val formulaC= {ini:Double -> (((9.0/5.0)*ini)+32.0)}
    //KELVIN A CELSIUS
    val iniK=350.0
    val uniK="Kelvin"
    val fUniK="Celsius"
    val formulaK= {ini:Double -> ini-273.15}
    //FAHRENHEIT A KELVIN
    val iniF=10.0
    val uniF="Fahrenheit"
    val fUniF="Kelvin"
    val formulaF= {ini:Double -> (((5.0/9.0)*(ini-32))+273.15)}
    printFinalTemperature(iniC, uniC, fUniC, formulaC)
    printFinalTemperature(iniK, uniK, fUniK, formulaK)
    printFinalTemperature(iniF, uniF, fUniF, formulaF)
}

fun printFinalTemperature(
    initialMeasurement : Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double)->Double
)   {
    val finalMeasurement = String.format("%.2f",conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees is $finalMeasurement degrees $finalUnit")

}