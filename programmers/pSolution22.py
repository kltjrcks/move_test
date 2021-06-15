# -*- coding : utf-8 -*-
#제일 작은 수 제거하기
def solution(n):
    minn = min(n)
    n.remove(minn)

    if len(n) == 0:
        n.append(-1)

    return n

n1 = [4,3,2,1]
print(solution(n1))