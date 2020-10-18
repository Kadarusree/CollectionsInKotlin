fun main() {
    //Creating a simple array
    var nums = intArrayOf(1,2,3,4)
    for ((i,e) in nums.withIndex()){
        println(i)
    }

    //changeing elemets in array with Index
    nums[2] = 10
    for ((i,e) in nums.withIndex()){
        println("Indes is $i and Number is $e")
    }

    //Change using Set method

    nums.set(2, 11)
    for ((i,e) in nums.withIndex()){
        println("Indes is $i and Number is $e")
    }
    println(nums[3])
    println(nums.get(3))

    println(nums.lastIndex)

    //Creating a dynamic array
    var str = arrayListOf<String>()
    str.add("Sreekanth 1")
    str.add("Sreekanth 2")
    str.add("Sreekanth 3")
    str.add("Sreekanth 4")

    for ((i,e) in str.withIndex()){
        println("Indes is $i and Number is $e")
    }

    //But in array we have limited elemets


   // List In Kotlin

    var lsitofnames = mutableListOf<String>("Sree","kanth")
    lsitofnames.add("Kadari")
    for ((i,e) in lsitofnames.withIndex()){
        println("Indes is $i and Number is $e")
    }

    println(lsitofnames.get(1))
    println(lsitofnames.indexOf("kanth"))


}