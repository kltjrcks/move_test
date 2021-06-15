# -*- coding : utf-8 -*-
#문자열을 정수로 바꾸기
def solution(number):
    answer = 0

    if number[0].isnumeric():
        answer = int(number)
    else:
        if number[0] == '+':
            answer = int(number[1:])
        elif number[0] == '-':
            answer = -int(number[1:])

    return answer


print(solution("-1234"))