# -*- coding : utf-8 -*-
# 실패율
def solution(n, stage):
    answer = list()
    er_dict = dict()
    for sn in range(1, n+1):
        notClearCount = 0
        clearCount = 0

        for s1 in stage:
            if s1 == sn:
                notClearCount += 1
            if s1 >= sn:
                clearCount += 1

        if clearCount == 0:
            errorRate = 0
        else:
            errorRate = notClearCount / clearCount
        er_dict[sn] = errorRate

    for li in sorted(er_dict.items(), reverse=True, key=lambda item:item[1]):
        answer.append(li[0])

    return answer


print(solution(5, [2,1,2,6,2,4,3,3]))