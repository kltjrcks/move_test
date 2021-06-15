# -*- coding : utf-8 -*-
# 나누어 떨어지는 숫자 배열

def solution(arr, div):
    answer = list()
    for i in arr:
        if i % div == 0:
            answer.append(i)

    if len(answer) == 0:
        answer.append(-1)

    answer.sort()
    return answer


arr = [2, 36, 1, 3]
div = 1
print(solution(arr, div))
