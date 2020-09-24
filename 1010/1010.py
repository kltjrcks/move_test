import sys

def fac(number):
    if number == 0:
        return 1

    mul = 1
    for n in range(1, number + 1):
        mul = mul*n

    return mul

def permutation(n, r):
    per = fac(n) / fac(n - r)

    return per

def combination(n, r):
    com = permutation(n, r) / fac(r)

    return com

loopCount = int(sys.stdin.readline().split()[0])


for lc in range(loopCount):

    n_m = list(sys.stdin.readline().split())

    print(fac(int(n_m[1])) // fac(int(n_m[1])-int(n_m[0])) // fac(int(n_m[0])))


#    result = combination(int(n_m[1]), int(n_m[0]))

    #print(result)
