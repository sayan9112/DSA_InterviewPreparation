//  question link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

// Given an array nums of integers, return how many of them contain an even number of digits

/* 
**logic to check a number contains even number of digits or not:**

1. convert the number into a string and check the string length is even or not.
    eg-
	```
 int i=200;  
String s=String.valueOf(i);  
```
2. literally couting the number of digits:
  ```
	count=0
while(n>0){
		count++;
		n=n/10;
		}
```


**logic to check a number is even or odd**

```
if (num%2==0){
return true;
}
else{
return false;
}
```




*/


//code starts here:

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for (int num: nums){
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 ==0;
    }
    int digits(int num){
        if (num<0){
            num=num* -1;
        }
        if (num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
