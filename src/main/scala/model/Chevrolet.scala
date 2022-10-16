package model
import contract._
class Chevrolet extends AbstractFactory{

    def createAutomobile(): Automobile = return new ChevroletAuto()

    def createVan(): Van = return  new ChevroletVan()

}