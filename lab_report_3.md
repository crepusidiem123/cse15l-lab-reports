# Lab Report 3

Our focus today - *grep* command and its command-line options

* "-i": Ignore case distinctions in the pattern and input files.

`grep -i "in a different terminal" technical/911report/chapter-1.txt`

<img width="939" alt="image" src="https://user-images.githubusercontent.com/130092052/236884326-bbeac20e-0eb3-4696-b162-c7758e7353ce.png">

`grep -i "chapter 11" technical/911report/*`

<img width="856" alt="image" src="https://user-images.githubusercontent.com/130092052/236887048-a5afb034-ce5d-46fa-ac67-40eed9c86af9.png">

* "-r": Search for the pattern recursively in all files under the specified directory.

`grep -r "chapter 11" technical/911report/`

<img width="777" alt="image" src="https://user-images.githubusercontent.com/130092052/236887744-93606a1c-d780-493d-b5f6-ba0aeabe5157.png">

`grep -r "In a different terminal" technical/911report/`

<img width="956" alt="image" src="https://user-images.githubusercontent.com/130092052/236887912-6615ebb7-663e-4960-b560-565b0fc82261.png">

* "-w": Match only whole words.

`grep -w  "ifferent terminal" technical/911report/*`

<img width="941" alt="image" src="https://user-images.githubusercontent.com/130092052/236890127-5b239f1c-287f-4386-966f-92bf191428d1.png">

`grep -w  "man" technical/911report/Chapter-1.txt`

<img width="948" alt="image" src="https://user-images.githubusercontent.com/130092052/236888859-2a599f36-dbb0-4bf2-ad98-698a3853c1c9.png">

* "-n": Prefix each line of output with the line number within its input file.

`grep -n "arm" technical/911report/Chapter-1.txt`
Part of its output is shown below:
<img width="938" alt="image" src="https://user-images.githubusercontent.com/130092052/236890380-d14096aa-dbd0-4b7c-b148-976219078ef3.png">

`grep -n "ifferent terminal" technical/911report/*`

<img width="940" alt="image" src="https://user-images.githubusercontent.com/130092052/236890516-7fd6dc4b-1e3f-4313-bc1f-86734efd8873.png">
