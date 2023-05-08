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
