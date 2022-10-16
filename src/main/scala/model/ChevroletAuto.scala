package model

import java.util.Date

class ChevroletAuto extends Automobile {
    def model = new Date().getYear()
    def cylinderCapacity = 2200
    def bodywork = "Hatchback"

    def tractionControl = "lead"

    def hasSoldingRearSeat = false
}