val name = "vikas"
val l_name = "gautam"
val age = 30
val weight = 75.43245

// using s interpolator
val str = s"this is '$name $l_name', $age years old "

println(s"In the next 10 years i will be ${age + 10} years old")

//using f interpolator
println(f"the man named '$l_name, $name' is $weight%.2f kgs")

// using raw interpolator
println(raw" i need to be present in \nest\ folder")


