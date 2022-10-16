package model
import contract._

class Mazda extends  AbstractFactory {

    def createAutomobile(): Automobile = return new MazdaAuto()

    def createVan(): Van = return new MazdaVan()

    
}