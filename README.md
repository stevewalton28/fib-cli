# fibonacci-cli
The Fibonacci problem for testers.  This version is command line only.

## Black box testers
The goal of the black box test of The Fibonacci is to figure out the highest input index that be given where the application continues to return a valid Fibonacci number in the given index/position of the sequence.

The secondary goals here are to understand all of the application output and uncover "user interface" and "user interaction" defects with the system.

To compile the source code from command line (without an IDE) run the following from the root of the cloned directory:
'javac src/Fibonacci.java'

To execute the application (where % is the index you wish to test):
java src/Fibonacci.class %'

## White box testers
The goal of the white box tester for The Fibonacci is to prove through a TDD approach all of the goals from the Black Box test (see details above) and write a failing unit test for each of them.

The existing unit tests should be reviewed and amended accordingly.

The application "architecture" or the overall design pattern of the software should be identified.

Finally, the participant should fix the application so that their "red" unit tests start to pass.
