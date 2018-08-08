### Permutation (hoán vị) (not repetition)
Form: **P(n) = n!**  
Example:  

**P**(`1;2;3`) = {`1,2,3`; `1,3,2`; `2,1,3`; `2,3,1`; `3,1,2`, `3,2,1`} = 6 ways  
<=> P(3) = 3! 6

### Arrangement (chỉnh hợp) (not repetition)
Form: **A(k, n) = n!/(n-k)!**  
Example:  

**A**(3, `1;2;3`) = {`1,2,3`; `1,3,2`; `2,1,3`; `2,3,1`; `3,1,2`, `3,2,1`} = 6 ways (it exactly same to permutation, I think permutation is just a case of arrangement)  
<=> A(3,3) = 3!/(3-3)! = 3! = 6 (0! = 1)

**A**(2, `1;2;3`) = {`1,2`, `1,3`, `2,1`, `2,3`, `3,1`, `3,2`} = 6 ways  
<=> A(2,3) = 3!/(3-2)! = 3! = 6 (1! = 1)

**A**(1, `1;2;3`) = {`1`, `2`, `3`} = 3 ways  
<=> A(1,3) = 3!/(3-1)! = 3!/2! = 3

### Combination (tổ hợp) (not repetition)
Form: **C(k, n) = n!/k!*(n-k)!**  
Example:  

**C**(3,1;2;3) = {`1;2;3`} or {`1,3,2`} = 1 way (in combination, we don't care about the index)  
<=> C(3,3) = 3!/3!*(3-1)! = 3!/3! = 1

### Permutations with repetition (hoán vị lặp)
Form: **P(n) = n^n**

### Combination with repetition (chỉnh hợp lặp)
Form: **A(k, n) = n^k**
Example:
A(2, {1,2,3,4,5}) = 5*5 ways = 5^2

