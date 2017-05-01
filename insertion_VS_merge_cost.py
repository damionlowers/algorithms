import math

def log2(x):
    return math.log(x) / math.log(2)


def insertion_merge_cost():
##Script test the value/s of n where insertion sort beats merge sort
##(test,insertion_value,merge_value,n)
    n = 1
    insertion_value = 0
    merge_value = 0

    while True:
        insertion_value = 8*(n**2)
        merge_value = 62*n*(log2(n))
        print (insertion_value < merge_value,insertion_value,merge_value,n)
        if n > 300:
            break
        n+=1


def n_sqrt_VS_2_pow_n():
## smallest value of n such that an algorithm whose running time is 100n^2
##runs faster than an algorithm whose running time is 2^n on the same machine     
    n=1
    nsqrt= 0
    pow_n = 0

    print "(nsqrt<pow_n,nsqrt,pow_n,n)"
    while True:
        nsqrt = 100*(n**2)
        pow_n = 2**n
        print (nsqrt<pow_n,nsqrt,pow_n,n)
        if n > 300:
            break
        n+=1
