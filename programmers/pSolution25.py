# -*- coding : utf-8 -*-
# 최대공약수와 최소공배수
def solution(a, b):
    answer = []
    ansMin = 0
    ansMax = 0
    for i in range(1, a+1):
        if a % i == 0 and b % i == 0:
            ansMin = i
            ansMax = (a // i) * (b // i) * ansMin

    answer.append(ansMin)
    answer.append(ansMax)
    return answer


print(solution(3, 12))