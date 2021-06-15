# -*- coding : utf-8 -*-
# 평균 구하기
def solution(arr):
    answer = 0

    for i in arr:
        answer += i

    answer = answer / len(arr)

    return answer

s = [5,5]
print(solution(s))