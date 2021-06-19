# -*- coding : utf-8 -*-
# 예산
def solution(d, budget):
    d.sort()
    count = 0
    sum = 0
    for i in d:
        sum += i
        count += 1
        if sum > budget:
            count -= 1
            break
        if sum == budget:
            break
    return count



#print(solution([1,3,2,5,4],9))
print(solution([2,2,3,3],10))