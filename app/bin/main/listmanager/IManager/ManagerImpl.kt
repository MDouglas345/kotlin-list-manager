package listmanager

class ManagerImpl : IManager{
     constructor(initString : String){
        var stringValues = initString.replace("\n","").split(";")
        var leng= stringValues.size/3

        for (i in 0..leng-1){
            var index = i*3
            AddItem(PhoneItem(stringValues[index],stringValues[index+1],stringValues[index+2].replace(" ","").toInt()))
        }
        
        

        return

       
    }

    var data : MutableList<Item> = mutableListOf<Item>()
    var currentindex: Int = 0

    override fun CreateNewList(){

    }

    override fun GetItemByID(id : Int) : Item?{
        for (i in 0..data.size-1){
            if (data[i].ID == id){
                return data[i]
            }
        }
        return null
    }
    override fun AddItem(item : Item) : Int?{
        item.ID = currentindex
        currentindex++
        data.add(item)
        return currentindex
    }

    override fun DeleteItem(id : Int){
        for (i in 0..data.size-1){
            if (data[i].ID == id){
                data.removeAt(i)
                return
            }
        }
    }

    override fun OutputEntries(){
        for (entry : Item in data){
            println(entry.asString())
        }
    }
}