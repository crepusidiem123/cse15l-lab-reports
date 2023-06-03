# Part 1 – Debugging Scenario

## Student's post

* What environment are you using?
  Windows 11 based on bash script

* Codes that encounter exception

<img width="619" alt="image" src="https://github.com/crepusidiem123/cse15l-lab-reports/assets/130092052/22b43427-2cd8-4bbf-8ec7-d8a27fe7c788">

  **Above is the shell script that I wrote.**

---

<img width="624" alt="image" src="https://github.com/crepusidiem123/cse15l-lab-reports/assets/130092052/c85a5901-b302-4cc4-8451-6b3b132fddd9">

  **Above is the command-line inputs and outputs.**

---

<img width="206" alt="image" src="https://github.com/crepusidiem123/cse15l-lab-reports/assets/130092052/d31361de-43a8-43b4-b1cd-1d1599ef4a97">

  **Above is the layout of the project.**

* My own conjecture

  For the second line in the shell script, it is not apt to have the "src/" in front of the test class. However, since it is in another directory, I cannot invoke by its class name either. So how am I supposed to do this?

## TA's Response

  Given that you are using a shell script, there's actually a way to bypass this issue, which is to add a `cd src` command right after the line of compilation, while correcting the relative path to those jUnits in the command that runs all the tests.

## Student's Follow Up
  > Modified test.sh
<img width="660" alt="image" src="https://github.com/crepusidiem123/cse15l-lab-reports/assets/130092052/72c3e0ae-fed1-4e9e-8fa4-659f76321e0c">

  > New terminal output
<img width="347" alt="image" src="https://github.com/crepusidiem123/cse15l-lab-reports/assets/130092052/47e38f35-e683-4cdc-a399-607f742955ea">


Thank you so much! It does fix my problem and I guess the bug is that I cannot call the java class outside its directory.

# Part 2 - Reflection

In the labs of the second half of CSE 15L, I learnt so much about debugging and the use of vim. I must give special thanks to Haitong, Brian, and Harry. Those three people have always being supportive to me, especially when I confront tons of issues that are sometimes hard or sometimes meaningless due to my lack of consideration. However, they are always patient and attentive, which makes my lab experience unique and valuable. Thank you so much!
