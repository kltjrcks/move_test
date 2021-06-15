# -*- coding : utf-8 -*-
# 소수 찾기
def solution(n):
    answer = []
    for i in range(n):
        if i == 0:
            answer.append(1)
        else:
            answer.append(0)

    for p in range(2, n+1):
        for p2 in range(2, n+1):
            if p*p2 <= len(answer):
                answer[p*p2 - 1] = 1
            else:
                break

    count = 0
    for prime in answer:
        if prime == 0:
            count += 1
        else:
            pass

    return count


print(solution(5))