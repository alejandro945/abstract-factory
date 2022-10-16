package contract
import model._

trait AbstractFactory {
    def createAutomobile(): Automobile
    def createVan(): Van
} 