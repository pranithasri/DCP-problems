
 '''
This problem was asked by Jane Street.

cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

Given this implementation of cons:

def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
Implement car and cdr.
'''
 ##time and space complexity O(1)
def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
def car(a1):
    def left(a, b):
        return a
    return a1(left)
def cdr(a1):
    def left(a, b):
        return b
    return a1(left)
c,d=map(int,input().split(","))
print(car(cons(c,d)))
print(cdr(cons(c,d)))
