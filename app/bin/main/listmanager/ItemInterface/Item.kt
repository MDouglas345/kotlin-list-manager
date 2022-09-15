package listmanager

abstract class Item : IItem{
    var ID : Int = 0

    override abstract fun asString() : String

}