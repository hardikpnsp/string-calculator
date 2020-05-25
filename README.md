# string-calculator
A coding Kata for Test Driven Development in java [from here](https://osherove.com/tdd-kata-1)

# Build and run process
1. make sure maven is set up on machine
2. clone the repository
3. `cd string-calculator`

## Testing
`mvn test`

## Run CLI
`mvn exec:java`

# Usage
command line string caclulator performs Addition operation on a string.
- It supports simple addition of numbers seperated with delimiters `[',' or '\n']` by default
- for custom delimiters the input string can be prefixed with `//[delimiter1][delimiter2][...]...\n` syntax

Exapmple CLI usage
```
Enter String Sequence to calculate Addition: 
1,2,3
Answer: 6
```

```
Enter String Sequence to calculate Addition: 
//[**][%%]\n10**20%%30
Answer: 60
```

## Note:
- as instructed in the [kata](https://osherove.com/tdd-kata-1)
> StringCalculator ignores numbers > 1000  
> StringCalculator throws exception for negative numbers  
