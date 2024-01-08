# Explanation

In this file, write a summary of how you approached solving this problem. You may wish to respond to the following questions:

1. How did you design the game to minimize needing to re-write the code to play the game for all the different play types? Use **object-oriented** vocabulary here (polymorphism, interfaces, implementations, run-time types and compile-time types, etc).
2. What was your smarter strategy? How did you come up with that strategy? Does it usually win (against Random or against you)?
3. What were some of the challenges in implementing this project?
4. What did you learn from doing this project?

Fill in your answers in this file **before submitting**. You can use [Markdown syntax](https://docs.replit.com/tutorials/replit/markdown) if it helps. (Click on the "open preview" button above.)

1. I designed the game to minimize needing to re-write the code by using an interface. The interface implements into the three different player classes and the main class as well. I also used getters to call heads and tails, coin flip and the number of coins, which were used in all of the player classes and the main class. To summarize, with the use of an interface and getters I had an easier time writing my code because they helped give me an idea of how the structure of the different classes should be overall.
2. My smarter stratgey is to raise the bid by one. My chain of thought when coming up with this strategy was that you do not know what to expect from the random player, so with the smart player I did the opposite and had it make more cautious raises to the bid in a sense. It usually wins against the random player and me as well.
3. The biggest challenge for me was understanding how the game works. To elobarate, on previous projects there was always an example of how the final output should look in the console, so I always had somewhat of an idea on how to get started, by reverse engineering the final output. With this project, that was not the case. To summarize, my biggest challenges with this project was understanding and visualzing the game and how to initially get started.
4. From this project, I learned how to create interfaces and how to implement an interface to different classes. I also learned how to use the random function in different ways and learned more about using getters. Overall, I gained a better understanding of object-oriented design.