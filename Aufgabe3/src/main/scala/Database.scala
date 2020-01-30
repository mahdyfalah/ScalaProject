class Database {
  private var storedItems = Array.empty[StoreItem]

  def delete(id: Int)={
    val tempArray = storedItems.filter(i => i.getId() != id)
    val deletedItem = storedItems.filter((i) => i.getId() == id)

    if(deletedItem.isEmpty){
      println("Id " + id + " nicht gefunden")
    }else{
      deletedItem(0).printAction("gelöscht", deletedItem(0).getName())
    }

    storedItems = tempArray
  }

  def search(name: String): Array[StoreItem] ={
    val tempArray = storedItems.filter((i) => i.getName() == name)

    for(i <- tempArray){
      i.printAction("gefunden", name)
    }
    if(tempArray.isEmpty) println(name + " nicht gefunden")

     tempArray
  }

  def store(item: StoreItem): Array[StoreItem] = {
    storedItems = storedItems :+ item
    item.printAction("gespeichert", item.getName())
    storedItems
  }

  def sumUp(): Int ={
    var sum: Int = 0
    for(i <- storedItems){
      sum += i.getValue()
    }
    sum
  }

  def delByName(name: String) ={
    for(x<-storedItems){
      if(x.getName() == name) delete(x.getId())
    }
  }

  def getList() = storedItems

  def sortById() = {
    storedItems.sortWith((x,y) => x.getId() > y.getId())
  }
}