# MeerCode
## What is it?
This is a small quarter-year project created by a couple Meermans underlings.
### Alright, but what exactly is it?
Using Java, we created a simple programming language that can manipulate characters, numbers, and arrays.

## To programmers:
- **Don't add/commit every single file** please... This makes commit messages messy
- Make sure you have Gradle installed with an environmental variable set to its installation path
- Download GitKraken for easier git usage
### Benefits of GitKraken
- Super easy to resolve merge conflicts
- Super easy to commit/push (and it only commits files you've changed)
- etcetera

## Branches
- feature/branchName - adding new features; branch/merge -> dev
- dev/branchName - making base code; branch/merge -> master
- release/branchName - fixing bugs; branch -> dev; merge -> master/dev
- hotfix/branchName - urgent coding; branch -> master; merge -> master/dev

## Basic Code Format
### Variables
- `kVarName` - constant variables
- `mVarName` - field variables
- `pVarName` - parameter variables
- `VAR_NAME` - FINAL "variables"
#### Examples:
```
public class ExampleClass {
  //FINAL
  private FINAL Double ACCEL_GRAVITY = 9.80665;
  
  //Constant
  private ExampleClass kExampleClassFinal = this;
  
  //Field Variable
  private Number mExampleField;
  
  //Constructor
  public ExampleClass(Number pVarName) {
    mExampleField = pVarName;
  }
}
```
# Purpose
- We are making a scripting programming language to help beginner coders start basic high-level programming. 

## Structure
- Java
- interpreted
- scripting 
- no primitives
- static variables
- basic math
- input/output

### Datatypes
- Number (Integer/Double Hybrid)
- Letter
- List
- Coin (Boolean)
- Computer (system class)

### Keywords
- if/whatIf/ otherwise
- repeatWhile
- repeatCount

### Operators
- +,-, *, /, ^
- ==, !=, or, and
- is

## Syntax
### Basic Rules:
- Extra whitespace characters do not matter as fresh coders may accidentally hit an extra space or newline when int the process of learning
- Functions and variables of other libraries use Java's syntax where parentheses are func() and variables are Library.variable
### Examples:


# Collaborators
- Francis Adams
- Joseph Chang
- Kyle Robinson
