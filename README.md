# Stacks-and-Queues
All files represent work on stacks and queues in java.See readme for details o each individual file.

File Details
1)StackForHackerRank--This file will take ina string the push all the individual charachters in that string push them onto the stack , then check if the charachter is equal and pop it off
,then if the boolean flag= false and the stack is empty as all matching symbols have been poped of the stack then it will print out valid or if these conditions have not been met then it 
will print out false.This is designed to work only with brackets to check your syntax.
----------------------
2)StackLab7--This file will check if an input of .push() and .pop() fucntions from the stack class that is in the file.It then will check if the stack is empty or not.If the stack is not empty then it will find the largest number that is still in the stack.To push and pop I have used a String array to read in the the commands for the stack. Then the command is turned into a substring to get just the number for a push() but before it is put into the push() the substrign must be parsed to an int from the string.This is possible as it is just a stirng being turned to an integer. 
----------------------
3)StackX and BracktChecker and BracetsInput do the same job as the file StackForHackerRank except that the file is broken down into seperate classes,the file StackX holds the code for the stack functions such as push() and pop()
,BracketCheckr contains the code to see if the brackts match and that there is no brackets which are left open or closed without a corresponding bracket and will print out valid or invalid,
BracketsInput is the main method file of the three files it contains the main method and is the file where the test string of brackets is read in to the code.
