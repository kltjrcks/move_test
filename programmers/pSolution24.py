# -*- coding : utf-8 -*-
# 정수 제곱근 판별
import math
def solution(n):
    num = math.sqrt(n)
    if num - int(num) == 0:
        return math.pow(num + 1, 2)

    else:
        return -1


print(solution(121))