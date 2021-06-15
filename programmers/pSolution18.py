# -*- coding : utf-8 -*-
#약수의 합
def solution(number):
    answer = 0
    for i in range(1, number+1):
        if number % i == 0:
            answer += i

    return answer


print(solution(12))