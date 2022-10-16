package model

import java.util.Date

class MazdaAuto extends Automobile {
    def model = new Date().getYear()
    def cylinderCapacity = 2000
    def bodywork = "Grand Touring Mazda"

    def run = print("Mazda Nitro")
    def isDualAutomaticAir = true
}

