# -*- coding : utf-8 -*-
#자연수 뒤집어 배열로 만들기
def solution(number):
    answer = list()
    n = str(number)
    for i in n:
        answer.append(int(i))

    answer.reverse()

    return answer


print(solution(12345))