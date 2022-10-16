import model._
import interface._
@main def hello: Unit = 
  println(msg)
  val mazdaApp: Client = new Client(new Mazda())
  val chevroletApp: Client = new Client(new Chevrolet())
  println(mazdaApp.addAutomobile())
  println(mazdaApp.addVan())
  println(chevroletApp.addAutomobile())
  println(chevroletApp.addVan())
  

def msg = "Abstract Factory"
