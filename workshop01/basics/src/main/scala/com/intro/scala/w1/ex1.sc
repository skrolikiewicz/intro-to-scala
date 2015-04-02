// ex 1
def sygnum(a: Int): Int = {
  a match {
    case 0 => 0
    case n if n > 0 => 1
    case _ => -1
  }
}

println(sygnum(1))
println(sygnum(0))
println(sygnum(-1))
// ex 2
// for (int i = 10; i >= 0; i--) System.out.println(i);
10 to 1 by -1 foreach(i => println(i))

// ex3
def countdown(x: Int) = {
  x to 0 by -1 foreach println
}
countdown(5)
//ex4
def compute(x: Int, n: Int): Int = {
  n match {
    case 0 => 1
    case n if n > 0 && n % 2 == 0 => compute(x, n/2) * compute(x, n/2)
    case n if n > 0 && n % 2 != 0 => x * compute(x, n-1)
    case n if n < 0 => 1 / compute(x, -n)
  }
}
println(compute(2, 0))
println(compute(2, 1))
println(compute(2, 2))
println(compute(2, 3))
println(compute(2, 4))
