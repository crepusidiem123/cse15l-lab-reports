# Lab Report 1

*This is a simplified version of tutorial about remote accessing divided into three parts to facilitate hands-on experiences with stage-based outputs.*

## Installing Visual Studio Code (VScode)

In order to download to Visual Studio Code (which will be refered as VScode thereafter), we would need to first go to its [website](https://code.visualstudio.com/) to download the corresponding version of it based on the current operating system. After installment, you'd be able to see a window like this if you open VScode:

![Image](VSCode.png)

Then you are all set to move on to the next section.

## Remote Connection

In order to have remote access, prerequisite is that the VScode is equipped with git bash. Refer to this tutorial to [set up the git bash for VScode](https://stackoverflow.com/questions/42606837/how-do-i-use-bash-on-windows-from-the-visual-studio-code-integrated-terminal/50527994#50527994).

Then, you would use ssh comand to connect to the ieng6 account. The format of ssh command shall be 

*ssh cs15lsp23zz@ieng6.ucsd.edu*

With which "zz" shall be adjusted to correspond to your own course-specific account, which could be looked up by [This Link](https://sdacs.ucsd.edu/~icc/index.php), and you are supposed to set up a password for this course-specific account as well, by which there's also a [tutorial](https://drive.google.com/file/d/17IDZn8Qq7Q0RkYMxdiIR0o6HJ3B5YqSW/view\).

With your VScode window open, use the Terminal → New Terminal menu option to create a new terminal, in which you will type in the ssh command shown above.

![Image](remote_control_1.png)

If this output above comes up on your laptop, don't panic and ask your instructor or TA immediately, as they may allow you to work on the computers in those labs on campus. Normally, the output shall be as follows:

![Image](remote_control_2.png)

Given this is not a screenshot based on its inablity to be reproduced, here's a screenshot of the output of a normal login after your first successful login:

<img width="401" alt="image" src="https://user-images.githubusercontent.com/130092052/233507583-c5929962-38a5-46b3-91d8-be10cc0c143f.png">

## Trying Commands Out!

Here are some commands for you to try out when you have successfully connected to the remote computer:

* cat <path1> <path2> ... - “Concatenate” Used to print the contents of one or more files given by the paths
* ls <path> - “List” Used to list the files and folders the given path
* pwd - “Print working directory” Used to display the current working directory
* cd <path> - “Change Directory” Used to switch the current working directory to the given path (without an argument, cd is equivalent to cd ~, which is the home directory)

In case any of you would be interested to see an error, an example would be to invoke a file that does not exist, which is also reflected through the set of commands below:
  
![Image](commands.jpg)
  
*That's all for the tutorial, now you are more than welcomed to navigate and explore this brave new world!*
