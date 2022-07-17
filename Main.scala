import org.scalajs.dom

object Main {
  val f = { (e: Any) => println(s"Event handled: $e") }

  def main(args: Array[String]): Unit = {
    println("Hello world!")
    dom.document.addEventListener("load", f)
  }
}
