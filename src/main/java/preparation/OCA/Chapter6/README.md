7. What is printed besides the stack trace caused by the NullPointerException from line 16?

A. AE
B. AEBCD
C. AEC
D. AECD
E. No output appears other than the stack trace.

C. The main() method invokes go and A is printed on line 3. The stop method is
invoked and E is printed on line 14. Line 16 throws a NullPointerException, so stop
immediately ends and line 17 doesn’t execute. The exception isn’t caught in go, so the
go method ends as well, but not before its finally block executes and C is printed on

line 9. Because main() doesn’t catch the exception, the stack trace displays and no fur-
ther output occurs, so AEC was the output printed before the stack trace.

17. Which of the following can be inserted into Lion to make this code compile? (Choose all that apply)

A. public void roar(){}
B. public void roar() throws Exception{}
C. public void roar() throws HasSoreThroatException{}
D. public void roar() throws IllegalArgumentException{}
E. public void roar() throws TiredException{}

A, C, D, E. The method is allowed to throw no exceptions at all, making option A cor-
rect. It is also allowed to throw runtime exceptions, making options D and E correct.

Option C is also correct since it matches the signature in the interface.