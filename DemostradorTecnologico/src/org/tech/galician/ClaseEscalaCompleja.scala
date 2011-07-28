package org.tech.galician

/**
 * 
 * Esta clase es para hacer cosas más complicadas
 * Probar las expresiones lambda y hacer consultas a listas en memoria, si se puede.
 * @author Benxa
 *
 */
object ClaseEscalaCompleja {
  
  
  var lista=List(1,2,3,4,5,6,7,8,9,10)
  
  //TOMA EXPRESIÓN LAMDA!!!!! GUAPISISISISIMO ADIOS BUCLES FOR
  
  var listaFiltrada= lista.filter(a=>(a%2==0))
  println(listaFiltrada)
  
  
  //AHORA CON LISTAS DE clases
  	
  var listaInicial=List(new PruebaListaLamda(1, "Hola"),
		  				new PruebaListaLamda(2, "Adios"),
		  				new PruebaListaLamda(3, "Holita"),
		  				new PruebaListaLamda(4, "Hola"),
		  				new PruebaListaLamda(5, "Adios"),
		  				new PruebaListaLamda(6, "Holita"),
		  				new PruebaListaLamda(7, "Hola"),
		  				new PruebaListaLamda(8, "Adios"),
		  				new PruebaListaLamda(9, "Holita")
		  				)
		  				
		  				
 // LA BOMBA!!! Sólo le falta el tipado dinámico en ámbito local y ya puedes hacer consultas SQL de forma dinámica en Runtime		  				
  val listaFiltradaClases = listaInicial.filter(x=>(x.numero2%2==0 && x.valor2.contains("Hol")))
  
  println("LISTA FINAL: ")
  for(instancia <- listaFiltradaClases)
    println(instancia.numero2+" "+instancia.valor2)
  
		
		  				

}


class PruebaListaLamda( numero: Int, valor : String){
  
//Como se podrán igualar nombres de variables?

  var numero2=numero
  var valor2=valor
}