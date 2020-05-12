# Virtual Pet

See the HELP.md for assignment directions and guide.

Started with creating the variables needed to begin making classes and methods.

Once I made the main variables I was able to figure out how to start some testing for the methods for fee(), thirst(), boredom(), and waste().  I also tested to make sure that the balances for each could not exceed 100.

Once I had VirtualPet class created and the methods created, I started to code the VirtualPetApplication.
I went by the suggested example in the directions to start.  I thought I would add an option for a person to choose a pet at the start of the application.  I offered the choices of giraffe, lion, owl, and dog. 

From there I created VirtualPet objects for each type of animal, and gave them all a beginning balance hunger, thirst, waste, and boredom.

After establishing that I then went and started the option menu for actions on the pets.  I also added an option to see the running balances.  

I created a tick() method to be enacted whenever the option of do nothing was chosen.  Depending on which option was chosed, I added an impact to 1 or 2 other options, as mentioned in directions.  If feed was chosen, then the thirst would go up, as an example.

I attempted to put some ASCII art, but I wasn't that sure how to do it, and when I tried, I started messing up code, so I thought it best to not try and do it.

My big loop was originally in the VirtualPetApplication, but Intellij kept giving me warnings about repetitive code, and to make a method, so that's what I did and created a method to handle the loop.
<<<<<<< HEAD

--test to using git

=======
>>>>>>> bc2894a982a45daee6f8dc5b2dd79cf685ce139f
