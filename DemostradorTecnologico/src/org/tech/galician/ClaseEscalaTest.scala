/**
 * 
 */
package org.tech.galician

import scala.runtime.ObjectRef

/**
 * Esta clase es un  Object que tiene un ciclo de vida Singleton
 * Pensando en un servicio o una función. 
 * 
 * @author Benxa
 *
 */
object ClaseEscalaTest extends ObjectRef {

 
  
  
  def main(args: Array[String]): Unit = {
    
    println("Probando Escala")
    //val es para declarar objetos de sólo lectura. Por lo tanto deben ser inicializados al declararlos
    //piénsese en val como final. PERO VAL ES N PUNTERO AL OBJETO, no al contenido del mismo
    val valor =5
    
    //valor=valor+1 :Da error de compilación
    
    //var indica punteros que se pueden modificar. Todo en Scala son objetos así que cuidadín. 
    var valor2=6
    valor2=valor2+1
    println(valor2)
    
    
    println("El valor de la funcion A es "+funcionA())
    println("El valor de la funcion B es: "+funcionB())
    
    funcionVoid()
    
    //no es necesario indicar el tipo de la variable pero es posible
    var claseA = new claseA
    var claseB : claseB = new claseB
    
    claseB
  }
  
  
  
  /*
   * FUNCIONES O MÉTODOS
   * 
   */
  
  
  def funcionA() : String={
    //No hace falta decir el return, el último valor es el que se devuelve. Todavía no se como hacer Ifs para salir antes. 
    "4"
  }
  
  def funcionB() : Int={5}
  
  
  //funcion void
  def funcionVoid() {
    println("void")
  }
  

}



//SE PUEDEN DEFINIR VARIAS CLASES EN EL MISMO FICHERO. ALELUYA!!!

/**
 * 
 * Las clases son instancias no Singleton.
 * @author Benxa
 *
 */
class claseA {
  
  //El constructor no se declara  -- ver como hacer un constructor con varios parámetros, 
  //No se si esto último es necesario viendo que se tiende a la inyección de dependecias por las propiedades
  
  var valor=5
  println("constructor de la clase")
  
  funcionClaseA("mi mensaje")
  funcionClaseA()
  
  /**
   * 
   * Hay valores por defecto en las llamadas a las funciones
 * @param cadena
 * @return
 */
def funcionClaseA(cadena: String ="valorPorDefecto") : Long={
    
    println(cadena)
    
    34634535
  }
  
  
}



class claseB {
  
  var tomatoma=5
  var cadena=null
  
 //NO HAY TIPADO DINAMICO A NIVEL LOCAL  OH SHIT!
  //tomatoma="Lala"
  
  def funcionClaseB(){println("Función clase B")}
  
}