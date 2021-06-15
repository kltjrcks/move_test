#-*- coding : utf-8 -*-

#같은 숫자는 싫어
def solution(arr):
    answer = list()
    lastValue = -1

    for i in arr:
        if lastValue == i:
            pass
        else:
            answer.append(i)
            lastValue = i

    return answer

arr = [4,4,4,3,3]
print(solution(arr))