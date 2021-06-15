# -*- coding : utf-8 -*-
#자릿수 더하기
def solution(number):
    answer = 0
    s_n = str(number)

    for i in s_n:
        answer += int(i)

    return answer


print(solution(123))