# TDD-PasswordValidator
A program that prompts a user to enter a password and checks the strength of the provided password using **Test-Driven Development(TDD)**.

This program addresses the below requirements.

1. A password must be at least 12 characters long and can ONLY include the following.

. English alphabetic characters

 →Uppercase English characters ('A' through 'Z')

 →Lowercase English characters ('a' through 'z')

. Numbers 0 through 9

. Special characters: ~ ! @ # $ % ^ & * ( ) - _ = + [ ] { } \ | ; : ' " , < > / ?.

2. The program must check the validity of the user password as follows:

If the user password does not match the above criteria the program must print the message **"Invalid Password!"** and exit immediately.

3. The program must further check the strength of the password as follows:

. If the password is strong the program must print **"Strong password"** and exit with no further action.

. If the password is not strong, the program must print **"Weak password"** and exist with no further action.

. A user password is considered **strong** if ALL the following conditions apply

→ The password must be at least 14 characters long.

→ The password must use a combination of uppercase and lowercase characters.

→ The password must use a combination of numbers and special characters.

→ There must be at least 2 special characters.

→ There must be at least 6 alphabetic characters.

You can find further information about Test Driven Development(TDD) in my below Medium article.

https://medium.com/@asarakumarasena94/test-driven-development-tdd-from-principles-to-practical-implementation-f5439695d8f8



