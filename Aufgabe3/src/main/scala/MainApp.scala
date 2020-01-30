object MainApp {
  def main(args: Array[String]): Unit = {
    val db = new Database()

    val item1 = new StoreItem(4, "Laptop", 1000)
    val item2 = new StoreItem(2, "PC", 800)
    val item3 = new StoreItem(3, "Smartphone", 1200)
    val item4 = new StoreItem(1, "PC", 1400)

    db.store(item1)
    db.store(item2)
    db.store(item3)
    db.store(item4)

    for(x <- db.getList()) print("," + x.getName())

    println()

    //db.delByName("PC")
    val temp = db.sortById()
    for(x <- temp) print("," + x.getName())


  }
}