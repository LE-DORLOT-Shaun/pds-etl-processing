import DataTransformer.{test, transformDataBronze, transformDataSilver}

object Main {
  def main(args: Array[String]): Unit = {
    println("FROM RAW TO BRONZE")
    transformDataBronze()
    println("FROM BRONZE TO SILVER")
    transformDataSilver()
    test()
  }
}
