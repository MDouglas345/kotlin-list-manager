package listmanager

class PhoneItem : Item{
    var Manufacturer : String = ""
    var Model : String = ""
    var Year : Int = 0

    

    constructor(manu : String, model : String, year : Int){
        Manufacturer = manu
        Model = model
        Year = year
    }

    override fun asString() : String{
        return """$Manufacturer $Model $Year ID = $ID"""
    }
}