# Stacks-and-Queues
All files represent work on stacks and queues in java.See readme for details o each individual file.

File Details
1)StackForHackerRank--This file will take ina string the push all the individual charachters in that string push them onto the stack , then check if the charachter is equal and pop it off
,then if the boolean flag= false and the stack is empty as all matching symbols have been poped of the stack then it will print out valid or if these conditions have not been met then it 
will print out false.This is designed to work only with brackets to check your syntax.
----------------------
2)StackLab7--This file will check if an input string is the same backwards as fowards by pushing all charachters on and then by poping them off you can check to see using a for loop for the two arrays
if the two strings match by using if(ar[i]==check[i]) if they are the same it will print out valid or will print out invalid if they are not the same.This works because when you pop off a stack 
it pops the last entered character first,therefore you are able to determine if the string is the same backwards abd fowards,this uss and array to store the string.
----------------------
3)StackX and BracktChecker and BracetsInput do the same job as the file StackForHackerRank except that the file is broken down into seperate classes,the file StackX holds the code for the stack functions such as push() and pop()
,BracketCheckr contains the code to see if the brackts match and that there is no brackets which are left open or closed without a corresponding bracket and will print out valid or invalid,
BracketsInput is the main method file of the three files it contains the main method and is the file where the test string of brackets is read in to the code.
