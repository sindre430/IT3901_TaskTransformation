"""
Hangeman Game in Python
{$var1 = random(0,10)}
"""

import time #{multipleChoice, input:"time", options:["time", "system.time", "System.Time.time"]}

name = raw_input("What is your name? ")

print "Hello, " + name, "Time to play hangman!"

print ""

time.sleep(1)

print "Start guessing..."
time.sleep(0.5)

word = "secret"

guesses = ''

turns = 10

while turns > 0:         

    failed = 0             

    for char in word: #{movable, region:body}   
        if char in guesses:    
        	print char,    
        else:
            print "_",
            failed += 1

    if failed == 0: #{blank, input:"failed == 0"}      
        print "You won"  
        break              
    print

    guess = raw_input("guess a character:") 

    guesses += guess
    if guess not in word:  
        turns -= 1 #{edit, input:"-=", output:"+="}
        print "Wrong"
        print "You have", + turns, 'more guesses'
        if turns == 0:
            print "You Loose"  