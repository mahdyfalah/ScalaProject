class StoreItem(id: Int, name: String, value: Int) extends Item(id, name, value) with Printer {

  override def printAction(actionName: String, name: String): Unit = {
    println(name + " " + actionName)
  }
}
