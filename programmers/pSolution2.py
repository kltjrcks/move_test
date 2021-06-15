# -*- coding : utf-8 -*-
#두 정수 사이의 합
def solution(a, b):
    answer = 0
    count = 0

    if a == b:
        answer = a
    elif a < b:
        count = b - a + 1
        answer = (a + b) * count // 2
    else:
        count = a - b + 1
        answer = (a + b) * count // 2

    return answer

print(solution(5,3))