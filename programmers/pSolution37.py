# -*- coding : utf-8 -*-
#다음 큰 숫자
def solution(n):
    ori_count = bin_s(n)

    while True:
        n += 1
        toBe_count = bin_s(n)

        if ori_count == toBe_count:
            return n

def bin_s(number):
    bn = bin(number)
    s = str(bn)[2:]
    count = 0
    for c1 in s:
        if c1 == '1':
            count += 1

    return count


print(solution(78))