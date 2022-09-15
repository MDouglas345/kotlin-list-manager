package listmanager

public interface IManager{
    fun CreateNewList()

    fun GetItemByID(id : Int) : Item?
    fun AddItem(item : Item) : Int?
    fun DeleteItem(id : Int)

    fun OutputEntries()

}