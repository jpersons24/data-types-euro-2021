fun main() {

  val countries = listOf("Italy", "Wales", "Switzerland", "Turkey", "Belgium", "Russia", "Finland", "Denmark", "Netherlands", "Ukraine", "Austria", "North Macedonia", "Czech Republic", "England", "Croatia", "Scotland", "Sweden", "Slovakia", "Spain", "Poland", "France", "Germany", "Portugal", "Hungary")

  val groupA = mutableMapOf<String, Int>()
  val groupB = mutableMapOf<String, Int>()
  val groupC = mutableMapOf<String, Int>()
  val groupD = mutableMapOf<String, Int>()
  val groupE = mutableMapOf<String, Int>()
  val groupF = mutableMapOf<String, Int>()

  for ((teamIndex, team) in countries.withIndex()) {
    println("${teamIndex + 1}: $team")
  }

  do {
    var counter = 1
    for ((countryIndex, country) in countries.withIndex()) {
      
      if (countryIndex + 1 <= 4) {
        groupA.put(country, 0)
      } else if ((countryIndex + 1 > 4) && (countryIndex + 1 <= 8)) {
        groupB.put(country, 0)
      } else if ((countryIndex + 1 > 8) && (countryIndex + 1 <= 12)) {
        groupC.put(country, 0)
      } else if ((countryIndex + 1 > 12) && (countryIndex + 1 <= 16)) {
        groupD.put(country, 0)
      } else if ((countryIndex + 1 > 16) && (countryIndex + 1 <= 20)) {
        groupE.put(country, 0)
      } else if ((countryIndex + 1 > 20) && (countryIndex + 1 <= 24)) {
        groupF.put(country, 0)
      }

      counter += 1
    }
  } while (counter <= countries.size)

  println()
  println("6 Groups and their Teams with points")
  println()
  println("Group A:")
  println(groupA)
  println()
  println("Group B:")
  println(groupB)
  println()
  println("Group C:")
  println(groupC)
  println()
  println("Group D:")
  println(groupD)
  println()
  println("Group E:")
  println(groupE)
  println()
  println("Group F:")
  println(groupF) 
}