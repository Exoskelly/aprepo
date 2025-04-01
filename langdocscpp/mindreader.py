import time 
import random 
  
x = input("Pick a number, any number: ") 
y = random.randint(1, 100) 
print("Reading mind...") 
time.sleep(.3) 
print("Entering the mindscape...")
time.sleep(.3)
print("Loading chunks...")        
time.sleep(.4)
pluh = ("Is your number " + x + "? ") 
z = input(pluh) 
if z == "no" : 
    print("Liar. I hope you burn.") 
if z == "yes": 
    print("Hooray!!") 