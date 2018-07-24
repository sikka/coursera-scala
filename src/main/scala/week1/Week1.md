**Week 1 notes:**

Functional languages stick to mathematical theories (e.g. Polynomials once defined, coefficients cannot be changed)

**Evaluation is left to right in order of precedence:**

> e.g. (2 * pi) * radius

**Definitions can also have parameters**

e.g.

> def square(x : Double) = x * x
> 
> square: (Double)Double

**Substitution Model**

&#955; calculus or substitution model can ONLY be applied to expressions that do not have a side effect.
Pure functions do not have side effect (which means that they don't mutate values).

**Call by value and Call by name**
If CBV terminates, so does CBN. Other direction is not true.
We can force calling by name :

    def constOne(x: Int, y: => Int) = 1
