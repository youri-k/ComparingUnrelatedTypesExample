package example

object Hello extends App {
  val stringOption: Option[String] = Some("1")
  val intOption: Option[Int] = Some(1)

  println(if (stringOption == intOption)
    Some("vals are equal") else None)

  println(for {
    string <- stringOption
    int <- intOption
    if string == int
  } yield "vals are the same")

  println(for {
    string <- stringOption
    int <- intOption
    if string.toInt == int
  } yield "vals are the same")
}
