fun main() {

  // ordered list of every country according to their real life groups
  // I purposely hard coded this list because I wanted to use the order of the teams to ensure they were uncluded in the correct group
  // val keyword mean countries variable can only represent this string
  // listOf() means that the list can only have read-only operations performed on it
  val countries = listOf("Italy", "Wales", "Switzerland", "Turkey", "Belgium", "Russia", "Finland", "Denmark", "Netherlands", "Ukraine", "Austria", "North Macedonia", "Czech Republic", "England", "Croatia", "Scotland", "Sweden", "Slovakia", "Spain", "Poland", "France", "Germany", "Portugal", "Hungary")

  // declare variable that represent a mutable Map with data types of String and Int...
  // which will represent the country name and the number of points each country has within their group
  var groupA = mutableMapOf<String, Int>()
  var groupB = mutableMapOf<String, Int>()
  var groupC = mutableMapOf<String, Int>()
  var groupD = mutableMapOf<String, Int>()
  var groupE = mutableMapOf<String, Int>()
  var groupF = mutableMapOf<String, Int>()

  // loop through countries with deconstructed condition -> (teamIndex, team) in countries.withIndex()
  // countries.withIndex() will provide the index of each element with the countries list
  for ((teamIndex, team) in countries.withIndex()) {
    // print statement with team index and country name
    println("${teamIndex + 1}: $team")
  }

  // create do..while loop
    // within do loop...create for loop with deconstructed condition to make sure to get the index of each country within the list
  do {
    // set variable to hold a count value that will control the ending of the do loop
    var counter = 1
    // for each country and its index within countries.withIndex()
    for ((countryIndex, country) in countries.withIndex()) {
      // check if countryIndex + 1 falls within the proper range to be included in the proper group
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
      // increase counter by 1 at the end of each for loop to start another iteration
      counter += 1
    } // while our counter variable is less than or equal to the size of the countries list, continue to the do loop
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