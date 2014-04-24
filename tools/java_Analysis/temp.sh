#!/bin/bash 

value="Total Clones Found:  test-sub AAAAAAA real 0m0.451s user 0m0.020s sys 0m0.388s 00-README-NiCad3.txt BUGS.txt CHANGES-3.0.txt CHANGES-3.1.txt CHANGES-3.2.txt CHANGES-3.3.txt CHANGES-3.4.txt CHANGES-3.5.txt cleanall config examples fixspaces LICENSE.txt Makefile nicad3 nicad3cross QUESTIONS.txt runclones.sh scripts splitclasses tools txl Warning: 3 source files failed to parse real 0m0.078s user 0m0.004s sys 0m0.064s real 0m0.159s user 0m0.000s sys 0m0.148s ResultStart 9 ResultEnd BBBBBBBBBBBBBB"

# ValueX 9 ValueX

#echo $value
sed 's/^.*ResultStart //; s/ResultEnd.*$//' <<< $value 