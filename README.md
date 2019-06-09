
Coding Challenge package

This is the Java implementation of the ZIP code simplification challenge.  The challenge package 
contains a util package with most of the logical components.  

The main entry class (ZipCodeRangeSimplifier)  takes in the input, parses it with ZipCodeParser,
 and processes that result with RangeListSimplifier.  
 ZipCodeRange is a model class holding the ranges (pairs of low,high zip codes).
 
RangeListSimplifier performs the simplification routine on the 

You can run the Unit tests from the command line as follows:

> java -jar jws-java-challenge.jar [94133,94133] [94200,94299] [94600,94699]

[94133,94133] [94200,94299] [94600,94699]
> java -jar jws-java-challenge.jar [94133,94133] [94200,94299] [94226,94399]
[94133,94133] [94200,94399]

The unit tests RangeListSimplifierTest.testChallengeFirstSampleValue and RangeListZImplifierTest.testChallengeSecondSampleValue
  also perform tests on the two input examples described in the challenge.ß



I did my coding in Eclipse, and used the simple Junit library for testing. 

Thanks for your consideration.  It's been a good exercise, and I look forward to speaking with you.
 
