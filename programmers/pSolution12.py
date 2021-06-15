# -*- coding : utf-8 -*-
#짝수와 홀수
def solution(num):
    answer = ''

    if num % 2 == 1:
        answer = "Odd"
    else:
        answer = "Even"

    return answer


print(solution(4))