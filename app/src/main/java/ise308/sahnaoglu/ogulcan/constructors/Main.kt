package ise308.sahnaoglu.ogulcan.constructors

fun main(args: Array<String>){
    val araba1 = Araba("audi","a4",2009,230000)
    val araba2 = Araba("audi","a7",2013,320000)
    val araba3 = Araba("bmw","x5",2004,172000)
    val araba4 = Araba("bmw","540",1999,160000)
    val araba5 = Araba("bmw","320",2017,450000)
    val anahtar = 1500
 // val araba7 = indirim + anahtar
    //overload
    araba1.fiyat = araba1.fiyat.plus(anahtar)
    araba2.fiyat = araba2.fiyat.plus(anahtar)
    araba3.fiyat = araba3.fiyat.plus(anahtar)
    araba4.fiyat = araba4.fiyat.plus(anahtar)
    araba5.fiyat = araba5.fiyat.plus(anahtar)
  //  println(Musteri1.Ad)
   // println(Musteri2.Ad)
    println("Arac Adı: ${araba1.marka} ${araba1.ismi} Modeli: ${araba1.yas} Fiyatı: ${araba1.fiyat} ")
    println("Arac Adı: ${araba2.marka} ${araba2.ismi} Modeli: ${araba2.yas} Fiyatı: ${araba2.fiyat} ")
    println("Arac Adı: ${araba3.marka} ${araba3.ismi} Modeli: ${araba3.yas} Fiyatı: ${araba3.fiyat} ")
    println("Arac Adı: ${araba4.marka} ${araba4.ismi} Modeli: ${araba4.yas} Fiyatı: ${araba4.fiyat} ")
    println("Arac Adı: ${araba5.marka} ${araba5.ismi} Modeli: ${araba5.yas} Fiyatı: ${araba5.fiyat} ")
}

//privateclass,settergetter
private class Musteri (var Ad : String, odeme : Int){
    private var Musteri1 = Musteri("Mehmet",30000)
        get() = field
        set(value) {field = Musteri1}

    private var Musteri2 = Musteri("ali",250000)
}

//parent & constructor
open class Arac (var vasita: String){
    init {
        println("Elimizde $vasita modelinde araçlar mevcuttur.")

}
}
public class Araba (marka: String, ismi: String, yas: Int, fiyat: Int): Arac(vasita = ismi){
    val marka = marka
    val ismi = ismi
    val yas = yas
    var fiyat = fiyat
    val indirim = 0


}





