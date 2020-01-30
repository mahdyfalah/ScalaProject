trait StockManagement {

  def delete(id: Int): Array[StoreItem]
  def search(name: String): Array[StoreItem]
  def store(item: StoreItem): Array[StoreItem]
  def sumUp(): Int
  def delByName()
  def getList(): Array[StoreItem]
  def sortById(): Array[StoreItem]
}


