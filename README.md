# AlgorithmsDaily

#### Problem 1 - Sieve of Erastosthenes
Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.

#### Problem 3 - Roman Numerals to Decimals
Write a program to convert the given roman numeral into decimal form.
 
#### Problem 4 - Construct BST from Preorder and Inorder Traversals
Given the preorder and inorder traversals of a BST, construct the BST and print it's postorder traversal.

#### Problem - FLAMES
This is a simple game you must have played around with during your teenage days, calculating FLAMES of you and your crush! Given the names of two people, cancel out the common letters (repeated occurrence of a letter is treated separately, so 2A's in one name and one A in the other would cancel one A in each name), count the total number of remaining letters (n) and repeatedly cut the letter in the word FLAMES which hits at the nth number when we count from F in cyclic manner.
```bash
For example:
NAME 1: RANVEER
NAME 2: DEEPIKA
After cutting the common letters: 
NAME 1: RNVR 
NAME 2: DPIK
Total number of letters left=8
FLAMES, start counting from F : 1=F, 2=L, 3=A, 4=M, 5=E, 6=S, 7=F,8=L ...So cut L
FLAMES: repeat this process with remaining letters of FLAMES for number 8 (start count from the letter after 
the last letter cut) . In the end, one letter remains. Print the result corresponding to the last letter:
F=FRIENDS
L=LOVE
A=ADORE
M=MARRIAGE
E=ENEMIES
S=SISTER
```
#### Who can contribute to this repo?
  Anybody from SVCE who is passionate about Open Source and can contribute quality solutions to the aforementioned questions in any programming language.

#### When and how do I submit pull request(s)?
  You can submit pull request(s) anytime from October 1, 2019 to October 31, 2019. If your pull request(s) meet a certain threshold quality, they will be merged, else shall be marked as spam.
  Here is an excellent [repo](https://github.com/Logic-Xcution/Kickoff-To-Open-Source) explaining how to make your first pull request.
  
  **Send a pull request only after you complete at least one problem.**

#### Who can contribute to this repo?
  Anyone from SVCE who is passionate about Open Source and can contribute quality solutions to the aforementioned questions in any programming language.

   #### When and should I submit pull request(s)?
  You can submit pull request(s) anytime from October 1, 2019 to October 31, 2019. If your pull request(s) meet a certian threshold quality, they will be merged, else shall be marked as spam.
  Here is an excellent [repo](https://github.com/Logic-Xcution/Kickoff-To-Open-Source) explaining how to make your first pull request.

  #### What language should I use to code?
  All programming languages are more than just welcomed here.

  #### I have never used to Git or GitHub. What should I do?
  No worries! It's never too late to start learning. Check out this excellent [course](https://www.udacity.com/course/version-control-with-git--ud123) on Udacity to learn about Git and GitHub.

  #### How should I submit solutions?
  We have maintained a folder for each problem. Make sure your file format is as follows:-
 ```bash
 Name : <insert your name>
 Year/Department : <insert year/insert department>
 Email Id : <insert your E-mail Id>

 /*insert your code here*/

 ```

 Rename your file as `Language_Username` and place it in the appropriate folder.

 #### I forked the repository but some questions were added only after that. How do I access those?
  Open Git Bash or you Command Prompt and navigate over to your forked repository. Enter the following commands:
  ```bash
  git remote add origin https://github.com/SVCE-HacktoberFest2019/AlgorithmsDaily.git
  git fetch origin
  git merge origin/master
  ```
  #### What do I do if I see a merge conflict?
This does not happen until you modify an existing file in the repository. The easiest thing to do is to make a copy of your code outside the repository and then clone it once again. Merge it to the `master` branch, add your code and continue contributing :).

  #### I believe there is a mistake/error in one or more of the questions.
  Open an [issue](https://github.com/SVCE-HacktoberFest2019/AlgorithmsDaily/issues) on the bug tracker and we will get back to you.
