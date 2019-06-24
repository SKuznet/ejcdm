13. What is the output of the following code?

A. SpiderArthropod
B. ArthropodSpider
C. SpiderSpider
D. ArthropodArthropod
E. The code will not compile because of line 5.
F. The code will not compile because of line 9.

A. The code compiles and runs without issue, so options E and F are incorrect. The
printName() method is an overload in Spider, not an override, so both methods may
be called. The call on line 8 references the version that takes an int as input defined
in the Spider class, and the call on line 9 references the version in the Arthropod class
that takes a double. Therefore, SpiderArthropod is output and option A is the correct
answer.

18. What is the output of the following code? (Choose all that apply)

A. 2
B. 4
C. 6
D. The code will not compile because of line 5.
E. The code will not compile because of line 6.
F. The code will not compile because of line 8.

E. The code doesn’t compile because line 6 contains an incompatible override of the
getNumberOfGills(int input) method defined in the Aquatic interface. In particular,
int and String are not covariant returns types, since int is not a subclass of String.
Note that line 5 compiles without issue; getNumberOfGills() is an overloaded method
that is not related to the parent interface method that takes an int value.
