package model
import contract._

class Client(factory: AbstractFactory) {
    private val marketerFactory: AbstractFactory = factory
    private val automobiles: List[Automobile] = Nil
    private val vans: List[Van] = Nil

    def addAutomobile(): List[Automobile] = {
       return marketerFactory.createAutomobile() :: automobiles
    }

    def addVan(): List[Van] = {
       return marketerFactory.createVan() :: vans
    }
}