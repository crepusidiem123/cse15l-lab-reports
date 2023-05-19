# Lab Report 3

Our focus today - *grep* command and its command-line options (Credit to ChatGPT)

## Interaction with ChatGPT:
<img width="546" alt="image" src="https://github.com/crepusidiem123/cse15l-lab-reports/assets/130092052/f1a3621c-cf34-4bec-8a88-d85a13cbf50c">

* "-i": Ignore case distinctions in the pattern and input files. (Advised by ChatGPT, and I solely employed the command-line option to the usual grep parameters)
> Could be useful when there's different capitalizations of a certain phrase and we would want them all

`grep -i "in a different terminal" technical/911report/chapter-1.txt`

<img width="939" alt="image" src="https://user-images.githubusercontent.com/130092052/236884326-bbeac20e-0eb3-4696-b162-c7758e7353ce.png">

`grep -i "chapter 11" technical/911report/*`

<img width="856" alt="image" src="https://user-images.githubusercontent.com/130092052/236887048-a5afb034-ce5d-46fa-ac67-40eed9c86af9.png">

* "-r": Search for the pattern recursively in all files under the specified directory. (Advised by ChatGPT, and I employed the command-line option while changing the path of files to the path of directory to match up with its descriptions)
> Could be useful when we want to search for all the files under a directory, whilst being lazy to type out all the paths to each file.

`grep -r "chapter 11" technical/911report/`

<img width="777" alt="image" src="https://user-images.githubusercontent.com/130092052/236887744-93606a1c-d780-493d-b5f6-ba0aeabe5157.png">

`grep -r "In a different terminal" technical/911report/`

<img width="956" alt="image" src="https://user-images.githubusercontent.com/130092052/236887912-6615ebb7-663e-4960-b560-565b0fc82261.png">

* "-w": Match only whole words. (Advised by ChatGPT, and I solely employed the command-line option to the usual grep parameters)

`grep -w  "ifferent terminal" technical/911report/*`
> Could be useful when we only want a specific word while this word being a common part consituting other words.

<img width="941" alt="image" src="https://user-images.githubusercontent.com/130092052/236890127-5b239f1c-287f-4386-966f-92bf191428d1.png">

`grep -w  "man" technical/911report/Chapter-1.txt`

<img width="948" alt="image" src="https://user-images.githubusercontent.com/130092052/236888859-2a599f36-dbb0-4bf2-ad98-698a3853c1c9.png">

* "-n": Prefix each line of output with the line number within its input file. (Advised by ChatGPT, and I solely employed the command-line option to the usual grep parameters)
> Could be useful when we want to pinpoint the exact position of the matching so that we could use vim or some other text editor to make changes, or even solely to check for the context around.

`grep -n "arm" technical/911report/Chapter-1.txt`
Part of its output is shown below:

<img width="938" alt="image" src="https://user-images.githubusercontent.com/130092052/236890380-d14096aa-dbd0-4b7c-b148-976219078ef3.png">

`grep -n "ifferent terminal" technical/911report/*`

<img width="940" alt="image" src="https://user-images.githubusercontent.com/130092052/236890516-7fd6dc4b-1e3f-4313-bc1f-86734efd8873.png">
