11. Which are true of the following code? (Choose all that apply)
(Rope)
A. The code compiles as is.
B. There is exactly one compiler error in code.
C. There is exactly two compiler errors in code.
D. If the lines with compiler errors are removed, the output is climb climb.
E. If the lines with compiler errors are removed, the output is swing swing.
F. D. If the lines with compiler errors are removed, the code throws a NullPointerException.

B, E. Line 10 does not compile because staic methods are not allowed to call instance methods. Even though we are calling play() as if it were an instance method and an instance exists,
Java knows play() is really a static method and treats it as such.
If line 10 is removed, the code works.
It does not throw a ullPointerException on line 16 because play() is a static method.
Java looks at the type of reference for rope2 and translates the call to Rope.play().


13. How many compiler erroes are in the following code?
(RopeSwing)
A. 0
B. 1
C. 2
D. 3
E. 4
F. 5

E. static final variables must be set exactly once, and it must be in declaration line or in a static initializatiom block.
Line 4 doesn't compile because bench is mot set in either of these locations.
Line 15 doesn't compile because final variables are not allowed to be set after that point.
Line 11 doesn't compile because name is set twice: once in the declaration and again in the static block.
Line 12 doesn't compile because rightRope is set twice as well. Both are in static initialization blocks.


