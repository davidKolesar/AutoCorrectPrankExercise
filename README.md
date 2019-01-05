# AutoCorrectPrankExercise
Create an algorithm called "autocorrect" that takes a string and replaces all instances of "you," "u," or any permutation of the word "you" (not case sensitive) with "your sister" (always lower case).  Return the resulting string.

Here's the slightly tricky part: These are text messages, so there are different forms of "you" and "u".

For the purposes of this kata, here's what you need to support:

    "youuuuu" with any number of u characters tacked onto the end

    "u" at the beginning, middle, or end of a string, but NOT part of a word

    "you" but NOT as part of another word like youtube or bayou
