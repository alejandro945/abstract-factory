import model._
import interface._
@main def hello: Unit = 
  println(msg)
  val mazdaApp: Client = new Client(new Mazda())
  val chevroletApp: Client = new Client(new Chevrolet())
  println(mazdaApp.addAutomobile().head.bodywork)
  println(mazdaApp.addVan().head.fuelType)
  println(chevroletApp.addAutomobile().head.bodywork)
  println(chevroletApp.addVan().head.fuelType)
  

def msg = "Abstract Factory"
